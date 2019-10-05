package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelPlacement extends js.Object

@JSGlobal("ej.datavisualization.Chart.LabelPlacement")
@js.native
object LabelPlacement extends js.Object {
  //string
  @js.native
  sealed trait BetweenTicks extends LabelPlacement
  
  //string
  @js.native
  sealed trait OnTicks extends LabelPlacement
  
  /* 1 */ val BetweenTicks: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelPlacement.BetweenTicks with Double = js.native
  /* 0 */ val OnTicks: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelPlacement.OnTicks with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelPlacement with Double] = js.native
}

