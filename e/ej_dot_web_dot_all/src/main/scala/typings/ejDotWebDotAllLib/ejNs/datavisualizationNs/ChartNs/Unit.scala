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
  
  val Percentage: Percentage with java.lang.String = js.native
  val Pixel: Pixel with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Unit with java.lang.String] = js.native
}

