package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Region extends js.Object

@JSGlobal("ej.datavisualization.Chart.Region")
@js.native
object Region extends js.Object {
  //string
  @js.native
  sealed trait Chart
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Region
  
  //string
  @js.native
  sealed trait Series
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Region
  
  val Chart: Chart with java.lang.String = js.native
  val Series: Series with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Region with java.lang.String] = js.native
}

