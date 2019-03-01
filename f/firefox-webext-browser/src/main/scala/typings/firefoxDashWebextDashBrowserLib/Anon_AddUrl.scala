package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddUrl extends js.Object {
  /** Fired when the title of a URL is changed in the browser history. */
  val onTitleChanged: WebExtEvent[js.Function1[/* changed */ Anon_TitleUrlString, scala.Unit]]
  /**
    * Fired when one or more URLs are removed from the history service. When all visits have been removed the URL is
    * purged from history.
    */
  val onVisitRemoved: WebExtEvent[js.Function1[/* removed */ Anon_AllHistory, scala.Unit]]
  /* history events */
  /**
    * Fired when a URL is visited, providing the HistoryItem data for that URL. This event fires before the page has
    * loaded.
    */
  val onVisited: WebExtEvent[
    js.Function1[
      /* result */ firefoxDashWebextDashBrowserLib.browserNs.historyNs.HistoryItem, 
      scala.Unit
    ]
  ]
  /**
    * Adds a URL to the history with a default visitTime of the current time and a default transition type of "link".
    */
  def addUrl(details: Anon_TitleTransition): js.Promise[scala.Unit]
  /** Deletes all items from the history. */
  def deleteAll(): js.Promise[scala.Unit]
  /**
    * Removes all items within the specified date range from the history. Pages will not be removed from the history
    * unless all visits fall within the range.
    */
  def deleteRange(range: Anon_EndTimeStartTime): js.Promise[scala.Unit]
  /** Removes all occurrences of the given URL from the history. */
  def deleteUrl(details: Anon_Url): js.Promise[scala.Unit]
  /** Retrieves information about visits to a URL. */
  def getVisits(details: Anon_Url): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.historyNs.VisitItem]]
  /* history functions */
  /** Searches the history for the last visit time of each page matching the query. */
  def search(query: Anon_EndTime): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.historyNs.HistoryItem]]
}

object Anon_AddUrl {
  @scala.inline
  def apply(
    addUrl: js.Function1[Anon_TitleTransition, js.Promise[scala.Unit]],
    deleteAll: js.Function0[js.Promise[scala.Unit]],
    deleteRange: js.Function1[Anon_EndTimeStartTime, js.Promise[scala.Unit]],
    deleteUrl: js.Function1[Anon_Url, js.Promise[scala.Unit]],
    getVisits: js.Function1[
      Anon_Url, 
      js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.historyNs.VisitItem]]
    ],
    onTitleChanged: WebExtEvent[js.Function1[/* changed */ Anon_TitleUrlString, scala.Unit]],
    onVisitRemoved: WebExtEvent[js.Function1[/* removed */ Anon_AllHistory, scala.Unit]],
    onVisited: WebExtEvent[
      js.Function1[
        /* result */ firefoxDashWebextDashBrowserLib.browserNs.historyNs.HistoryItem, 
        scala.Unit
      ]
    ],
    search: js.Function1[
      Anon_EndTime, 
      js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.historyNs.HistoryItem]]
    ]
  ): Anon_AddUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addUrl")(addUrl)
    __obj.updateDynamic("deleteAll")(deleteAll)
    __obj.updateDynamic("deleteRange")(deleteRange)
    __obj.updateDynamic("deleteUrl")(deleteUrl)
    __obj.updateDynamic("getVisits")(getVisits)
    __obj.updateDynamic("onTitleChanged")(onTitleChanged)
    __obj.updateDynamic("onVisitRemoved")(onVisitRemoved)
    __obj.updateDynamic("onVisited")(onVisited)
    __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[Anon_AddUrl]
  }
}

