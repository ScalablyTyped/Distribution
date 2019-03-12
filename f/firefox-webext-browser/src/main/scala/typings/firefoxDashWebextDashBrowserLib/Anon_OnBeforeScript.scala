package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnBeforeScript extends js.Object {
  /* userScripts events */
  /**
    * Event called when a new userScript global has been created
    *
    * Allowed in: Content scripts only
    */
  val onBeforeScript: WebExtEvent[js.Function1[/* userScript */ Anon_DefineGlobals, scala.Unit]]
  /* userScripts functions */
  /**
    * Register a user script programmatically given its `userScripts.UserScriptOptions`, and resolves to a
    * `userScripts.RegisteredUserScript` instance
    */
  def register(userScriptOptions: firefoxDashWebextDashBrowserLib.browserNs.userScriptsNs.UserScriptOptions): js.Promise[firefoxDashWebextDashBrowserLib.browserNs.userScriptsNs.RegisteredUserScript]
}

object Anon_OnBeforeScript {
  @scala.inline
  def apply(
    onBeforeScript: WebExtEvent[js.Function1[/* userScript */ Anon_DefineGlobals, scala.Unit]],
    register: firefoxDashWebextDashBrowserLib.browserNs.userScriptsNs.UserScriptOptions => js.Promise[firefoxDashWebextDashBrowserLib.browserNs.userScriptsNs.RegisteredUserScript]
  ): Anon_OnBeforeScript = {
    val __obj = js.Dynamic.literal(onBeforeScript = onBeforeScript, register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[Anon_OnBeforeScript]
  }
}

