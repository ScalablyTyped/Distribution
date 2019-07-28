package typings.ejDotWebDotAll.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskSchedulingMode extends js.Object

@JSGlobal("ej.Gantt.TaskSchedulingMode")
@js.native
object TaskSchedulingMode extends js.Object {
  ///All the tasks in the project will be displayed in auto scheduled mode, where the tasks are scheduled automatically over non-working days and holidays.
  @js.native
  sealed trait Auto extends TaskSchedulingMode
  
  ///Project consists of tasks with both auto and manually scheduled modes, based on the datasource values
  @js.native
  sealed trait Custom extends TaskSchedulingMode
  
  ///All the tasks in the project will be displayed in manually scheduled mode.
  @js.native
  sealed trait Manual extends TaskSchedulingMode
  
  /* 0 */ val Auto: typings.ejDotWebDotAll.ejNs.GanttNs.TaskSchedulingMode.Auto with Double = js.native
  /* 2 */ val Custom: typings.ejDotWebDotAll.ejNs.GanttNs.TaskSchedulingMode.Custom with Double = js.native
  /* 1 */ val Manual: typings.ejDotWebDotAll.ejNs.GanttNs.TaskSchedulingMode.Manual with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskSchedulingMode with Double] = js.native
}

