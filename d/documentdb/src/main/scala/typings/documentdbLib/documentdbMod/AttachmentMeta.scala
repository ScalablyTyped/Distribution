package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentMeta
  extends Attachment
     with AbstractMeta

object AttachmentMeta {
  @scala.inline
  def apply(
    _self: java.lang.String,
    _ts: scala.Double,
    contentType: java.lang.String,
    id: java.lang.String,
    media: java.lang.String,
    _attachments: java.lang.String = null,
    _etag: java.lang.String = null,
    _rid: java.lang.String = null
  ): AttachmentMeta = {
    val __obj = js.Dynamic.literal(_self = _self, _ts = _ts, contentType = contentType, id = id, media = media)
    if (_attachments != null) __obj.updateDynamic("_attachments")(_attachments)
    if (_etag != null) __obj.updateDynamic("_etag")(_etag)
    if (_rid != null) __obj.updateDynamic("_rid")(_rid)
    __obj.asInstanceOf[AttachmentMeta]
  }
}

