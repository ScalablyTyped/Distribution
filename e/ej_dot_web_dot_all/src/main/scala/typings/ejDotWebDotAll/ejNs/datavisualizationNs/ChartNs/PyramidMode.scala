package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PyramidMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.PyramidMode")
@js.native
object PyramidMode extends js.Object {
  //string
  @js.native
  sealed trait Linear extends PyramidMode
  
  //string
  @js.native
  sealed trait Surface extends PyramidMode
  
  /* 0 */ val Linear: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.PyramidMode.Linear with Double = js.native
  /* 1 */ val Surface: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.PyramidMode.Surface with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PyramidMode with Double] = js.native
}

