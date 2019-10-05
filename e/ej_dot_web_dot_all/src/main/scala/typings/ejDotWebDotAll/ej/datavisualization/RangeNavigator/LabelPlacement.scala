package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelPlacement extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.LabelPlacement")
@js.native
object LabelPlacement extends js.Object {
  //string
  @js.native
  sealed trait Inside extends LabelPlacement
  
  //string
  @js.native
  sealed trait Outside extends LabelPlacement
  
  /* 0 */ val Inside: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.LabelPlacement.Inside with Double = js.native
  /* 1 */ val Outside: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.LabelPlacement.Outside with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelPlacement with Double] = js.native
}

