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
  
  val Linear: Linear with java.lang.String = js.native
  val Surface: Surface with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.PyramidMode with java.lang.String
  ] = js.native
}

