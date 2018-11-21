package typings
package firefoxDashWebextDashBrowserLib.browserNs.userScriptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.userScripts")
@js.native
object userScriptsNsMembers extends js.Object {
  /* userScripts functions */
  /**
       * Register a user script programmatically given its `userScripts.UserScriptOptions`, and resolves to a
       * `userScripts.RegisteredUserScript` instance
       */
  def register(userScriptOptions: UserScriptOptions): stdLib.Promise[RegisteredUserScript] = js.native
  /**
       * Provides a set of custom API methods available to the registered userScripts
       *
       * Allowed in: Content scripts only
       */
  def setScriptAPIs(exportedAPIMethods: ExportedAPIMethods): scala.Unit = js.native
}

