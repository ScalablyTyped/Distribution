package typings.documentdb.documentdbMod

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
    val __obj = js.Dynamic.literal(_self = _self, _ts = _ts, contentType = contentType, id = id, media = media)
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_etag != null) __obj.updateDynamic("_etag")(_etag)
    if (_rid != null) __obj.updateDynamic("_rid")(_rid)
    __obj.asInstanceOf[AttachmentMeta]
  }
}

