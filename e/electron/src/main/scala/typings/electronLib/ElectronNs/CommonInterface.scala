package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonInterface extends js.Object {
  var clipboard: Clipboard
  var crashReporter: CrashReporter
  var nativeImage: electronLib.Anon_Buffer
  var screen: Screen
  var shell: Shell
}

object CommonInterface {
  @scala.inline
  def apply(
    clipboard: Clipboard,
    crashReporter: CrashReporter,
    nativeImage: electronLib.Anon_Buffer,
    screen: Screen,
    shell: Shell
  ): CommonInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clipboard")(clipboard)
    __obj.updateDynamic("crashReporter")(crashReporter)
    __obj.updateDynamic("nativeImage")(nativeImage)
    __obj.updateDynamic("screen")(screen)
    __obj.updateDynamic("shell")(shell)
    __obj.asInstanceOf[CommonInterface]
  }
}

