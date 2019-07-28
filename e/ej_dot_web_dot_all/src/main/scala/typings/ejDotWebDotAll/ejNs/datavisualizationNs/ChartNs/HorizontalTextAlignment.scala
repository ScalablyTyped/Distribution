package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalTextAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.HorizontalTextAlignment")
@js.native
object HorizontalTextAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends HorizontalTextAlignment
  
  //string
  @js.native
  sealed trait Far extends HorizontalTextAlignment
  
  //string
  @js.native
  sealed trait Near extends HorizontalTextAlignment
  
  /* 0 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.HorizontalTextAlignment.Center with Double = js.native
  /* 2 */ val Far: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.HorizontalTextAlignment.Far with Double = js.native
  /* 1 */ val Near: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.HorizontalTextAlignment.Near with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalTextAlignment with Double] = js.native
}

