package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalTextAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.HorizontalTextAlignment")
@js.native
object HorizontalTextAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.HorizontalTextAlignment
  
  //string
  @js.native
  sealed trait Far
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.HorizontalTextAlignment
  
  //string
  @js.native
  sealed trait Near
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.HorizontalTextAlignment
  
  /* 0 */ val Center: Center with scala.Double = js.native
  /* 2 */ val Far: Far with scala.Double = js.native
  /* 1 */ val Near: Near with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.HorizontalTextAlignment with scala.Double
  ] = js.native
}

