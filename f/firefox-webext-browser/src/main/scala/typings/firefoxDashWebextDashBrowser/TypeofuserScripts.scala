package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.userScripts.RegisteredUserScript
import typings.firefoxDashWebextDashBrowser.browser.userScripts.UserScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofuserScripts extends js.Object {
  /* userScripts events */
  /**
    * Event called when a new userScript global has been created
    *
    * Allowed in: Content scripts only
    */
  val onBeforeScript: WebExtEvent[js.Function1[/* userScript */ Anon_DefineGlobals, Unit]]
  /* userScripts functions */
  /**
    * Register a user script programmatically given its `userScripts.UserScriptOptions`, and resolves to a
    * `userScripts.RegisteredUserScript` instance
    */
  def register(userScriptOptions: UserScriptOptions): js.Promise[RegisteredUserScript]
}

object TypeofuserScripts {
  @scala.inline
  def apply(
    onBeforeScript: WebExtEvent[js.Function1[/* userScript */ Anon_DefineGlobals, Unit]],
    register: UserScriptOptions => js.Promise[RegisteredUserScript]
  ): TypeofuserScripts = {
    val __obj = js.Dynamic.literal(onBeforeScript = onBeforeScript.asInstanceOf[js.Any], register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[TypeofuserScripts]
  }
}

