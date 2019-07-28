package typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.Direction")
@js.native
object Direction extends js.Object {
  //string
  @js.native
  sealed trait Clockwise
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.Direction
  
  //string
  @js.native
  sealed trait CounterClockwise
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.Direction
  
  /* 0 */ val Clockwise: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.Direction.Clockwise with Double = js.native
  /* 1 */ val CounterClockwise: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.Direction.CounterClockwise with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.Direction with Double
  ] = js.native
}

