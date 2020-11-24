package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.userScripts.OnBeforeScriptUserScript
import typings.firefoxWebextBrowser.browser.userScripts.RegisteredUserScript
import typings.firefoxWebextBrowser.browser.userScripts.UserScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest keys: `user_scripts`, `user_scripts`
  *
  * Not allowed in: Devtools pages
  */
@JSGlobal("browser.userScripts")
@js.native
object userScripts extends js.Object {
  
  /* userScripts events */
  /**
    * Event called when a new userScript global has been created
    *
    * Allowed in: Content scripts only
    */
  val onBeforeScript: WebExtEvent[js.Function1[/* userScript */ OnBeforeScriptUserScript, Unit]] = js.native
  
  /* userScripts functions */
  /**
    * Register a user script programmatically given its `userScripts.UserScriptOptions`, and resolves to a `userScripts.RegisteredUserScript` instance
    */
  def register(userScriptOptions: UserScriptOptions): js.Promise[RegisteredUserScript] = js.native
}
