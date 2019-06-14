package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnitTextPlacement extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.UnitTextPlacement")
@js.native
object UnitTextPlacement extends js.Object {
  //string
  @js.native
  sealed trait Back
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.UnitTextPlacement
  
  //string
  @js.native
  sealed trait From
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.UnitTextPlacement
  
  /* 0 */ val Back: Back with scala.Double = js.native
  /* 1 */ val From: From with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.UnitTextPlacement with scala.Double
  ] = js.native
}

