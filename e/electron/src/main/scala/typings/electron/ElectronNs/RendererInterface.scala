package typings.electron.ElectronNs

import org.scalablytyped.runtime.Instantiable0
import typings.electron.TypeofClassNativeImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererInterface extends CommonInterface {
  var BrowserWindowProxy: Instantiable0[typings.electron.ElectronNs.BrowserWindowProxy]
  var desktopCapturer: DesktopCapturer
  var ipcRenderer: IpcRenderer
  var remote: Remote
  var webFrame: WebFrame
  var webviewTag: WebviewTag
}

object RendererInterface {
  @scala.inline
  def apply(
    BrowserWindowProxy: Instantiable0[BrowserWindowProxy],
    clipboard: Clipboard,
    crashReporter: CrashReporter,
    desktopCapturer: DesktopCapturer,
    ipcRenderer: IpcRenderer,
    nativeImage: TypeofClassNativeImage,
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

