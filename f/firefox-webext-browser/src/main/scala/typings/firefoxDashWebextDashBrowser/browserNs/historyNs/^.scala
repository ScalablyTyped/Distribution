package typings.firefoxDashWebextDashBrowser.browserNs.historyNs

import typings.firefoxDashWebextDashBrowser.Anon_AllHistory
import typings.firefoxDashWebextDashBrowser.Anon_EndTime
import typings.firefoxDashWebextDashBrowser.Anon_EndTimeStartTime
import typings.firefoxDashWebextDashBrowser.Anon_TitleTransition
import typings.firefoxDashWebextDashBrowser.Anon_TitleUrlString
import typings.firefoxDashWebextDashBrowser.Anon_Url
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.history")
@js.native
object ^ extends js.Object {
  /** Fired when the title of a URL is changed in the browser history. */
  val onTitleChanged: WebExtEvent[js.Function1[/* changed */ Anon_TitleUrlString, Unit]] = js.native
  /**
    * Fired when one or more URLs are removed from the history service. When all visits have been removed the URL is
    * purged from history.
    */
  val onVisitRemoved: WebExtEvent[js.Function1[/* removed */ Anon_AllHistory, Unit]] = js.native
  /* history events */
  /**
    * Fired when a URL is visited, providing the HistoryItem data for that URL. This event fires before the page has
    * loaded.
    */
  val onVisited: WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]] = js.native
  /**
    * Adds a URL to the history with a default visitTime of the current time and a default transition type of "link".
    */
  def addUrl(details: Anon_TitleTransition): js.Promise[Unit] = js.native
  /** Deletes all items from the history. */
  def deleteAll(): js.Promise[Unit] = js.native
  /**
    * Removes all items within the specified date range from the history. Pages will not be removed from the history
    * unless all visits fall within the range.
    */
  def deleteRange(range: Anon_EndTimeStartTime): js.Promise[Unit] = js.native
  /** Removes all occurrences of the given URL from the history. */
  def deleteUrl(details: Anon_Url): js.Promise[Unit] = js.native
  /** Retrieves information about visits to a URL. */
  def getVisits(details: Anon_Url): js.Promise[js.Array[VisitItem]] = js.native
  /* history functions */
  /** Searches the history for the last visit time of each page matching the query. */
  def search(query: Anon_EndTime): js.Promise[js.Array[HistoryItem]] = js.native
}

