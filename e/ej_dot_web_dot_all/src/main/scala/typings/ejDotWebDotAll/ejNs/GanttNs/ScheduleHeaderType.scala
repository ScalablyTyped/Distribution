package typings.ejDotWebDotAll.ejNs.GanttNs

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
  sealed trait Day extends ScheduleHeaderType
  
  ///Sets hour Schedule Mode.
  @js.native
  sealed trait Hour extends ScheduleHeaderType
  
  ///Sets month Schedule Mode.
  @js.native
  sealed trait Month extends ScheduleHeaderType
  
  ///Sets week Schedule Mode.
  @js.native
  sealed trait Week extends ScheduleHeaderType
  
  ///Sets year Schedule Mode.
  @js.native
  sealed trait Year extends ScheduleHeaderType
  
  /* 3 */ val Day: typings.ejDotWebDotAll.ejNs.GanttNs.ScheduleHeaderType.Day with Double = js.native
  /* 4 */ val Hour: typings.ejDotWebDotAll.ejNs.GanttNs.ScheduleHeaderType.Hour with Double = js.native
  /* 1 */ val Month: typings.ejDotWebDotAll.ejNs.GanttNs.ScheduleHeaderType.Month with Double = js.native
  /* 2 */ val Week: typings.ejDotWebDotAll.ejNs.GanttNs.ScheduleHeaderType.Week with Double = js.native
  /* 0 */ val Year: typings.ejDotWebDotAll.ejNs.GanttNs.ScheduleHeaderType.Year with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScheduleHeaderType with Double] = js.native
}

