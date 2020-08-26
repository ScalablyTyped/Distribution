package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MimeType extends js.Object {
  /** The MIME type of the quoted content. */
  var mimeType: js.UndefOr[String] = js.native
  /** The quoted content itself. This is interpreted as plain text if set through the API. */
  var value: js.UndefOr[String] = js.native
}

object MimeType {
  @scala.inline
  def apply(): MimeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimeType]
  }
  @scala.inline
  implicit class MimeTypeOps[Self <: MimeType] (val x: Self) extends AnyVal {
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
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

