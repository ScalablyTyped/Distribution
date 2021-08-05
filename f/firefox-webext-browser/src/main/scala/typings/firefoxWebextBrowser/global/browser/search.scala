package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.search.SearchEngine
import typings.firefoxWebextBrowser.browser.search.SearchSearchProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use browser.search to interact with search engines.
  *
  * Permissions: `search`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object search {
  
  @JSGlobal("browser.search")
  @js.native
  val ^ : js.Any = js.native
  
  /* search functions */
  /** Gets a list of search engines. */
  inline def get(): js.Promise[js.Array[SearchEngine]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[js.Array[SearchEngine]]]
  
  /** Perform a search. */
  inline def search(searchProperties: SearchSearchProperties): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(searchProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
