package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SplineType extends js.Object

@JSGlobal("ej.datavisualization.Chart.SplineType")
@js.native
object SplineType extends js.Object {
  //string
  @js.native
  sealed trait Cardinal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplineType
  
  //string
  @js.native
  sealed trait Clamped
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplineType
  
  //string
  @js.native
  sealed trait Monotonic
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplineType
  
  //string
  @js.native
  sealed trait Natural
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplineType
  
  val Cardinal: Cardinal with java.lang.String = js.native
  val Clamped: Clamped with java.lang.String = js.native
  val Monotonic: Monotonic with java.lang.String = js.native
  val Natural: Natural with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplineType with java.lang.String
  ] = js.native
}

