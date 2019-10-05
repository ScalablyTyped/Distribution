package typings.electron.Electron

import typings.electron.TypeofClassNativeImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonInterface extends js.Object {
  var clipboard: Clipboard
  var crashReporter: CrashReporter
  var nativeImage: TypeofClassNativeImage
  var shell: Shell
}

object CommonInterface {
  @scala.inline
  def apply(
    clipboard: Clipboard,
    crashReporter: CrashReporter,
    nativeImage: TypeofClassNativeImage,
    shell: Shell
  ): CommonInterface = {
    val __obj = js.Dynamic.literal(clipboard = clipboard, crashReporter = crashReporter, nativeImage = nativeImage, shell = shell)
  
    __obj.asInstanceOf[CommonInterface]
  }
}

