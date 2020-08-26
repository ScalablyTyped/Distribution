package typings.dropboxjs.Dropbox.File

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyReference extends js.Object {
  var expiresAt: Date = js.native
  var tag: String = js.native
  def toJSON(): js.Object = js.native
}

object CopyReference {
  @scala.inline
  def apply(expiresAt: Date, tag: String, toJSON: () => js.Object): CopyReference = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[CopyReference]
  }
  @scala.inline
  implicit class CopyReferenceOps[Self <: CopyReference] (val x: Self) extends AnyVal {
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
    def setExpiresAt(value: Date): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Object): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

