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
  
  val MiddleBottom: MiddleBottom with java.lang.String = js.native
  val MiddleCenter: MiddleCenter with java.lang.String = js.native
  val MiddleTop: MiddleTop with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.TextAlignment with java.lang.String
  ] = js.native
}

