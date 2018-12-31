package typings
package firefoxDashWebextDashBrowserLib.browserNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.history")
@js.native
object historyNsMembers extends js.Object {
  /** Fired when the title of a URL is changed in the browser history. */
  val onTitleChanged: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[/* changed */ firefoxDashWebextDashBrowserLib.Anon_UrlTitle, scala.Unit]
  ] = js.native
  /**
    * Fired when one or more URLs are removed from the history service. When all visits have been removed the URL is
    * purged from history.
    */
  val onVisitRemoved: firefoxDashWebextDashBrowserLib.WebExtEvent[
    js.Function1[/* removed */ firefoxDashWebextDashBrowserLib.Anon_AllHistory, scala.Unit]
  ] = js.native
  /* history events */
  /**
    * Fired when a URL is visited, providing the HistoryItem data for that URL. This event fires before the page has
    * loaded.
    */
  val onVisited: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function1[/* result */ HistoryItem, scala.Unit]] = js.native
  /**
    * Adds a URL to the history with a default visitTime of the current time and a default transition type of "link".
    */
  def addUrl(details: firefoxDashWebextDashBrowserLib.Anon_VisitTime): js.Promise[scala.Unit] = js.native
  /** Deletes all items from the history. */
  def deleteAll(): js.Promise[scala.Unit] = js.native
  /**
    * Removes all items within the specified date range from the history. Pages will not be removed from the history
    * unless all visits fall within the range.
    */
  def deleteRange(range: firefoxDashWebextDashBrowserLib.Anon_EndTime): js.Promise[scala.Unit] = js.native
  /** Removes all occurrences of the given URL from the history. */
  def deleteUrl(details: firefoxDashWebextDashBrowserLib.Anon_Url): js.Promise[scala.Unit] = js.native
  /** Retrieves information about visits to a URL. */
  def getVisits(details: firefoxDashWebextDashBrowserLib.Anon_Url): js.Promise[js.Array[VisitItem]] = js.native
  /* history functions */
  /** Searches the history for the last visit time of each page matching the query. */
  def search(query: firefoxDashWebextDashBrowserLib.Anon_Text): js.Promise[js.Array[HistoryItem]] = js.native
}

