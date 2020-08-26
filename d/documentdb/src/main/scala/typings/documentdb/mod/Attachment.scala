package typings.documentdb.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment
  extends /** Other properties */
/* name */ StringDictionary[js.Any] {
  /** The MIME contentType of the attachment. */
  var contentType: String = js.native
  /** Media link associated with the attachment content. */
  var media: String = js.native
}

object Attachment {
  @scala.inline
  def apply(contentType: String, media: String): Attachment = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
  }
  
}

