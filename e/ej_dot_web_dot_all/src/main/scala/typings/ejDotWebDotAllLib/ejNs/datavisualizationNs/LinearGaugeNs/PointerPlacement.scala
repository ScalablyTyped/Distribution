package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerPlacement extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.PointerPlacement")
@js.native
object PointerPlacement extends js.Object {
  //string
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.PointerPlacement
  
  //string
  @js.native
  sealed trait Far
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.PointerPlacement
  
  //string
  @js.native
  sealed trait Near
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.PointerPlacement
  
  /* 2 */ val Center: Center with scala.Double = js.native
  /* 1 */ val Far: Far with scala.Double = js.native
  /* 0 */ val Near: Near with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.PointerPlacement with scala.Double
  ] = js.native
}

