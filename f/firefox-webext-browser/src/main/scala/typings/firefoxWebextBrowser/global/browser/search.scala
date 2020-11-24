package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.search.SearchEngine
import typings.firefoxWebextBrowser.browser.search.SearchSearchProperties
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
@JSGlobal("browser.search")
@js.native
object search extends js.Object {
  
  /* search functions */
  /** Gets a list of search engines. */
  def get(): js.Promise[js.Array[SearchEngine]] = js.native
  
  /** Perform a search. */
  def search(searchProperties: SearchSearchProperties): js.Promise[_] = js.native
}
