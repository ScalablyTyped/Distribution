package typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsListResponse extends js.Object {
  var items: js.UndefOr[js.Array[Attachment]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object AttachmentsListResponse {
  @scala.inline
  def apply(items: js.Array[Attachment] = null, kind: String = null): AttachmentsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsListResponse]
  }
}

