package typings.epiceditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToggleEdit extends js.Object {
  var toggleEdit: String
  var toggleFullscreen: String
  var togglePreview: String
}

object AnonToggleEdit {
  @scala.inline
  def apply(toggleEdit: String, toggleFullscreen: String, togglePreview: String): AnonToggleEdit = {
    val __obj = js.Dynamic.literal(toggleEdit = toggleEdit.asInstanceOf[js.Any], toggleFullscreen = toggleFullscreen.asInstanceOf[js.Any], togglePreview = togglePreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToggleEdit]
  }
}

