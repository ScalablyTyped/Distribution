package typings.firefoxWebextBrowser.browser.contentScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.contentScripts.register")
@js.native
object register extends js.Object {
  /* contentScripts functions */
  /** Register a content script programmatically */
  def apply(contentScriptOptions: RegisteredContentScriptOptions): js.Promise[RegisteredContentScript] = js.native
}

