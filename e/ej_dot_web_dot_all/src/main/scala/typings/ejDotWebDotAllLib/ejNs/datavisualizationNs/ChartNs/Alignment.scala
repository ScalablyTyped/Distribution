package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.Alignment")
@js.native
object Alignment extends js.Object {
  //string
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Alignment
  
  //string
  @js.native
  sealed trait Far
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Alignment
  
  //string
  @js.native
  sealed trait Near
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Alignment
  
  val Center: Center with java.lang.String = js.native
  val Far: Far with java.lang.String = js.native
  val Near: Near with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Alignment with java.lang.String
  ] = js.native
}

