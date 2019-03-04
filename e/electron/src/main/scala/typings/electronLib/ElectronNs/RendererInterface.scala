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
    val __obj = js.Dynamic.literal(BrowserWindowProxy = BrowserWindowProxy, clipboard = clipboard, crashReporter = crashReporter, desktopCapturer = desktopCapturer, ipcRenderer = ipcRenderer, nativeImage = nativeImage, remote = remote, screen = screen, shell = shell, webFrame = webFrame, webviewTag = webviewTag)
  
    __obj.asInstanceOf[RendererInterface]
  }
}

