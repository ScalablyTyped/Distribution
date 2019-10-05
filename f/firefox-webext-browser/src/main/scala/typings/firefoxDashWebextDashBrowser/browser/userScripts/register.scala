package typings.firefoxDashWebextDashBrowser.browser.userScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.userScripts.register")
@js.native
object register extends js.Object {
  /* userScripts functions */
  /**
    * Register a user script programmatically given its `userScripts.UserScriptOptions`, and resolves to a
    * `userScripts.RegisteredUserScript` instance
    */
  def apply(userScriptOptions: UserScriptOptions): js.Promise[RegisteredUserScript] = js.native
}

