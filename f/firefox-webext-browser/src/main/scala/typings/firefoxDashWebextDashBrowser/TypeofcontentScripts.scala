package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.contentScripts.RegisteredContentScript
import typings.firefoxDashWebextDashBrowser.browser.contentScripts.RegisteredContentScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcontentScripts extends js.Object {
  /* contentScripts functions */
  /** Register a content script programmatically */
  def register(contentScriptOptions: RegisteredContentScriptOptions): js.Promise[RegisteredContentScript]
}

object TypeofcontentScripts {
  @scala.inline
  def apply(register: RegisteredContentScriptOptions => js.Promise[RegisteredContentScript]): TypeofcontentScripts = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
  
    __obj.asInstanceOf[TypeofcontentScripts]
  }
}

