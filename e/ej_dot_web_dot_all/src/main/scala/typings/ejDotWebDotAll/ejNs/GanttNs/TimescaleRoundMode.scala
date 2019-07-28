package typings.ejDotWebDotAll.ejNs.GanttNs

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
  sealed trait Auto extends TimescaleRoundMode
  
  ///Schedule headers start date will round off to the immediate month
  @js.native
  sealed trait Month extends TimescaleRoundMode
  
  ///Schedule header start date will round-off to the immediate week.
  @js.native
  sealed trait Week extends TimescaleRoundMode
  
  ///Schedule headers start date will round off to the immediate year
  @js.native
  sealed trait Year extends TimescaleRoundMode
  
  /* 0 */ val Auto: typings.ejDotWebDotAll.ejNs.GanttNs.TimescaleRoundMode.Auto with Double = js.native
  /* 2 */ val Month: typings.ejDotWebDotAll.ejNs.GanttNs.TimescaleRoundMode.Month with Double = js.native
  /* 1 */ val Week: typings.ejDotWebDotAll.ejNs.GanttNs.TimescaleRoundMode.Week with Double = js.native
  /* 3 */ val Year: typings.ejDotWebDotAll.ejNs.GanttNs.TimescaleRoundMode.Year with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimescaleRoundMode with Double] = js.native
}

