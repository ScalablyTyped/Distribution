package typings.frappeGantt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frappe-gantt", JSImport.Namespace)
@js.native
class ^ protected () extends Gantt {
  def this(wrapper: String, tasks: js.Array[Task]) = this()
  def this(wrapper: String, tasks: js.Array[Task], options: Options) = this()
  /* CompleteClass */
  override def change_view_mode(mode: viewMode): Unit = js.native
  /* CompleteClass */
  override def refresh(tasks: js.Array[Task]): Unit = js.native
}

