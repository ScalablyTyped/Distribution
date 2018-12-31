package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDevToolsOptions extends js.Object {
  /**
    * Opens the devtools with specified dock state, can be right, bottom, undocked,
    * detach. Defaults to last used dock state. In undocked mode it's possible to dock
    * back. In detach mode it's not.
    */
  var mode: electronLib.electronLibStrings.right | electronLib.electronLibStrings.bottom | electronLib.electronLibStrings.undocked | electronLib.electronLibStrings.detach
}

