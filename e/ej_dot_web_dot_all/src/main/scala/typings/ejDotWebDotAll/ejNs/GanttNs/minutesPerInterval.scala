package typings.ejDotWebDotAll.ejNs.GanttNs

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
  sealed trait Auto extends minutesPerInterval
  
  ///Sets fifteen minute intervals per hour.
  @js.native
  sealed trait FifteenMinutes extends minutesPerInterval
  
  ///Sets Five minute intervals per hour.
  @js.native
  sealed trait FiveMinutes extends minutesPerInterval
  
  ///Sets one minute intervals per hour.
  @js.native
  sealed trait OneMinute extends minutesPerInterval
  
  ///Sets thirty minute intervals per hour.
  @js.native
  sealed trait ThirtyMinutes extends minutesPerInterval
  
  /* 0 */ val Auto: typings.ejDotWebDotAll.ejNs.GanttNs.minutesPerInterval.Auto with Double = js.native
  /* 3 */ val FifteenMinutes: typings.ejDotWebDotAll.ejNs.GanttNs.minutesPerInterval.FifteenMinutes with Double = js.native
  /* 2 */ val FiveMinutes: typings.ejDotWebDotAll.ejNs.GanttNs.minutesPerInterval.FiveMinutes with Double = js.native
  /* 1 */ val OneMinute: typings.ejDotWebDotAll.ejNs.GanttNs.minutesPerInterval.OneMinute with Double = js.native
  /* 4 */ val ThirtyMinutes: typings.ejDotWebDotAll.ejNs.GanttNs.minutesPerInterval.ThirtyMinutes with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[minutesPerInterval with Double] = js.native
}

