package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendAlignment extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LegendAlignment")
@js.native
object LegendAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendAlignment
  
  //string
  @js.native
  sealed trait Far
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendAlignment
  
  //string
  @js.native
  sealed trait Near
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendAlignment
  
  /* 0 */ val Center: Center with scala.Double = js.native
  /* 2 */ val Far: Far with scala.Double = js.native
  /* 1 */ val Near: Near with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendAlignment with scala.Double
  ] = js.native
}

