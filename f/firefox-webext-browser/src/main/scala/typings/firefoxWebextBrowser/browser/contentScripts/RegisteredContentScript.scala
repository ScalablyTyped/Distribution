package typings.firefoxWebextBrowser.browser.contentScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object that represents a content script registered programmatically */
@js.native
trait RegisteredContentScript extends js.Object {
  
  /** Unregister a content script registered programmatically */
  def unregister(): js.Promise[_] = js.native
}
object RegisteredContentScript {
  
  @scala.inline
  def apply(unregister: () => js.Promise[_]): RegisteredContentScript = {
    val __obj = js.Dynamic.literal(unregister = js.Any.fromFunction0(unregister))
    __obj.asInstanceOf[RegisteredContentScript]
  }
  
  @scala.inline
  implicit class RegisteredContentScriptOps[Self <: RegisteredContentScript] (val x: Self) extends AnyVal {
    
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
    def setUnregister(value: () => js.Promise[_]): Self = this.set("unregister", js.Any.fromFunction0(value))
  }
}
