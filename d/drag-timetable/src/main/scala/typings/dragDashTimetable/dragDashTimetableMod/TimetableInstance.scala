package typings.dragDashTimetable.dragDashTimetableMod

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("drag-timetable", "TimetableInstance")
@js.native
class TimetableInstance protected () extends js.Object {
  def this(contextObj: js.Any) = this()
  def addTask(task: js.Any, isAddingToTimetable: Boolean): HTMLDivElement = js.native
  def getTask(taskId: js.Any): js.Any = js.native
  def removeTask(taskId: js.Any): Unit = js.native
  def setClickCallback(clickCallback: js.Function1[/* task */ js.Any, Unit]): Unit = js.native
  def setMoveCallback(moveCallback: js.Function1[/* task */ js.Any, Unit]): Unit = js.native
}

