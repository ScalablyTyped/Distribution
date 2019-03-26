package typings
package electronLib.electronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "remote")
@js.native
object remoteNs extends js.Object {
  @js.native
  class ClientRequest protected ()
    extends electronLib.ElectronNs.ClientRequest {
    def this(options: electronLib.electronLibStrings.method | electronLib.electronLibStrings.url | electronLib.electronLibStrings.session | electronLib.electronLibStrings.partition | electronLib.electronLibStrings.protocol | electronLib.electronLibStrings.host | electronLib.electronLibStrings.hostname | electronLib.electronLibStrings.port | electronLib.electronLibStrings.path | electronLib.electronLibStrings.redirect) = this()
  }
  
  @js.native
  class Cookies ()
    extends electronLib.ElectronNs.Cookies
  
  @js.native
  class Debugger ()
    extends electronLib.ElectronNs.Debugger
  
  @js.native
  class DownloadItem ()
    extends electronLib.ElectronNs.DownloadItem
  
  @js.native
  class IncomingMessage ()
    extends electronLib.ElectronNs.IncomingMessage
  
  @js.native
  class MenuItem protected ()
    extends electronLib.ElectronNs.MenuItem {
    // Docs: http://electronjs.org/docs/api/menu-item
    def this(options: electronLib.ElectronNs.MenuItemConstructorOptions) = this()
  }
  
  @js.native
  class Tray protected ()
    extends electronLib.ElectronNs.Tray {
    def this(image: electronLib.ElectronNs.NativeImage) = this()
    def this(image: java.lang.String) = this()
  }
  
  @js.native
  class WebRequest ()
    extends electronLib.ElectronNs.WebRequest
  
}

