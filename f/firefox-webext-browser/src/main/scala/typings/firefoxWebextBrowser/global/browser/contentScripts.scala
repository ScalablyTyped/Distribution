package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScript
import typings.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Not allowed in: Content scripts, Devtools pages */
@JSGlobal("browser.contentScripts")
@js.native
object contentScripts extends js.Object {
  
  /* contentScripts functions */
  /** Register a content script programmatically */
  def register(contentScriptOptions: RegisteredContentScriptOptions): js.Promise[RegisteredContentScript] = js.native
}
