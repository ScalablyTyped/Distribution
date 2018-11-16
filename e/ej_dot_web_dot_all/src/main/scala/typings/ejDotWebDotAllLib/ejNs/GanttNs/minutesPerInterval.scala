package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait minutesPerInterval extends js.Object

@JSGlobal("ej.Gantt.minutesPerInterval")
@js.native
object minutesPerInterval extends js.Object {
  ///Sets the interval automatically according with schedule start and end date.
  @js.native
  sealed trait Auto
    extends ejDotWebDotAllLib.ejNs.GanttNs.minutesPerInterval
  
  ///Sets fifteen minute intervals per hour.
  @js.native
  sealed trait FifteenMinutes
    extends ejDotWebDotAllLib.ejNs.GanttNs.minutesPerInterval
  
  ///Sets Five minute intervals per hour.
  @js.native
  sealed trait FiveMinutes
    extends ejDotWebDotAllLib.ejNs.GanttNs.minutesPerInterval
  
  ///Sets one minute intervals per hour.
  @js.native
  sealed trait OneMinute
    extends ejDotWebDotAllLib.ejNs.GanttNs.minutesPerInterval
  
  ///Sets thirty minute intervals per hour.
  @js.native
  sealed trait ThirtyMinutes
    extends ejDotWebDotAllLib.ejNs.GanttNs.minutesPerInterval
  
  val Auto: Auto with java.lang.String = js.native
  val FifteenMinutes: FifteenMinutes with java.lang.String = js.native
  val FiveMinutes: FiveMinutes with java.lang.String = js.native
  val OneMinute: OneMinute with java.lang.String = js.native
  val ThirtyMinutes: ThirtyMinutes with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.minutesPerInterval with java.lang.String] = js.native
}

