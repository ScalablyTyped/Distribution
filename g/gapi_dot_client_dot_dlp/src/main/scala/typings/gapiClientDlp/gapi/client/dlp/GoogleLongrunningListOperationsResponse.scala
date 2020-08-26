package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleLongrunningListOperationsResponse extends js.Object {
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** A list of operations that matches the specified filter in the request. */
  var operations: js.UndefOr[js.Array[GoogleLongrunningOperation]] = js.native
}

object GoogleLongrunningListOperationsResponse {
  @scala.inline
  def apply(): GoogleLongrunningListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleLongrunningListOperationsResponse]
  }
  @scala.inline
  implicit class GoogleLongrunningListOperationsResponseOps[Self <: GoogleLongrunningListOperationsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setOperationsVarargs(value: GoogleLongrunningOperation*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[GoogleLongrunningOperation]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
  }
  
}

