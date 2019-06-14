package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PyramidMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.PyramidMode")
@js.native
object PyramidMode extends js.Object {
  //string
  @js.native
  sealed trait Linear
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.PyramidMode
  
  //string
  @js.native
  sealed trait Surface
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.PyramidMode
  
  /* 0 */ val Linear: Linear with scala.Double = js.native
  /* 1 */ val Surface: Surface with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.PyramidMode with scala.Double] = js.native
}

