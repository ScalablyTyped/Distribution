package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AxisOrientation extends js.Object

@JSGlobal("ej.datavisualization.Chart.AxisOrientation")
@js.native
object AxisOrientation extends js.Object {
  //string
  @js.native
  sealed trait Horizontal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.AxisOrientation
  
  //string
  @js.native
  sealed trait Vertical
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.AxisOrientation
  
  val Horizontal: Horizontal with java.lang.String = js.native
  val Vertical: Vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.AxisOrientation with java.lang.String
  ] = js.native
}

