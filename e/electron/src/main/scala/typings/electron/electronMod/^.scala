package typings.electron.electronMod

import typings.electron.ElectronNs.App
import typings.electron.ElectronNs.AutoUpdater
import typings.electron.ElectronNs.Clipboard
import typings.electron.ElectronNs.ContentTracing
import typings.electron.ElectronNs.CrashReporter
import typings.electron.ElectronNs.DesktopCapturer
import typings.electron.ElectronNs.Dialog
import typings.electron.ElectronNs.GlobalShortcut
import typings.electron.ElectronNs.InAppPurchase
import typings.electron.ElectronNs.IpcMain
import typings.electron.ElectronNs.IpcRenderer
import typings.electron.ElectronNs.Net
import typings.electron.ElectronNs.NetLog
import typings.electron.ElectronNs.PowerMonitor
import typings.electron.ElectronNs.PowerSaveBlocker
import typings.electron.ElectronNs.Protocol
import typings.electron.ElectronNs.Remote
import typings.electron.ElectronNs.Screen
import typings.electron.ElectronNs.Shell
import typings.electron.ElectronNs.SystemPreferences
import typings.electron.ElectronNs.WebFrame
import typings.electron.ElectronNs.WebviewTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val app: App = js.native
  val autoUpdater: AutoUpdater = js.native
  val clipboard: Clipboard = js.native
  val contentTracing: ContentTracing = js.native
  val crashReporter: CrashReporter = js.native
  val desktopCapturer: DesktopCapturer = js.native
  val dialog: Dialog = js.native
  val globalShortcut: GlobalShortcut = js.native
  val inAppPurchase: InAppPurchase = js.native
  val ipcMain: IpcMain = js.native
  val ipcRenderer: IpcRenderer = js.native
  val net: Net = js.native
  val netLog: NetLog = js.native
  val powerMonitor: PowerMonitor = js.native
  val powerSaveBlocker: PowerSaveBlocker = js.native
  val protocol: Protocol = js.native
  /* Extracted nested Instantiables into classes in remoteNs */
  val remote: Remote = js.native
  val screen: Screen = js.native
  val shell: Shell = js.native
  val systemPreferences: SystemPreferences = js.native
  val webFrame: WebFrame = js.native
  val webviewTag: WebviewTag = js.native
}

