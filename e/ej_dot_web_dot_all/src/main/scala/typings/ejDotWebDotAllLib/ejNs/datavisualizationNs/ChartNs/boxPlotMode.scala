package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait boxPlotMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.boxPlotMode")
@js.native
object boxPlotMode extends js.Object {
  //string
  @js.native
  sealed trait Exclusive
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.boxPlotMode
  
  //string
  @js.native
  sealed trait Inclusive
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.boxPlotMode
  
  //string
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.boxPlotMode
  
  val Exclusive: Exclusive with java.lang.String = js.native
  val Inclusive: Inclusive with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.boxPlotMode with java.lang.String
  ] = js.native
}

