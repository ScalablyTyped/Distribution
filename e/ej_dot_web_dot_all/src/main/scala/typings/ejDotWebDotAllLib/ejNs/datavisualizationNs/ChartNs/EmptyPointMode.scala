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
  
  /* 2 */ val Average: Average with scala.Double = js.native
  /* 0 */ val Gap: Gap with scala.Double = js.native
  /* 1 */ val Zero: Zero with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.EmptyPointMode with scala.Double
  ] = js.native
}

