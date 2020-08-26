package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.history.HistoryItem
import typings.firefoxWebextBrowser.browser.history.VisitItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofhistory extends js.Object {
  /** Fired when the title of a URL is changed in the browser history. */
  val onTitleChanged: WebExtEvent[js.Function1[/* changed */ TitleStringUrlString, Unit]] = js.native
  /**
    * Fired when one or more URLs are removed from the history service. When all visits have been removed the URL is
    * purged from history.
    */
  val onVisitRemoved: WebExtEvent[js.Function1[/* removed */ AllHistory, Unit]] = js.native
  /* history events */
  /**
    * Fired when a URL is visited, providing the HistoryItem data for that URL. This event fires before the page has
    * loaded.
    */
  val onVisited: WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]] = js.native
  /**
    * Adds a URL to the history with a default visitTime of the current time and a default transition type of "link".
    */
  def addUrl(details: Transition): js.Promise[Unit] = js.native
  /** Deletes all items from the history. */
  def deleteAll(): js.Promise[Unit] = js.native
  /**
    * Removes all items within the specified date range from the history. Pages will not be removed from the history
    * unless all visits fall within the range.
    */
  def deleteRange(range: StartTime): js.Promise[Unit] = js.native
  /** Removes all occurrences of the given URL from the history. */
  def deleteUrl(details: UrlString): js.Promise[Unit] = js.native
  /** Retrieves information about visits to a URL. */
  def getVisits(details: UrlString): js.Promise[js.Array[VisitItem]] = js.native
  /* history functions */
  /** Searches the history for the last visit time of each page matching the query. */
  def search(query: EndTime): js.Promise[js.Array[HistoryItem]] = js.native
}

object Typeofhistory {
  @scala.inline
  def apply(
    addUrl: Transition => js.Promise[Unit],
    deleteAll: () => js.Promise[Unit],
    deleteRange: StartTime => js.Promise[Unit],
    deleteUrl: UrlString => js.Promise[Unit],
    getVisits: UrlString => js.Promise[js.Array[VisitItem]],
    onTitleChanged: WebExtEvent[js.Function1[/* changed */ TitleStringUrlString, Unit]],
    onVisitRemoved: WebExtEvent[js.Function1[/* removed */ AllHistory, Unit]],
    onVisited: WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]],
    search: EndTime => js.Promise[js.Array[HistoryItem]]
  ): Typeofhistory = {
    val __obj = js.Dynamic.literal(addUrl = js.Any.fromFunction1(addUrl), deleteAll = js.Any.fromFunction0(deleteAll), deleteRange = js.Any.fromFunction1(deleteRange), deleteUrl = js.Any.fromFunction1(deleteUrl), getVisits = js.Any.fromFunction1(getVisits), onTitleChanged = onTitleChanged.asInstanceOf[js.Any], onVisitRemoved = onVisitRemoved.asInstanceOf[js.Any], onVisited = onVisited.asInstanceOf[js.Any], search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[Typeofhistory]
  }
  @scala.inline
  implicit class TypeofhistoryOps[Self <: Typeofhistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddUrl(value: Transition => js.Promise[Unit]): Self = this.set("addUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteAll(value: () => js.Promise[Unit]): Self = this.set("deleteAll", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteRange(value: StartTime => js.Promise[Unit]): Self = this.set("deleteRange", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteUrl(value: UrlString => js.Promise[Unit]): Self = this.set("deleteUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setGetVisits(value: UrlString => js.Promise[js.Array[VisitItem]]): Self = this.set("getVisits", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTitleChanged(value: WebExtEvent[js.Function1[/* changed */ TitleStringUrlString, Unit]]): Self = this.set("onTitleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnVisitRemoved(value: WebExtEvent[js.Function1[/* removed */ AllHistory, Unit]]): Self = this.set("onVisitRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnVisited(value: WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]]): Self = this.set("onVisited", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: EndTime => js.Promise[js.Array[HistoryItem]]): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}

