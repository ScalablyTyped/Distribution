package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOperation extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.native
  /** [Property] (RegExp) */
  var actionCommitRecordsRe: js.UndefOr[RegExp] = js.native
  /** [Property] (RegExp) */
  var actionSkipSyncRe: js.UndefOr[RegExp] = js.native
  /** [Method] Checks whether this operation should cause writing to occur
    * @returns Boolean Whether the operation should cause a write to occur.
    */
  var allowWrite: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Ext.data.Batch) */
  var batch: js.UndefOr[IBatch] = js.native
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.native
  /** [Method] This method is called to commit data to this instance s records given the records in the server response
    * @param serverRecords Ext.data.Model[] An array of Ext.data.Model objects returned by the server.
    */
  var commitRecords: js.UndefOr[js.Function1[/* serverRecords */ js.UndefOr[Array], Unit]] = js.native
  /** [Config Option] (Ext.util.Filter[]) */
  var filters: js.UndefOr[Array] = js.native
  /** [Method] Returns the error string or object that was set using setException
    * @returns String/Object The error object
    */
  var getError: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the records associated with this operation
    * @returns Ext.data.Model[]
    */
  var getRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the ResultSet object if set by the Proxy
    * @returns Ext.data.ResultSet The ResultSet object
    */
  var getResultSet: js.UndefOr[js.Function0[IResultSet]] = js.native
  /** [Config Option] (Ext.util.Grouper[]) */
  var groupers: js.UndefOr[Array] = js.native
  /** [Method] Returns true if this Operation encountered an exception see also getError
    * @returns Boolean True if there was an exception
    */
  var hasException: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been completed
    * @returns Boolean True if the Operation is complete
    */
  var isComplete: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been started but has not yet completed
    * @returns Boolean True if the Operation is currently running
    */
  var isRunning: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been started
    * @returns Boolean True if the Operation has started
    */
  var isStarted: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Marks the Operation as completed  */
  var setCompleted: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Marks the Operation as having experienced an exception
    * @param error String/Object error string/object
    */
  var setException: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Marks the Operation as started  */
  var setStarted: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Marks the Operation as successful  */
  var setSuccessful: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Ext.util.Sorter[]) */
  var sorters: js.UndefOr[Array] = js.native
  /** [Config Option] (Number) */
  var start: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var synchronous: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true if the Operation has completed and was successful
    * @returns Boolean True if successful
    */
  var wasSuccessful: js.UndefOr[js.Function0[Boolean]] = js.native
}

object IOperation {
  @scala.inline
  def apply(): IOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperation]
  }
  @scala.inline
  implicit class IOperationOps[Self <: IOperation] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setActionCommitRecordsRe(value: RegExp): Self = this.set("actionCommitRecordsRe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionCommitRecordsRe: Self = this.set("actionCommitRecordsRe", js.undefined)
    @scala.inline
    def setActionSkipSyncRe(value: RegExp): Self = this.set("actionSkipSyncRe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionSkipSyncRe: Self = this.set("actionSkipSyncRe", js.undefined)
    @scala.inline
    def setAllowWrite(value: () => Boolean): Self = this.set("allowWrite", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAllowWrite: Self = this.set("allowWrite", js.undefined)
    @scala.inline
    def setBatch(value: IBatch): Self = this.set("batch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    @scala.inline
    def setCallback(value: js.Any): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCommitRecords(value: /* serverRecords */ js.UndefOr[Array] => Unit): Self = this.set("commitRecords", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCommitRecords: Self = this.set("commitRecords", js.undefined)
    @scala.inline
    def setFilters(value: Array): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setGetError(value: () => _): Self = this.set("getError", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetError: Self = this.set("getError", js.undefined)
    @scala.inline
    def setGetRecords(value: () => Array): Self = this.set("getRecords", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRecords: Self = this.set("getRecords", js.undefined)
    @scala.inline
    def setGetResultSet(value: () => IResultSet): Self = this.set("getResultSet", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetResultSet: Self = this.set("getResultSet", js.undefined)
    @scala.inline
    def setGroupers(value: Array): Self = this.set("groupers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupers: Self = this.set("groupers", js.undefined)
    @scala.inline
    def setHasException(value: () => Boolean): Self = this.set("hasException", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasException: Self = this.set("hasException", js.undefined)
    @scala.inline
    def setIsComplete(value: () => Boolean): Self = this.set("isComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsComplete: Self = this.set("isComplete", js.undefined)
    @scala.inline
    def setIsRunning(value: () => Boolean): Self = this.set("isRunning", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsRunning: Self = this.set("isRunning", js.undefined)
    @scala.inline
    def setIsStarted(value: () => Boolean): Self = this.set("isStarted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsStarted: Self = this.set("isStarted", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSetCompleted(value: () => Unit): Self = this.set("setCompleted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetCompleted: Self = this.set("setCompleted", js.undefined)
    @scala.inline
    def setSetException(value: /* error */ js.UndefOr[js.Any] => Unit): Self = this.set("setException", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetException: Self = this.set("setException", js.undefined)
    @scala.inline
    def setSetStarted(value: () => Unit): Self = this.set("setStarted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetStarted: Self = this.set("setStarted", js.undefined)
    @scala.inline
    def setSetSuccessful(value: () => Unit): Self = this.set("setSuccessful", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetSuccessful: Self = this.set("setSuccessful", js.undefined)
    @scala.inline
    def setSorters(value: Array): Self = this.set("sorters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorters: Self = this.set("sorters", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setSynchronous(value: Boolean): Self = this.set("synchronous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronous: Self = this.set("synchronous", js.undefined)
    @scala.inline
    def setWasSuccessful(value: () => Boolean): Self = this.set("wasSuccessful", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWasSuccessful: Self = this.set("wasSuccessful", js.undefined)
  }
  
}

