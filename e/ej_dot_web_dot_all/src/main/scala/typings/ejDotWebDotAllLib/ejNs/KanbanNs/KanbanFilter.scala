package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KanbanFilter extends js.Object {
  /** Send a clear request to filter cards in the kanban.
    * @returns {void}
    */
  def clearFilter(): scala.Unit
  /** Method used for send a clear search request to Kanban.
    * @returns {void}
    */
  def clearSearch(): scala.Unit
  /** Send a filtering request to cards in the kanban.
    * @returns {void}
    */
  def filterCards(): scala.Unit
  /** Send a search request to Kanban with specified string passed in it.
    * @param {string} Pass the string to search in Kanban card
    * @returns {void}
    */
  def searchCards(searchString: java.lang.String): scala.Unit
}

object KanbanFilter {
  @scala.inline
  def apply(
    clearFilter: js.Function0[scala.Unit],
    clearSearch: js.Function0[scala.Unit],
    filterCards: js.Function0[scala.Unit],
    searchCards: js.Function1[java.lang.String, scala.Unit]
  ): KanbanFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearFilter")(clearFilter)
    __obj.updateDynamic("clearSearch")(clearSearch)
    __obj.updateDynamic("filterCards")(filterCards)
    __obj.updateDynamic("searchCards")(searchCards)
    __obj.asInstanceOf[KanbanFilter]
  }
}

