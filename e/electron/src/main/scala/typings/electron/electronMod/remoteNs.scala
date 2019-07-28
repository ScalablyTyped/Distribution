package typings.electron.electronMod

import typings.electron.ElectronNs.MenuItemConstructorOptions
import typings.electron.electronStrings.host
import typings.electron.electronStrings.hostname
import typings.electron.electronStrings.method
import typings.electron.electronStrings.partition
import typings.electron.electronStrings.path
import typings.electron.electronStrings.port
import typings.electron.electronStrings.protocol
import typings.electron.electronStrings.redirect
import typings.electron.electronStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "remote")
@js.native
object remoteNs extends js.Object {
  @js.native
  class ClientRequest protected ()
    extends typings.electron.ElectronNs.ClientRequest {
    def this(options: method | url | typings.electron.electronStrings.session | partition | protocol | host | hostname | port | path | redirect) = this()
  }
  
  @js.native
  class Cookies ()
    extends typings.electron.ElectronNs.Cookies
  
  @js.native
  class Debugger ()
    extends typings.electron.ElectronNs.Debugger
  
  @js.native
  class DownloadItem ()
    extends typings.electron.ElectronNs.DownloadItem
  
  @js.native
  class IncomingMessage ()
    extends typings.electron.ElectronNs.IncomingMessage
  
  @js.native
  class MenuItem protected ()
    extends typings.electron.ElectronNs.MenuItem {
    // Docs: http://electronjs.org/docs/api/menu-item
    def this(options: MenuItemConstructorOptions) = this()
  }
  
  @js.native
  class Tray protected ()
    extends typings.electron.ElectronNs.Tray {
    def this(image: String) = this()
    def this(image: typings.electron.ElectronNs.NativeImage) = this()
  }
  
  @js.native
  class WebRequest ()
    extends typings.electron.ElectronNs.WebRequest
  
}

