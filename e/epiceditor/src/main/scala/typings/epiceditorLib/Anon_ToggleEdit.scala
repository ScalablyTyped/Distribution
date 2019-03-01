package typings
package epiceditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToggleEdit extends js.Object {
  var toggleEdit: java.lang.String
  var toggleFullscreen: java.lang.String
  var togglePreview: java.lang.String
}

object Anon_ToggleEdit {
  @scala.inline
  def apply(toggleEdit: java.lang.String, toggleFullscreen: java.lang.String, togglePreview: java.lang.String): Anon_ToggleEdit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toggleEdit")(toggleEdit)
    __obj.updateDynamic("toggleFullscreen")(toggleFullscreen)
    __obj.updateDynamic("togglePreview")(togglePreview)
    __obj.asInstanceOf[Anon_ToggleEdit]
  }
}

