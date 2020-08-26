package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetId extends js.Object {
  /** The ID of the file that this shortcut points to. */
  var targetId: js.UndefOr[String] = js.native
  /**
    * The MIME type of the file that this shortcut points to. The value of this field is a snapshot of the target's MIME type, captured when the shortcut is
    * created.
    */
  var targetMimeType: js.UndefOr[String] = js.native
}

object TargetId {
  @scala.inline
  def apply(): TargetId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetId]
  }
  @scala.inline
  implicit class TargetIdOps[Self <: TargetId] (val x: Self) extends AnyVal {
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
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
    @scala.inline
    def setTargetMimeType(value: String): Self = this.set("targetMimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetMimeType: Self = this.set("targetMimeType", js.undefined)
  }
  
}

