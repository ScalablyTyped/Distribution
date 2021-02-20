package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.search.SearchEngine
import typings.firefoxWebextBrowser.browser.search.SearchSearchProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use browser.search to interact with search engines.
  *
  * Permissions: `search`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object search {
  
  /* search functions */
  /** Gets a list of search engines. */
  @JSGlobal("browser.search.get")
  @js.native
  def get(): js.Promise[js.Array[SearchEngine]] = js.native
  
  /** Perform a search. */
  @JSGlobal("browser.search.search")
  @js.native
  def search(searchProperties: SearchSearchProperties): js.Promise[_] = js.native
}
