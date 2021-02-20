package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.history.AddUrlDetails
import typings.firefoxWebextBrowser.browser.history.DeleteRangeRange
import typings.firefoxWebextBrowser.browser.history.DeleteUrlDetails
import typings.firefoxWebextBrowser.browser.history.GetVisitsDetails
import typings.firefoxWebextBrowser.browser.history.HistoryItem
import typings.firefoxWebextBrowser.browser.history.OnTitleChangedChanged
import typings.firefoxWebextBrowser.browser.history.OnVisitRemovedRemoved
import typings.firefoxWebextBrowser.browser.history.SearchQuery
import typings.firefoxWebextBrowser.browser.history.VisitItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.history` API to interact with the browser's record of visited pages. You can add, remove, and query for URLs in the browser's history. To override the history page with your own version, see Override Pages.
  *
  * Permissions: `history`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object history {
  
  /**
    * Adds a URL to the history with a default visitTime of the current time and a default transition type of "link".
    */
  @JSGlobal("browser.history.addUrl")
  @js.native
  def addUrl(details: AddUrlDetails): js.Promise[Unit] = js.native
  
  /** Deletes all items from the history. */
  @JSGlobal("browser.history.deleteAll")
  @js.native
  def deleteAll(): js.Promise[Unit] = js.native
  
  /**
    * Removes all items within the specified date range from the history. Pages will not be removed from the history unless all visits fall within the range.
    */
  @JSGlobal("browser.history.deleteRange")
  @js.native
  def deleteRange(range: DeleteRangeRange): js.Promise[Unit] = js.native
  
  /** Removes all occurrences of the given URL from the history. */
  @JSGlobal("browser.history.deleteUrl")
  @js.native
  def deleteUrl(details: DeleteUrlDetails): js.Promise[Unit] = js.native
  
  /** Retrieves information about visits to a URL. */
  @JSGlobal("browser.history.getVisits")
  @js.native
  def getVisits(details: GetVisitsDetails): js.Promise[js.Array[VisitItem]] = js.native
  
  /** Fired when the title of a URL is changed in the browser history. */
  @JSGlobal("browser.history.onTitleChanged")
  @js.native
  val onTitleChanged: WebExtEvent[js.Function1[/* changed */ OnTitleChangedChanged, Unit]] = js.native
  
  /**
    * Fired when one or more URLs are removed from the history service. When all visits have been removed the URL is purged from history.
    */
  @JSGlobal("browser.history.onVisitRemoved")
  @js.native
  val onVisitRemoved: WebExtEvent[js.Function1[/* removed */ OnVisitRemovedRemoved, Unit]] = js.native
  
  /* history events */
  /**
    * Fired when a URL is visited, providing the HistoryItem data for that URL. This event fires before the page has loaded.
    */
  @JSGlobal("browser.history.onVisited")
  @js.native
  val onVisited: WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]] = js.native
  
  /* history functions */
  /** Searches the history for the last visit time of each page matching the query. */
  @JSGlobal("browser.history.search")
  @js.native
  def search(query: SearchQuery): js.Promise[js.Array[HistoryItem]] = js.native
}
