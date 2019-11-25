package typings.electronDashDevtoolsDashInstaller.electronDashDevtoolsDashInstallerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionReference extends js.Object {
  var electron: String
  var id: String
}

object ExtensionReference {
  @scala.inline
  def apply(electron: String, id: String): ExtensionReference = {
    val __obj = js.Dynamic.literal(electron = electron.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionReference]
  }
}

