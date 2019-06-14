package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScheduleHeaderType extends js.Object

@JSGlobal("ej.Gantt.ScheduleHeaderType")
@js.native
object ScheduleHeaderType extends js.Object {
  ///Sets day Schedule Mode.
  @js.native
  sealed trait Day
    extends ejDotWebDotAllLib.ejNs.GanttNs.ScheduleHeaderType
  
  ///Sets hour Schedule Mode.
  @js.native
  sealed trait Hour
    extends ejDotWebDotAllLib.ejNs.GanttNs.ScheduleHeaderType
  
  ///Sets month Schedule Mode.
  @js.native
  sealed trait Month
    extends ejDotWebDotAllLib.ejNs.GanttNs.ScheduleHeaderType
  
  ///Sets week Schedule Mode.
  @js.native
  sealed trait Week
    extends ejDotWebDotAllLib.ejNs.GanttNs.ScheduleHeaderType
  
  ///Sets year Schedule Mode.
  @js.native
  sealed trait Year
    extends ejDotWebDotAllLib.ejNs.GanttNs.ScheduleHeaderType
  
  /* 3 */ val Day: Day with scala.Double = js.native
  /* 4 */ val Hour: Hour with scala.Double = js.native
  /* 1 */ val Month: Month with scala.Double = js.native
  /* 2 */ val Week: Week with scala.Double = js.native
  /* 0 */ val Year: Year with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.ScheduleHeaderType with scala.Double] = js.native
}

