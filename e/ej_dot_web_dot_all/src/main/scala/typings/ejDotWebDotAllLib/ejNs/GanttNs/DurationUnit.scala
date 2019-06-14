package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DurationUnit extends js.Object

@JSGlobal("ej.Gantt.DurationUnit")
@js.native
object DurationUnit extends js.Object {
  ///Sets the Duration Unit as day.
  @js.native
  sealed trait Day
    extends ejDotWebDotAllLib.ejNs.GanttNs.DurationUnit
  
  ///Sets the Duration Unit as hour.
  @js.native
  sealed trait Hour
    extends ejDotWebDotAllLib.ejNs.GanttNs.DurationUnit
  
  ///Sets the Duration Unit as minute.
  @js.native
  sealed trait Minute
    extends ejDotWebDotAllLib.ejNs.GanttNs.DurationUnit
  
  /* 0 */ val Day: Day with scala.Double = js.native
  /* 1 */ val Hour: Hour with scala.Double = js.native
  /* 2 */ val Minute: Minute with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.DurationUnit with scala.Double] = js.native
}

