package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KanbanSwimlane extends js.Object {
  /** Collapse all the swimlane rows in Kanban.
    * @returns {void}
    */
  def collapseAll(): Unit
  /** Expand all the swimlane rows in Kanban.
    * @returns {void}
    */
  def expandAll(): Unit
  /** Expand or collapse the swimlane row based on the state of target &quot;div&quot;
    * @param {any} Pass the div object to toggleSwimlane row based on its row state
    * @returns {void}
    */
  def toggle($div: js.Any): Unit
}

object KanbanSwimlane {
  @scala.inline
  def apply(collapseAll: () => Unit, expandAll: () => Unit, toggle: js.Any => Unit): KanbanSwimlane = {
    val __obj = js.Dynamic.literal(collapseAll = js.Any.fromFunction0(collapseAll), expandAll = js.Any.fromFunction0(expandAll), toggle = js.Any.fromFunction1(toggle))
  
    __obj.asInstanceOf[KanbanSwimlane]
  }
}

