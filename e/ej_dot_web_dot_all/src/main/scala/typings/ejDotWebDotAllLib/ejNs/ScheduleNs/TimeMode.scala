package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

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
  sealed trait Hour12
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.TimeMode
  
  ///Sets 24 hour time mode to Scheduler
  @js.native
  sealed trait Hour24
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.TimeMode
  
  val Hour12: Hour12 with java.lang.String = js.native
  val Hour24: Hour24 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ScheduleNs.TimeMode with java.lang.String] = js.native
}

