package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererInterface extends CommonInterface {
  var BrowserWindowProxy: org.scalablytyped.runtime.Instantiable0[BrowserWindowProxy]
  var desktopCapturer: DesktopCapturer
  var ipcRenderer: IpcRenderer
  var remote: Remote
  var webFrame: WebFrame
  var webviewTag: WebviewTag
}

object RendererInterface {
  @scala.inline
  def apply(
    BrowserWindowProxy: org.scalablytyped.runtime.Instantiable0[BrowserWindowProxy],
    clipboard: Clipboard,
    crashReporter: CrashReporter,
    desktopCapturer: DesktopCapturer,
    ipcRenderer: IpcRenderer,
    nativeImage: electronLib.Anon_Buffer,
    remote: Remote,
    screen: Screen,
    shell: Shell,
    webFrame: WebFrame,
    webviewTag: WebviewTag
  ): RendererInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BrowserWindowProxy")(BrowserWindowProxy)
    __obj.updateDynamic("clipboard")(clipboard)
    __obj.updateDynamic("crashReporter")(crashReporter)
    __obj.updateDynamic("desktopCapturer")(desktopCapturer)
    __obj.updateDynamic("ipcRenderer")(ipcRenderer)
    __obj.updateDynamic("nativeImage")(nativeImage)
    __obj.updateDynamic("remote")(remote)
    __obj.updateDynamic("screen")(screen)
    __obj.updateDynamic("shell")(shell)
    __obj.updateDynamic("webFrame")(webFrame)
    __obj.updateDynamic("webviewTag")(webviewTag)
    __obj.asInstanceOf[RendererInterface]
  }
}

