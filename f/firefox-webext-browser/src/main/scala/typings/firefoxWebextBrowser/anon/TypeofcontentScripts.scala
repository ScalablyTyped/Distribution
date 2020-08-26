package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScript
import typings.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofcontentScripts extends js.Object {
  /* contentScripts functions */
  /** Register a content script programmatically */
  def register(contentScriptOptions: RegisteredContentScriptOptions): js.Promise[RegisteredContentScript] = js.native
}

object TypeofcontentScripts {
  @scala.inline
  def apply(register: RegisteredContentScriptOptions => js.Promise[RegisteredContentScript]): TypeofcontentScripts = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[TypeofcontentScripts]
  }
  @scala.inline
  implicit class TypeofcontentScriptsOps[Self <: TypeofcontentScripts] (val x: Self) extends AnyVal {
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
    def setRegister(value: RegisteredContentScriptOptions => js.Promise[RegisteredContentScript]): Self = this.set("register", js.Any.fromFunction1(value))
  }
  
}

