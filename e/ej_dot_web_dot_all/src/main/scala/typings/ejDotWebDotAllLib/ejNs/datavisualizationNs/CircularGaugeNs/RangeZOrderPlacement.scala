package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeZOrderPlacement extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.RangeZOrderPlacement")
@js.native
object RangeZOrderPlacement extends js.Object {
  //string
  @js.native
  sealed trait Front
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.RangeZOrderPlacement
  
  //string
  @js.native
  sealed trait Rear
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.RangeZOrderPlacement
  
  /* 1 */ val Front: Front with scala.Double = js.native
  /* 0 */ val Rear: Rear with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.RangeZOrderPlacement with scala.Double
  ] = js.native
}

