package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeType extends js.Object

@JSGlobal("ej.datavisualization.Chart.RangeType")
@js.native
object RangeType extends js.Object {
  //string
  @js.native
  sealed trait X extends RangeType
  
  //string
  @js.native
  sealed trait XY extends RangeType
  
  //string
  @js.native
  sealed trait Y extends RangeType
  
  /* 1 */ val X: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.RangeType.X with Double = js.native
  /* 0 */ val XY: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.RangeType.XY with Double = js.native
  /* 2 */ val Y: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.RangeType.Y with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RangeType with Double] = js.native
}

