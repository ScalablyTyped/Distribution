package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimescaleRoundMode extends js.Object

@JSGlobal("ej.Gantt.TimescaleRoundMode")
@js.native
object TimescaleRoundMode extends js.Object {
  ///The round-off value will be automatically calculated based on the data source values.
  @js.native
  sealed trait Auto
    extends ejDotWebDotAllLib.ejNs.GanttNs.TimescaleRoundMode
  
  ///Schedule headers start date will round off to the immediate month
  @js.native
  sealed trait Month
    extends ejDotWebDotAllLib.ejNs.GanttNs.TimescaleRoundMode
  
  ///Schedule header start date will round-off to the immediate week.
  @js.native
  sealed trait Week
    extends ejDotWebDotAllLib.ejNs.GanttNs.TimescaleRoundMode
  
  ///Schedule headers start date will round off to the immediate year
  @js.native
  sealed trait Year
    extends ejDotWebDotAllLib.ejNs.GanttNs.TimescaleRoundMode
  
  val Auto: Auto with java.lang.String = js.native
  val Month: Month with java.lang.String = js.native
  val Week: Week with java.lang.String = js.native
  val Year: Year with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.TimescaleRoundMode with java.lang.String] = js.native
}

