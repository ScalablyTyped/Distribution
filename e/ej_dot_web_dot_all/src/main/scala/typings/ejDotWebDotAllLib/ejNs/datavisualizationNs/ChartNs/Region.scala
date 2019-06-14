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
  
  /* 0 */ val Chart: Chart with scala.Double = js.native
  /* 1 */ val Series: Series with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.Region with scala.Double] = js.native
}

