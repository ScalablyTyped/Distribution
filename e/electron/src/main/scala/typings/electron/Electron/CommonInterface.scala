package typings.electron.Electron

import typings.electron.TypeofClassNativeImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonInterface extends js.Object {
  var clipboard: Clipboard_
  var crashReporter: CrashReporter_
  var nativeImage: TypeofClassNativeImage
  var shell: Shell_
}

object CommonInterface {
  @scala.inline
  def apply(
    clipboard: Clipboard_,
    crashReporter: CrashReporter_,
    nativeImage: TypeofClassNativeImage,
    shell: Shell_
  ): CommonInterface = {
    val __obj = js.Dynamic.literal(clipboard = clipboard.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommonInterface]
  }
}

