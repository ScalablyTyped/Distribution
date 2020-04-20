package typings.frappeGantt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gantt extends js.Object {
  def change_view_mode(mode: viewMode): Unit
  def refresh(tasks: js.Array[Task]): Unit
}

object Gantt {
  @scala.inline
  def apply(change_view_mode: viewMode => Unit, refresh: js.Array[Task] => Unit): Gantt = {
    val __obj = js.Dynamic.literal(change_view_mode = js.Any.fromFunction1(change_view_mode), refresh = js.Any.fromFunction1(refresh))
    __obj.asInstanceOf[Gantt]
  }
}

