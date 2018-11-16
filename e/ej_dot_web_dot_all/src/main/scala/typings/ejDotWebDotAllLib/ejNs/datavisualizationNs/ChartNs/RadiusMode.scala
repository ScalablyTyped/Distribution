package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RadiusMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.RadiusMode")
@js.native
object RadiusMode extends js.Object {
  //string
  @js.native
  sealed trait Auto
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RadiusMode
  
  //string
  @js.native
  sealed trait MinMax
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RadiusMode
  
  val Auto: Auto with java.lang.String = js.native
  val MinMax: MinMax with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RadiusMode with java.lang.String
  ] = js.native
}

