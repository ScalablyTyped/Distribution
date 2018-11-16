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
  
  val Day: Day with java.lang.String = js.native
  val Hour: Hour with java.lang.String = js.native
  val Month: Month with java.lang.String = js.native
  val Week: Week with java.lang.String = js.native
  val Year: Year with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.ScheduleHeaderType with java.lang.String] = js.native
}

