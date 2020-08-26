package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentMeta
  extends Attachment
     with AbstractMeta

object AttachmentMeta {
  @scala.inline
  def apply(_self: String, _ts: Double, contentType: String, id: String, media: String): AttachmentMeta = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentMeta]
  }
}

