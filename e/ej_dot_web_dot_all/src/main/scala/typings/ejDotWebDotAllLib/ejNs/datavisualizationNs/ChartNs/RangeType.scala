package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeType extends js.Object

@JSGlobal("ej.datavisualization.Chart.RangeType")
@js.native
object RangeType extends js.Object {
  //string
  @js.native
  sealed trait X
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangeType
  
  //string
  @js.native
  sealed trait XY
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangeType
  
  //string
  @js.native
  sealed trait Y
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangeType
  
  val X: X with java.lang.String = js.native
  val XY: XY with java.lang.String = js.native
  val Y: Y with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangeType with java.lang.String
  ] = js.native
}

