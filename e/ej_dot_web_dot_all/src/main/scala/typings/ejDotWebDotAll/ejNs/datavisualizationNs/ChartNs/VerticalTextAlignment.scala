package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalTextAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.VerticalTextAlignment")
@js.native
object VerticalTextAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends VerticalTextAlignment
  
  //string
  @js.native
  sealed trait Far extends VerticalTextAlignment
  
  //string
  @js.native
  sealed trait Near extends VerticalTextAlignment
  
  /* 0 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.VerticalTextAlignment.Center with Double = js.native
  /* 2 */ val Far: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.VerticalTextAlignment.Far with Double = js.native
  /* 1 */ val Near: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.VerticalTextAlignment.Near with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalTextAlignment with Double] = js.native
}

