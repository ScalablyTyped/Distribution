package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateDocumentRequest extends js.Object {
  var requests: js.UndefOr[js.Array[Request]] = js.undefined
  var writeControl: js.UndefOr[WriteControl] = js.undefined
}

object BatchUpdateDocumentRequest {
  @scala.inline
  def apply(requests: js.Array[Request] = null, writeControl: WriteControl = null): BatchUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests)
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl)
    __obj.asInstanceOf[BatchUpdateDocumentRequest]
  }
}

