package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentMeta
  extends Attachment
     with AbstractMeta

object AttachmentMeta {
  @scala.inline
  def apply(
    _self: String,
    _ts: Double,
    contentType: String,
    id: String,
    media: String,
    _attachments: String = null,
    _etag: String = null,
    _rid: String = null
  ): AttachmentMeta = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments.asInstanceOf[js.Any])
    if (_etag != null) __obj.updateDynamic("_etag")(_etag.asInstanceOf[js.Any])
    if (_rid != null) __obj.updateDynamic("_rid")(_rid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentMeta]
  }
}

