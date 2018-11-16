package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmptyPointMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.EmptyPointMode")
@js.native
object EmptyPointMode extends js.Object {
  //string
  @js.native
  sealed trait Average
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.EmptyPointMode
  
  //string
  @js.native
  sealed trait Gap
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.EmptyPointMode
  
  //string
  @js.native
  sealed trait Zero
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.EmptyPointMode
  
  val Average: Average with java.lang.String = js.native
  val Gap: Gap with java.lang.String = js.native
  val Zero: Zero with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.EmptyPointMode with java.lang.String
  ] = js.native
}

