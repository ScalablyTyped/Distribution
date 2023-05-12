package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScript
import typings.firefoxWebextBrowser.browser.contentScripts.RegisteredContentScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Not supported on manifest versions above 2.
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object contentScripts {
  
  @JSGlobal("browser.contentScripts")
  @js.native
  val ^ : js.Any = js.native
  
  /* contentScripts functions */
  /** Register a content script programmatically */
  inline def register(contentScriptOptions: RegisteredContentScriptOptions): js.Promise[RegisteredContentScript] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(contentScriptOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RegisteredContentScript]]
}
