package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Attachments. This is the response from the server to GET requests
  * on the attachments collection.
  */
@js.native
trait Schema$AttachmentsListResponse extends js.Object {
  /**
    * The list of attachments.
    */
  var items: js.UndefOr[js.Array[Schema$Attachment]] = js.native
  /**
    * The type of resource. This is always mirror#attachmentsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AttachmentsListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$Attachment] = null, kind: String = null): Schema$AttachmentsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AttachmentsListResponse]
  }
}

