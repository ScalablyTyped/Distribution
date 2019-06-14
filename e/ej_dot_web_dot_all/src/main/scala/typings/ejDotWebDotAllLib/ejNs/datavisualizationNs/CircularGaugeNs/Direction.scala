package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.Direction")
@js.native
object Direction extends js.Object {
  //string
  @js.native
  sealed trait Clockwise
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.Direction
  
  //string
  @js.native
  sealed trait CounterClockwise
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.Direction
  
  /* 0 */ val Clockwise: Clockwise with scala.Double = js.native
  /* 1 */ val CounterClockwise: CounterClockwise with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.Direction with scala.Double
  ] = js.native
}

