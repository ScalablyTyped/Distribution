package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

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
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.Direction
  
  //string
  @js.native
  sealed trait CounterClockwise
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.Direction
  
  /* 0 */ val Clockwise: Clockwise with scala.Double = js.native
  /* 1 */ val CounterClockwise: CounterClockwise with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.Direction with scala.Double
  ] = js.native
}

