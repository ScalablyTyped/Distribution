package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Unit extends js.Object

@JSGlobal("ej.datavisualization.Chart.Unit")
@js.native
object Unit extends js.Object {
  //string
  @js.native
  sealed trait Percentage
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Unit
  
  //string
  @js.native
  sealed trait Pixel
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Unit
  
  /* 0 */ val Percentage: Percentage with scala.Double = js.native
  /* 1 */ val Pixel: Pixel with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Unit with scala.Double] = js.native
}

