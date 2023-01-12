package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBatch
  extends StObject
     with IObservable {
  
  /** [Method] Adds a new operation to this batch at the end of the operations array
    * @param operation Object The Operation object
    * @returns Ext.data.Batch this
    */
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoStart: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Number) */
  var current: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Ext.data.Operation[]) */
  var exceptions: js.UndefOr[Array] = js.undefined
  
  /** [Property] (Boolean) */
  var hasException: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var isComplete: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var isRunning: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Ext.data.Operation[]) */
  var operations: js.UndefOr[Array] = js.undefined
  
  /** [Method] Pauses execution of the batch but does not cancel the current operation
    * @returns Ext.data.Batch this
    */
  var pause: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var pauseOnException: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Kicks off execution of the batch continuing from the current operation
    * @returns Ext.data.Batch this
    */
  var retry: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Executes an operation by its numeric index in the operations array
    * @param index Number The operation index to run
    * @returns Ext.data.Batch this
    */
  var runOperation: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.undefined
  
  /** [Method] Kicks off execution of the batch continuing from the next operation if the previous operation encountered an excepti
    * @param index Object
    * @returns Ext.data.Batch this
    */
  var start: js.UndefOr[js.Function1[/* index */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Property] (Number) */
  var total: js.UndefOr[Double] = js.undefined
}
object IBatch {
  
  inline def apply(): IBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBatch] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: /* operation */ js.UndefOr[Any] => IBatch): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setExceptions(value: Array): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
    
    inline def setExceptionsUndefined: Self = StObject.set(x, "exceptions", js.undefined)
    
    inline def setHasException(value: Boolean): Self = StObject.set(x, "hasException", value.asInstanceOf[js.Any])
    
    inline def setHasExceptionUndefined: Self = StObject.set(x, "hasException", js.undefined)
    
    inline def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
    
    inline def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
    
    inline def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
    
    inline def setIsRunningUndefined: Self = StObject.set(x, "isRunning", js.undefined)
    
    inline def setOperations(value: Array): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setPause(value: () => IBatch): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPauseOnException(value: Boolean): Self = StObject.set(x, "pauseOnException", value.asInstanceOf[js.Any])
    
    inline def setPauseOnExceptionUndefined: Self = StObject.set(x, "pauseOnException", js.undefined)
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setRetry(value: () => IBatch): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setRunOperation(value: /* index */ js.UndefOr[Double] => IBatch): Self = StObject.set(x, "runOperation", js.Any.fromFunction1(value))
    
    inline def setRunOperationUndefined: Self = StObject.set(x, "runOperation", js.undefined)
    
    inline def setStart(value: /* index */ js.UndefOr[Any] => IBatch): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
