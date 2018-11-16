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
  
  val Indexes: Indexes with java.lang.String = js.native
  val Percentage: Percentage with java.lang.String = js.native
  val Position: Position with java.lang.String = js.native
  val Value: Value with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SplitMode with java.lang.String
  ] = js.native
}

