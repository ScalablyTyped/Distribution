package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZIndex extends js.Object

@JSGlobal("ej.datavisualization.Chart.ZIndex")
@js.native
object ZIndex extends js.Object {
  //string
  @js.native
  sealed trait Inside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ZIndex
  
  //string
  @js.native
  sealed trait Over
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ZIndex
  
  val Inside: Inside with java.lang.String = js.native
  val Over: Over with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ZIndex with java.lang.String] = js.native
}

