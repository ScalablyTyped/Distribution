package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScript
import typings.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScriptOptions
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

