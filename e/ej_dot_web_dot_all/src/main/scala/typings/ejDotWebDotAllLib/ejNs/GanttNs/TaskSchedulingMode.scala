package typings
package ejDotWebDotAllLib.ejNs.GanttNs

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
  sealed trait Auto
    extends ejDotWebDotAllLib.ejNs.GanttNs.TaskSchedulingMode
  
  ///Project consists of tasks with both auto and manually scheduled modes, based on the datasource values
  @js.native
  sealed trait Custom
    extends ejDotWebDotAllLib.ejNs.GanttNs.TaskSchedulingMode
  
  ///All the tasks in the project will be displayed in manually scheduled mode.
  @js.native
  sealed trait Manual
    extends ejDotWebDotAllLib.ejNs.GanttNs.TaskSchedulingMode
  
  /* 0 */ val Auto: Auto with scala.Double = js.native
  /* 2 */ val Custom: Custom with scala.Double = js.native
  /* 1 */ val Manual: Manual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.TaskSchedulingMode with scala.Double] = js.native
}

