package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- electronLib.ElectronNs.RendererInterface because var conflicts: clipboard, crashReporter, nativeImage, screen, shell. Inlined BrowserWindowProxy, desktopCapturer, ipcRenderer, remote, webFrame, webviewTag */ trait AllElectron extends MainInterface {
  var BrowserWindowProxy: org.scalablytyped.runtime.Instantiable0[BrowserWindowProxy]
  var desktopCapturer: DesktopCapturer
  var ipcRenderer: IpcRenderer
  var remote: Remote
  var webFrame: WebFrame
  var webviewTag: WebviewTag
}

