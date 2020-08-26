package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBatch extends IObservable {
  /** [Method] Adds a new operation to this batch at the end of the operations array
    * @param operation Object The Operation object
    * @returns Ext.data.Batch this
    */
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Config Option] (Boolean) */
  var autoStart: js.UndefOr[Boolean] = js.native
  /** [Property] (Number) */
  var current: js.UndefOr[Double] = js.native
  /** [Property] (Ext.data.Operation[]) */
  var exceptions: js.UndefOr[Array] = js.native
  /** [Property] (Boolean) */
  var hasException: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isComplete: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isRunning: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.data.Operation[]) */
  var operations: js.UndefOr[Array] = js.native
  /** [Method] Pauses execution of the batch but does not cancel the current operation
    * @returns Ext.data.Batch this
    */
  var pause: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Boolean) */
  var pauseOnException: js.UndefOr[Boolean] = js.native
  /** [Method] Kicks off execution of the batch continuing from the current operation
    * @returns Ext.data.Batch this
    */
  var retry: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Executes an operation by its numeric index in the operations array
    * @param index Number The operation index to run
    * @returns Ext.data.Batch this
    */
  var runOperation: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Kicks off execution of the batch continuing from the next operation if the previous operation encountered an excepti
    * @param index Object
    * @returns Ext.data.Batch this
    */
  var start: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Property] (Number) */
  var total: js.UndefOr[Double] = js.native
}

object IBatch {
  @scala.inline
  def apply(): IBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatch]
  }
  @scala.inline
  implicit class IBatchOps[Self <: IBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: /* operation */ js.UndefOr[js.Any] => IBatch): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setExceptions(value: Array): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExceptions: Self = this.set("exceptions", js.undefined)
    @scala.inline
    def setHasException(value: Boolean): Self = this.set("hasException", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasException: Self = this.set("hasException", js.undefined)
    @scala.inline
    def setIsComplete(value: Boolean): Self = this.set("isComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsComplete: Self = this.set("isComplete", js.undefined)
    @scala.inline
    def setIsRunning(value: Boolean): Self = this.set("isRunning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRunning: Self = this.set("isRunning", js.undefined)
    @scala.inline
    def setOperations(value: Array): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    @scala.inline
    def setPause(value: () => IBatch): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setPauseOnException(value: Boolean): Self = this.set("pauseOnException", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnException: Self = this.set("pauseOnException", js.undefined)
    @scala.inline
    def setRetry(value: () => IBatch): Self = this.set("retry", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setRunOperation(value: /* index */ js.UndefOr[Double] => IBatch): Self = this.set("runOperation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRunOperation: Self = this.set("runOperation", js.undefined)
    @scala.inline
    def setStart(value: /* index */ js.UndefOr[js.Any] => IBatch): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

