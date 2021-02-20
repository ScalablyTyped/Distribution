package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScript
import typings.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Not allowed in: Content scripts, Devtools pages */
object contentScripts {
  
  /* contentScripts functions */
  /** Register a content script programmatically */
  @JSGlobal("browser.contentScripts.register")
  @js.native
  def register(contentScriptOptions: RegisteredContentScriptOptions): js.Promise[RegisteredContentScript] = js.native
}
