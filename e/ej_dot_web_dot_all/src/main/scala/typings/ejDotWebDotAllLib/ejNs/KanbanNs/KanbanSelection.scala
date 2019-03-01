package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KanbanSelection extends js.Object {
  /** It is used to clear all the card selection.
    * @returns {void}
    */
  def clear(): scala.Unit
}

object KanbanSelection {
  @scala.inline
  def apply(clear: js.Function0[scala.Unit]): KanbanSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.asInstanceOf[KanbanSelection]
  }
}

