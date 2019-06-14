package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SplitMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.SplitMode")
@js.native
object SplitMode extends js.Object {
  //string
  @js.native
  sealed trait Indexes
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplitMode
  
  //string
  @js.native
  sealed trait Percentage
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplitMode
  
  //string
  @js.native
  sealed trait Position
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplitMode
  
  //string
  @js.native
  sealed trait Value
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplitMode
  
  /* 3 */ val Indexes: Indexes with scala.Double = js.native
  /* 2 */ val Percentage: Percentage with scala.Double = js.native
  /* 0 */ val Position: Position with scala.Double = js.native
  /* 1 */ val Value: Value with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplitMode with scala.Double] = js.native
}

