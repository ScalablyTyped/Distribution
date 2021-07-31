package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOperation
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.undefined
  
  /** [Property] (RegExp) */
  var actionCommitRecordsRe: js.UndefOr[RegExp] = js.undefined
  
  /** [Property] (RegExp) */
  var actionSkipSyncRe: js.UndefOr[RegExp] = js.undefined
  
  /** [Method] Checks whether this operation should cause writing to occur
    * @returns Boolean Whether the operation should cause a write to occur.
    */
  var allowWrite: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Ext.data.Batch) */
  var batch: js.UndefOr[IBatch] = js.undefined
  
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] This method is called to commit data to this instance s records given the records in the server response
    * @param serverRecords Ext.data.Model[] An array of Ext.data.Model objects returned by the server.
    */
  var commitRecords: js.UndefOr[js.Function1[/* serverRecords */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Config Option] (Ext.util.Filter[]) */
  var filters: js.UndefOr[Array] = js.undefined
  
  /** [Method] Returns the error string or object that was set using setException
    * @returns String/Object The error object
    */
  var getError: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the records associated with this operation
    * @returns Ext.data.Model[]
    */
  var getRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the ResultSet object if set by the Proxy
    * @returns Ext.data.ResultSet The ResultSet object
    */
  var getResultSet: js.UndefOr[js.Function0[IResultSet]] = js.undefined
  
  /** [Config Option] (Ext.util.Grouper[]) */
  var groupers: js.UndefOr[Array] = js.undefined
  
  /** [Method] Returns true if this Operation encountered an exception see also getError
    * @returns Boolean True if there was an exception
    */
  var hasException: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns true if the Operation has been completed
    * @returns Boolean True if the Operation is complete
    */
  var isComplete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns true if the Operation has been started but has not yet completed
    * @returns Boolean True if the Operation is currently running
    */
  var isRunning: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns true if the Operation has been started
    * @returns Boolean True if the Operation has started
    */
  var isStarted: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Marks the Operation as completed  */
  var setCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Marks the Operation as having experienced an exception
    * @param error String/Object error string/object
    */
  var setException: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Marks the Operation as started  */
  var setStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Marks the Operation as successful  */
  var setSuccessful: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Ext.util.Sorter[]) */
  var sorters: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (Number) */
  var start: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var synchronous: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns true if the Operation has completed and was successful
    * @returns Boolean True if successful
    */
  var wasSuccessful: js.UndefOr[js.Function0[Boolean]] = js.undefined
}
object IOperation {
  
  @scala.inline
  def apply(): IOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperation]
  }
  
  @scala.inline
  implicit class IOperationMutableBuilder[Self <: IOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionCommitRecordsRe(value: RegExp): Self = StObject.set(x, "actionCommitRecordsRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionCommitRecordsReUndefined: Self = StObject.set(x, "actionCommitRecordsRe", js.undefined)
    
    @scala.inline
    def setActionSkipSyncRe(value: RegExp): Self = StObject.set(x, "actionSkipSyncRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionSkipSyncReUndefined: Self = StObject.set(x, "actionSkipSyncRe", js.undefined)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAllowWrite(value: () => Boolean): Self = StObject.set(x, "allowWrite", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllowWriteUndefined: Self = StObject.set(x, "allowWrite", js.undefined)
    
    @scala.inline
    def setBatch(value: IBatch): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setCallback(value: js.Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCommitRecords(value: /* serverRecords */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "commitRecords", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommitRecordsUndefined: Self = StObject.set(x, "commitRecords", js.undefined)
    
    @scala.inline
    def setFilters(value: Array): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setGetError(value: () => js.Any): Self = StObject.set(x, "getError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorUndefined: Self = StObject.set(x, "getError", js.undefined)
    
    @scala.inline
    def setGetRecords(value: () => Array): Self = StObject.set(x, "getRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecordsUndefined: Self = StObject.set(x, "getRecords", js.undefined)
    
    @scala.inline
    def setGetResultSet(value: () => IResultSet): Self = StObject.set(x, "getResultSet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResultSetUndefined: Self = StObject.set(x, "getResultSet", js.undefined)
    
    @scala.inline
    def setGroupers(value: Array): Self = StObject.set(x, "groupers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupersUndefined: Self = StObject.set(x, "groupers", js.undefined)
    
    @scala.inline
    def setHasException(value: () => Boolean): Self = StObject.set(x, "hasException", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasExceptionUndefined: Self = StObject.set(x, "hasException", js.undefined)
    
    @scala.inline
    def setIsComplete(value: () => Boolean): Self = StObject.set(x, "isComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
    
    @scala.inline
    def setIsRunning(value: () => Boolean): Self = StObject.set(x, "isRunning", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRunningUndefined: Self = StObject.set(x, "isRunning", js.undefined)
    
    @scala.inline
    def setIsStarted(value: () => Boolean): Self = StObject.set(x, "isStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsStartedUndefined: Self = StObject.set(x, "isStarted", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSetCompleted(value: () => Unit): Self = StObject.set(x, "setCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCompletedUndefined: Self = StObject.set(x, "setCompleted", js.undefined)
    
    @scala.inline
    def setSetException(value: /* error */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setException", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExceptionUndefined: Self = StObject.set(x, "setException", js.undefined)
    
    @scala.inline
    def setSetStarted(value: () => Unit): Self = StObject.set(x, "setStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetStartedUndefined: Self = StObject.set(x, "setStarted", js.undefined)
    
    @scala.inline
    def setSetSuccessful(value: () => Unit): Self = StObject.set(x, "setSuccessful", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSuccessfulUndefined: Self = StObject.set(x, "setSuccessful", js.undefined)
    
    @scala.inline
    def setSorters(value: Array): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
    
    @scala.inline
    def setWasSuccessful(value: () => Boolean): Self = StObject.set(x, "wasSuccessful", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWasSuccessfulUndefined: Self = StObject.set(x, "wasSuccessful", js.undefined)
  }
}
