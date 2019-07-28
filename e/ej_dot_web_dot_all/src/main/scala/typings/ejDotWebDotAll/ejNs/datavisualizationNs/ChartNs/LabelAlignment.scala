package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

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
  sealed trait Center extends LabelAlignment
  
  //string
  @js.native
  sealed trait Far extends LabelAlignment
  
  //string
  @js.native
  sealed trait Near extends LabelAlignment
  
  /* 2 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.LabelAlignment.Center with Double = js.native
  /* 1 */ val Far: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.LabelAlignment.Far with Double = js.native
  /* 0 */ val Near: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.LabelAlignment.Near with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelAlignment with Double] = js.native
}

