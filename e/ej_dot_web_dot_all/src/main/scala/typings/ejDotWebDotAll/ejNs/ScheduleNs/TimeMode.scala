package typings.ejDotWebDotAll.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeMode extends js.Object

@JSGlobal("ej.Schedule.TimeMode")
@js.native
object TimeMode extends js.Object {
  ///Sets 12 hour time mode to Scheduler
  @js.native
  sealed trait Hour12 extends TimeMode
  
  ///Sets 24 hour time mode to Scheduler
  @js.native
  sealed trait Hour24 extends TimeMode
  
  /* 0 */ val Hour12: typings.ejDotWebDotAll.ejNs.ScheduleNs.TimeMode.Hour12 with Double = js.native
  /* 1 */ val Hour24: typings.ejDotWebDotAll.ejNs.ScheduleNs.TimeMode.Hour24 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeMode with Double] = js.native
}

