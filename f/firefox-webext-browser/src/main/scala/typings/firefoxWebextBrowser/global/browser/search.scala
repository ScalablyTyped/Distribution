package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.anon.Engine
import typings.firefoxWebextBrowser.browser.search.SearchEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def search(searchProperties: Engine): js.Promise[_] = js.native
}

