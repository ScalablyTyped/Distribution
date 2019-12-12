package typings.ejDotWebDotAll.ej.Gantt

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Gantt.ScheduleHeaderType.Day
import typings.ejDotWebDotAll.ej.Gantt.ScheduleHeaderType.Hour
import typings.ejDotWebDotAll.ej.Gantt.ScheduleHeaderType.Month
import typings.ejDotWebDotAll.ej.Gantt.ScheduleHeaderType.Week
import typings.ejDotWebDotAll.ej.Gantt.ScheduleHeaderType.Year
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScheduleHeaderType with Double] = js.native
  /* 3 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  /* 4 */ @js.native
  object Hour extends TopLevel[Hour with Double]
  
  /* 1 */ @js.native
  object Month extends TopLevel[Month with Double]
  
  /* 2 */ @js.native
  object Week extends TopLevel[Week with Double]
  
  /* 0 */ @js.native
  object Year extends TopLevel[Year with Double]
  
}

