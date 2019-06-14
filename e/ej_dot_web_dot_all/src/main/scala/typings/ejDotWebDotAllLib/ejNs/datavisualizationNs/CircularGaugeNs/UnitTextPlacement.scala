package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnitTextPlacement extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.UnitTextPlacement")
@js.native
object UnitTextPlacement extends js.Object {
  //string
  @js.native
  sealed trait Back
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.UnitTextPlacement
  
  //string
  @js.native
  sealed trait Front
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.UnitTextPlacement
  
  /* 0 */ val Back: Back with scala.Double = js.native
  /* 1 */ val Front: Front with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.UnitTextPlacement with scala.Double
  ] = js.native
}

