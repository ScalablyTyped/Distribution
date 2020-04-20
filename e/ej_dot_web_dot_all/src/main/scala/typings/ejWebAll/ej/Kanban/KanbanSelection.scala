package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KanbanSelection extends js.Object {
  /** It is used to clear all the card selection.
    * @returns {void}
    */
  def clear(): Unit
}

object KanbanSelection {
  @scala.inline
  def apply(clear: () => Unit): KanbanSelection = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
    __obj.asInstanceOf[KanbanSelection]
  }
}

