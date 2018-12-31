package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewWindowEvent extends Event {
  /**
    * Can be `default`, `foreground-tab`, `background-tab`, `new-window`,
    * `save-to-disk` and `other`.
    */
  var disposition: electronLib.electronLibStrings.default | electronLib.electronLibStrings.`foreground-tab` | electronLib.electronLibStrings.`background-tab` | electronLib.electronLibStrings.`new-window` | electronLib.electronLibStrings.`save-to-disk` | electronLib.electronLibStrings.other = js.native
  var frameName: java.lang.String = js.native
  /**
    * The options which should be used for creating the new .
    */
  var options: Options = js.native
  var url: java.lang.String = js.native
}

