package typings.gapiClientDlp.gapi.client.dlp

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleLongrunningOperation extends js.Object {
  /**
    * If the value is `false`, it means the operation is still in progress.
    * If `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[Boolean] = js.native
  /** The error result of the operation in case of failure or cancellation. */
  var error: js.UndefOr[GoogleRpcStatus] = js.native
  /**
    * This field will contain an InspectOperationMetadata object for `inspect.operations.create` or a RiskAnalysisOperationMetadata object for
    * `dataSource.analyze`.  This will always be returned with the Operation.
    */
  var metadata: js.UndefOr[Record[String, _]] = js.native
  /** The server-assigned name. The `name` should have the format of `inspect/operations/<identifier>`. */
  var name: js.UndefOr[String] = js.native
  /**
    * This field will contain an InspectOperationResult object for `inspect.operations.create` or a RiskAnalysisOperationResult object for
    * `dataSource.analyze`.
    */
  var response: js.UndefOr[Record[String, _]] = js.native
}

object GoogleLongrunningOperation {
  @scala.inline
  def apply(): GoogleLongrunningOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleLongrunningOperation]
  }
  @scala.inline
  implicit class GoogleLongrunningOperationOps[Self <: GoogleLongrunningOperation] (val x: Self) extends AnyVal {
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
    def setError(value: GoogleRpcStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMetadata(value: Record[String, _]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResponse(value: Record[String, _]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

