package typings.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import typings.electron.TypeofClassNativeImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererInterface extends CommonInterface {
  var BrowserWindowProxy: Instantiable0[typings.electron.Electron.BrowserWindowProxy]
  var contextBridge: ContextBridge
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
    contextBridge: ContextBridge,
    crashReporter: CrashReporter,
    desktopCapturer: DesktopCapturer,
    ipcRenderer: IpcRenderer,
    nativeImage: TypeofClassNativeImage,
    remote: Remote,
    shell: Shell,
    webFrame: WebFrame,
    webviewTag: WebviewTag
  ): RendererInterface = {
    val __obj = js.Dynamic.literal(BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RendererInterface]
  }
}

