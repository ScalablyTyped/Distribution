package typings
package electronDashDevtoolsDashInstallerLib.electronDashDevtoolsDashInstallerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionReference extends js.Object {
  var electron: java.lang.String
  var id: java.lang.String
}

object ExtensionReference {
  @scala.inline
  def apply(electron: java.lang.String, id: java.lang.String): ExtensionReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("electron")(electron)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ExtensionReference]
  }
}

