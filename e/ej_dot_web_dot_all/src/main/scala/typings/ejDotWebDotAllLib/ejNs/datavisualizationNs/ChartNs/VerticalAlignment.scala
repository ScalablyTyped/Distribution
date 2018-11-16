package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.VerticalAlignment
  
  //string
  @js.native
  sealed trait Middle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.VerticalAlignment
  
  //string
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.VerticalAlignment
  
  val Bottom: Bottom with java.lang.String = js.native
  val Middle: Middle with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.VerticalAlignment with java.lang.String
  ] = js.native
}

