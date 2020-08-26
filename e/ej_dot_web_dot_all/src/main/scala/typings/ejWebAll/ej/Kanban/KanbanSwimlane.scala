package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KanbanSwimlane extends js.Object {
  /** Collapse all the swimlane rows in Kanban.
    * @returns {void}
    */
  def collapseAll(): Unit = js.native
  /** Expand all the swimlane rows in Kanban.
    * @returns {void}
    */
  def expandAll(): Unit = js.native
  /** Expand or collapse the swimlane row based on the state of target &quot;div&quot;
    * @param {any} Pass the div object to toggleSwimlane row based on its row state
    * @returns {void}
    */
  def toggle($div: js.Any): Unit = js.native
}

object KanbanSwimlane {
  @scala.inline
  def apply(collapseAll: () => Unit, expandAll: () => Unit, toggle: js.Any => Unit): KanbanSwimlane = {
    val __obj = js.Dynamic.literal(collapseAll = js.Any.fromFunction0(collapseAll), expandAll = js.Any.fromFunction0(expandAll), toggle = js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[KanbanSwimlane]
  }
  @scala.inline
  implicit class KanbanSwimlaneOps[Self <: KanbanSwimlane] (val x: Self) extends AnyVal {
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
    def setCollapseAll(value: () => Unit): Self = this.set("collapseAll", js.Any.fromFunction0(value))
    @scala.inline
    def setExpandAll(value: () => Unit): Self = this.set("expandAll", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: js.Any => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
  }
  
}

