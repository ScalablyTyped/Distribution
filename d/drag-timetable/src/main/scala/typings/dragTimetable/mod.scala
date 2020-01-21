package typings.dragTimetable

import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("drag-timetable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class TimetableInstance protected () extends js.Object {
    def this(contextObj: js.Any) = this()
    def addTask(task: js.Any, isAddingToTimetable: Boolean): HTMLDivElement = js.native
    def getTask(taskId: js.Any): js.Any = js.native
    def removeTask(taskId: js.Any): Unit = js.native
    def setClickCallback(clickCallback: js.Function1[/* task */ js.Any, Unit]): Unit = js.native
    def setMoveCallback(moveCallback: js.Function1[/* task */ js.Any, Unit]): Unit = js.native
  }
  
  @js.native
  class TimetableTask protected () extends js.Object {
    def this(task: js.Any, taskAreaSize: js.Any) = this()
    def getTimeElement(): HTMLDivElement = js.native
    def updateTaskUI(): Unit = js.native
  }
  
  @js.native
  object create extends js.Object {
    def apply(container: Null, options: js.Any): TimetableInstance = js.native
    def apply(container: HTMLElement, options: js.Any): TimetableInstance = js.native
  }
  
}

