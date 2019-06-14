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
  
  /* 0 */ val Auto: Auto with scala.Double = js.native
  /* 3 */ val FifteenMinutes: FifteenMinutes with scala.Double = js.native
  /* 2 */ val FiveMinutes: FiveMinutes with scala.Double = js.native
  /* 1 */ val OneMinute: OneMinute with scala.Double = js.native
  /* 4 */ val ThirtyMinutes: ThirtyMinutes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.minutesPerInterval with scala.Double] = js.native
}

