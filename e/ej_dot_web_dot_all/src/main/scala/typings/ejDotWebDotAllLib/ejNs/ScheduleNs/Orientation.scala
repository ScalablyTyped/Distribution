package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

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
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.Orientation
  
  ///Set orientation as vertical to Scheduler
  @js.native
  sealed trait Vertical
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.Orientation
  
  val Horizontal: Horizontal with java.lang.String = js.native
  val Vertical: Vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ScheduleNs.Orientation with java.lang.String] = js.native
}

