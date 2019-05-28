package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonInterface extends js.Object {
  var clipboard: Clipboard
  var crashReporter: CrashReporter
  var nativeImage: electronLib.TypeofClassNativeImage
  var screen: Screen
  var shell: Shell
}

object CommonInterface {
  @scala.inline
  def apply(
    clipboard: Clipboard,
    crashReporter: CrashReporter,
    nativeImage: electronLib.TypeofClassNativeImage,
    screen: Screen,
    shell: Shell
  ): CommonInterface = {
    val __obj = js.Dynamic.literal(clipboard = clipboard, crashReporter = crashReporter, nativeImage = nativeImage, screen = screen, shell = shell)
  
    __obj.asInstanceOf[CommonInterface]
  }
}

