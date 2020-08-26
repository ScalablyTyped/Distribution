package typings.gapiClientScript.gapi.client.script

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  /**
    * This field is only used with asynchronous executions and indicates whether or not the script execution has completed. A completed execution has a
    * populated response field containing the `ExecutionResponse` from function that was executed.
    */
  var done: js.UndefOr[Boolean] = js.native
  /**
    * If a `run` call succeeds but the script function (or Apps Script itself) throws an exception, this field will contain a `Status` object. The `Status`
    * object's `details` field will contain an array with a single `ExecutionError` object that provides information about the nature of the error.
    */
  var error: js.UndefOr[Status] = js.native
  /** This field is not used. */
  var metadata: js.UndefOr[Record[String, _]] = js.native
  /**
    * If the script function returns successfully, this field will contain an `ExecutionResponse` object with the function's return value as the object's
    * `result` field.
    */
  var response: js.UndefOr[Record[String, _]] = js.native
}

object Operation {
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setError(value: Status): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMetadata(value: Record[String, _]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setResponse(value: Record[String, _]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

