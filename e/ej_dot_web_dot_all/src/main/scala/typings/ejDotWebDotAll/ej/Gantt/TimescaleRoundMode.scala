package typings.ejDotWebDotAll.ej.Gantt

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Gantt.TimescaleRoundMode.Auto
import typings.ejDotWebDotAll.ej.Gantt.TimescaleRoundMode.Month
import typings.ejDotWebDotAll.ej.Gantt.TimescaleRoundMode.Week
import typings.ejDotWebDotAll.ej.Gantt.TimescaleRoundMode.Year
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimescaleRoundMode with Double] = js.native
  /* 0 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 2 */ @js.native
  object Month extends TopLevel[Month with Double]
  
  /* 1 */ @js.native
  object Week extends TopLevel[Week with Double]
  
  /* 3 */ @js.native
  object Year extends TopLevel[Year with Double]
  
}

