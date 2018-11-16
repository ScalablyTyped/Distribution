package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.LabelAlignment")
@js.native
object LabelAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelAlignment
  
  //string
  @js.native
  sealed trait Far
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelAlignment
  
  //string
  @js.native
  sealed trait Near
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelAlignment
  
  val Center: Center with java.lang.String = js.native
  val Far: Far with java.lang.String = js.native
  val Near: Near with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelAlignment with java.lang.String
  ] = js.native
}

