package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkUnit extends js.Object

@JSGlobal("ej.Gantt.WorkUnit")
@js.native
object WorkUnit extends js.Object {
  ///Displays the work involved in a task in days.
  @js.native
  sealed trait Day
    extends ejDotWebDotAllLib.ejNs.GanttNs.WorkUnit
  
  ///Displays the work involved in a task in hours.
  @js.native
  sealed trait Hour
    extends ejDotWebDotAllLib.ejNs.GanttNs.WorkUnit
  
  ///Displays the work involved in a task in minutes
  @js.native
  sealed trait Minute
    extends ejDotWebDotAllLib.ejNs.GanttNs.WorkUnit
  
  /* 0 */ val Day: Day with scala.Double = js.native
  /* 1 */ val Hour: Hour with scala.Double = js.native
  /* 2 */ val Minute: Minute with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.WorkUnit with scala.Double] = js.native
}

