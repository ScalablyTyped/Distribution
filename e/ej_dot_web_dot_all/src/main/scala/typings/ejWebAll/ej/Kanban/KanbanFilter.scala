package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KanbanFilter extends js.Object {
  /** Send a clear request to filter cards in the kanban.
    * @returns {void}
    */
  def clearFilter(): Unit
  /** Method used for send a clear search request to Kanban.
    * @returns {void}
    */
  def clearSearch(): Unit
  /** Send a filtering request to cards in the kanban.
    * @returns {void}
    */
  def filterCards(): Unit
  /** Send a search request to Kanban with specified string passed in it.
    * @param {string} Pass the string to search in Kanban card
    * @returns {void}
    */
  def searchCards(searchString: String): Unit
}

object KanbanFilter {
  @scala.inline
  def apply(
    clearFilter: () => Unit,
    clearSearch: () => Unit,
    filterCards: () => Unit,
    searchCards: String => Unit
  ): KanbanFilter = {
    val __obj = js.Dynamic.literal(clearFilter = js.Any.fromFunction0(clearFilter), clearSearch = js.Any.fromFunction0(clearSearch), filterCards = js.Any.fromFunction0(filterCards), searchCards = js.Any.fromFunction1(searchCards))
  
    __obj.asInstanceOf[KanbanFilter]
  }
}

