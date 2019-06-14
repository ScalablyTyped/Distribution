package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.TextAlignment")
@js.native
object TextAlignment extends js.Object {
  //string
  @js.native
  sealed trait MiddleBottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TextAlignment
  
  //string
  @js.native
  sealed trait MiddleCenter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TextAlignment
  
  //string
  @js.native
  sealed trait MiddleTop
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TextAlignment
  
  /* 2 */ val MiddleBottom: MiddleBottom with scala.Double = js.native
  /* 1 */ val MiddleCenter: MiddleCenter with scala.Double = js.native
  /* 0 */ val MiddleTop: MiddleTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TextAlignment with scala.Double
  ] = js.native
}

