package typings.dragTimetable

import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("drag-timetable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("drag-timetable", "TimetableInstance")
  @js.native
  open class TimetableInstance protected () extends StObject {
    def this(contextObj: Any) = this()
    
    def addTask(task: Any, isAddingToTimetable: Boolean): HTMLDivElement = js.native
    
    def getTask(taskId: Any): Any = js.native
    
    def removeTask(taskId: Any): Unit = js.native
    
    def setClickCallback(clickCallback: js.Function1[/* task */ Any, Unit]): Unit = js.native
    
    def setMoveCallback(moveCallback: js.Function1[/* task */ Any, Unit]): Unit = js.native
  }
  
  @JSImport("drag-timetable", "TimetableTask")
  @js.native
  open class TimetableTask protected () extends StObject {
    def this(task: Any, taskAreaSize: Any) = this()
    
    def getTimeElement(): HTMLDivElement = js.native
    
    def updateTaskUI(): Unit = js.native
  }
  
  inline def create(container: Null, options: Any): TimetableInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TimetableInstance]
  inline def create(container: HTMLElement, options: Any): TimetableInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TimetableInstance]
}
