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
  
  val Day: Day with java.lang.String = js.native
  val Hour: Hour with java.lang.String = js.native
  val Minute: Minute with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.DurationUnit with java.lang.String] = js.native
}

