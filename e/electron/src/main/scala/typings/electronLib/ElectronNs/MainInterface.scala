package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainInterface extends CommonInterface {
  var BrowserView: electronLib.Anon_FromId
  var BrowserWindow: electronLib.Anon_AddDevToolsExtension
  var ClientRequest: org.scalablytyped.runtime.Instantiable1[
    /* options */ electronLib.electronLibStrings.method | electronLib.electronLibStrings.url | electronLib.electronLibStrings.session | electronLib.electronLibStrings.partition | electronLib.electronLibStrings.protocol | electronLib.electronLibStrings.host | electronLib.electronLibStrings.hostname | electronLib.electronLibStrings.port | electronLib.electronLibStrings.path | electronLib.electronLibStrings.redirect, 
    ClientRequest
  ]
  var Cookies: org.scalablytyped.runtime.Instantiable0[Cookies]
  var Debugger: org.scalablytyped.runtime.Instantiable0[Debugger]
  var DownloadItem: org.scalablytyped.runtime.Instantiable0[DownloadItem]
  var IncomingMessage: org.scalablytyped.runtime.Instantiable0[IncomingMessage]
  var Menu: electronLib.Anon_Action
  var MenuItem: org.scalablytyped.runtime.Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem]
  var Notification: electronLib.Anon_IsSupported
  var TouchBar: electronLib.Anon_Options
  var Tray: org.scalablytyped.runtime.Instantiable1[/* image */ NativeImage | java.lang.String, Tray]
  var WebRequest: org.scalablytyped.runtime.Instantiable0[WebRequest]
  var app: App
  var autoUpdater: AutoUpdater
  var contentTracing: ContentTracing
  var dialog: Dialog
  var globalShortcut: GlobalShortcut
  var inAppPurchase: InAppPurchase
  var ipcMain: IpcMain
  var net: Net
  var netLog: NetLog
  var powerMonitor: PowerMonitor
  var powerSaveBlocker: PowerSaveBlocker
  var protocol: Protocol
  var session: electronLib.Anon_DefaultSession
  var systemPreferences: SystemPreferences
  var webContents: electronLib.Anon_FromIdGetAllWebContents
}

