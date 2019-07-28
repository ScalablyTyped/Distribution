package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

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
  sealed trait Chart extends Region
  
  //string
  @js.native
  sealed trait Series extends Region
  
  /* 0 */ val Chart: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.Region.Chart with Double = js.native
  /* 1 */ val Series: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.Region.Series with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Region with Double] = js.native
}

