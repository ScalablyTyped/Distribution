package typings.ejDotWebDotAll.ej.datavisualization.Chart

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
  
  /* 2 */ val Center: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelAlignment.Center with Double = js.native
  /* 1 */ val Far: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelAlignment.Far with Double = js.native
  /* 0 */ val Near: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelAlignment.Near with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelAlignment with Double] = js.native
}

