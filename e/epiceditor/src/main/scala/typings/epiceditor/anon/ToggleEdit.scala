package typings.epiceditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleEdit extends js.Object {
  var toggleEdit: String = js.native
  var toggleFullscreen: String = js.native
  var togglePreview: String = js.native
}

object ToggleEdit {
  @scala.inline
  def apply(toggleEdit: String, toggleFullscreen: String, togglePreview: String): ToggleEdit = {
    val __obj = js.Dynamic.literal(toggleEdit = toggleEdit.asInstanceOf[js.Any], toggleFullscreen = toggleFullscreen.asInstanceOf[js.Any], togglePreview = togglePreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleEdit]
  }
  @scala.inline
  implicit class ToggleEditOps[Self <: ToggleEdit] (val x: Self) extends AnyVal {
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
    def setToggleEdit(value: String): Self = this.set("toggleEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def setToggleFullscreen(value: String): Self = this.set("toggleFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setTogglePreview(value: String): Self = this.set("togglePreview", value.asInstanceOf[js.Any])
  }
  
}

