package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyAttachmentsRequest extends js.Object {
  var addAttachments: js.UndefOr[js.Array[Attachment]] = js.undefined
}

object ModifyAttachmentsRequest {
  @scala.inline
  def apply(addAttachments: js.Array[Attachment] = null): ModifyAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    if (addAttachments != null) __obj.updateDynamic("addAttachments")(addAttachments)
    __obj.asInstanceOf[ModifyAttachmentsRequest]
  }
}

