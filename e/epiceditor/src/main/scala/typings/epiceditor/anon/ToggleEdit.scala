package typings.epiceditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleEdit extends js.Object {
  var toggleEdit: String
  var toggleFullscreen: String
  var togglePreview: String
}

object ToggleEdit {
  @scala.inline
  def apply(toggleEdit: String, toggleFullscreen: String, togglePreview: String): ToggleEdit = {
    val __obj = js.Dynamic.literal(toggleEdit = toggleEdit.asInstanceOf[js.Any], toggleFullscreen = toggleFullscreen.asInstanceOf[js.Any], togglePreview = togglePreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleEdit]
  }
}

