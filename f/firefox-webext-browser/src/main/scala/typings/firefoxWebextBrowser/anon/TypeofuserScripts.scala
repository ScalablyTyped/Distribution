package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.userScripts.RegisteredUserScript
import typings.firefoxWebextBrowser.browser.userScripts.UserScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofuserScripts extends js.Object {
  /* userScripts events */
  /**
    * Event called when a new userScript global has been created
    *
    * Allowed in: Content scripts only
    */
  val onBeforeScript: WebExtEvent[js.Function1[/* userScript */ DefineGlobals, Unit]] = js.native
  /* userScripts functions */
  /**
    * Register a user script programmatically given its `userScripts.UserScriptOptions`, and resolves to a
    * `userScripts.RegisteredUserScript` instance
    */
  def register(userScriptOptions: UserScriptOptions): js.Promise[RegisteredUserScript] = js.native
}

object TypeofuserScripts {
  @scala.inline
  def apply(
    onBeforeScript: WebExtEvent[js.Function1[/* userScript */ DefineGlobals, Unit]],
    register: UserScriptOptions => js.Promise[RegisteredUserScript]
  ): TypeofuserScripts = {
    val __obj = js.Dynamic.literal(onBeforeScript = onBeforeScript.asInstanceOf[js.Any], register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[TypeofuserScripts]
  }
  @scala.inline
  implicit class TypeofuserScriptsOps[Self <: TypeofuserScripts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnBeforeScript(value: WebExtEvent[js.Function1[/* userScript */ DefineGlobals, Unit]]): Self = this.set("onBeforeScript", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegister(value: UserScriptOptions => js.Promise[RegisteredUserScript]): Self = this.set("register", js.Any.fromFunction1(value))
  }
  
}

