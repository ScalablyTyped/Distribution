package typings.ejDotWebDotAll.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("ej.Schedule.Orientation")
@js.native
object Orientation extends js.Object {
  ///Set orientation as horizontal to Scheduler
  @js.native
  sealed trait Horizontal
    extends typings.ejDotWebDotAll.ejNs.ScheduleNs.Orientation
  
  ///Set orientation as vertical to Scheduler
  @js.native
  sealed trait Vertical
    extends typings.ejDotWebDotAll.ejNs.ScheduleNs.Orientation
  
  /* 1 */ val Horizontal: typings.ejDotWebDotAll.ejNs.ScheduleNs.Orientation.Horizontal with Double = js.native
  /* 0 */ val Vertical: typings.ejDotWebDotAll.ejNs.ScheduleNs.Orientation.Vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.ScheduleNs.Orientation with Double] = js.native
}

