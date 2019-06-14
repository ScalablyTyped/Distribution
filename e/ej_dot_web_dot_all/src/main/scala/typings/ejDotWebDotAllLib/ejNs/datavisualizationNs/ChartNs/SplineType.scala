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
  
  /* 2 */ val Cardinal: Cardinal with scala.Double = js.native
  /* 3 */ val Clamped: Clamped with scala.Double = js.native
  /* 1 */ val Monotonic: Monotonic with scala.Double = js.native
  /* 0 */ val Natural: Natural with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplineType with scala.Double] = js.native
}

