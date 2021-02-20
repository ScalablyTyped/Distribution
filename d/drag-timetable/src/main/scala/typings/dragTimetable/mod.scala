package typings.dragTimetable

import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("drag-timetable", "TimetableInstance")
  @js.native
  class TimetableInstance protected () extends StObject {
    def this(contextObj: js.Any) = this()
    
    def addTask(task: js.Any, isAddingToTimetable: Boolean): HTMLDivElement = js.native
    
    def getTask(taskId: js.Any): js.Any = js.native
    
    def removeTask(taskId: js.Any): Unit = js.native
    
    def setClickCallback(clickCallback: js.Function1[/* task */ js.Any, Unit]): Unit = js.native
    
    def setMoveCallback(moveCallback: js.Function1[/* task */ js.Any, Unit]): Unit = js.native
  }
  
  @JSImport("drag-timetable", "TimetableTask")
  @js.native
  class TimetableTask protected () extends StObject {
    def this(task: js.Any, taskAreaSize: js.Any) = this()
    
    def getTimeElement(): HTMLDivElement = js.native
    
    def updateTaskUI(): Unit = js.native
  }
  
  object create {
    
    @JSImport("drag-timetable", "create")
    @js.native
    def apply(container: Null, options: js.Any): TimetableInstance = js.native
    @JSImport("drag-timetable", "create")
    @js.native
    def apply(container: HTMLElement, options: js.Any): TimetableInstance = js.native
  }
}
