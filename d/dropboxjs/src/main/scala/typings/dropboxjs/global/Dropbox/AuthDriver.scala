package typings.dropboxjs.global.Dropbox

import typings.dropboxjs.Dropbox.RedirectOptions
import typings.dropboxjs.anon.Port
import typings.dropboxjs.anon.ReceiverPath
import typings.dropboxjs.anon.RedirectFile
import typings.dropboxjs.anon.RememberUser
import typings.dropboxjs.anon.Scope
import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.AuthDriver")
@js.native
class AuthDriver ()
  extends typings.dropboxjs.Dropbox.AuthDriver
@JSGlobal("Dropbox.AuthDriver")
@js.native
object AuthDriver extends js.Object {
  
  @js.native
  class BrowserBase protected ()
    extends typings.dropboxjs.Dropbox.AuthDriver.BrowserBase {
    def this(options: RememberUser) = this()
  }
  /* static members */
  @js.native
  object BrowserBase extends js.Object {
    
    def cleanupLocation(): Unit = js.native
    
    def currentLocation(): String = js.native
    
    def localStorage(): Storage = js.native
  }
  
  @js.native
  class ChromeApp ()
    extends typings.dropboxjs.Dropbox.AuthDriver.IAuthDriver {
    def this(options: Scope) = this()
  }
  
  @js.native
  class ChromeExtension ()
    extends typings.dropboxjs.Dropbox.AuthDriver.IAuthDriver {
    def this(options: ReceiverPath) = this()
  }
  /* static members */
  @js.native
  object ChromeExtension extends js.Object {
    
    def oauthReceiver(): Unit = js.native
  }
  
  @js.native
  class Cordova ()
    extends typings.dropboxjs.Dropbox.AuthDriver.Cordova {
    def this(options: ReceiverPath) = this()
  }
  /* static members */
  @js.native
  object Cordova extends js.Object {
    
    def oauthReceiver(): Unit = js.native
  }
  
  /** Do not use class! TypeScript definition implementation detail : https://github.com/Microsoft/TypeScript/issues/371 */
  @js.native
  class IAuthDriver ()
    extends typings.dropboxjs.Dropbox.AuthDriver.IAuthDriver
  
  @js.native
  class NodeServer ()
    extends typings.dropboxjs.Dropbox.AuthDriver.NodeServer {
    def this(options: Port) = this()
  }
  
  @js.native
  class Popup ()
    extends typings.dropboxjs.Dropbox.AuthDriver.Popup {
    def this(options: RedirectOptions) = this()
  }
  /* static members */
  @js.native
  object Popup extends js.Object {
    
    def locationOrigin(location: String): String = js.native
    
    def oauthReceiver(): Unit = js.native
  }
  
  @js.native
  class Redirect ()
    extends typings.dropboxjs.Dropbox.AuthDriver.Redirect {
    def this(options: RedirectFile) = this()
  }
}
