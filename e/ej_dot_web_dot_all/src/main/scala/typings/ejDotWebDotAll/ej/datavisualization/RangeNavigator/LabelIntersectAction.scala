package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelIntersectAction extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.LabelIntersectAction")
@js.native
object LabelIntersectAction extends js.Object {
  //string
  @js.native
  sealed trait Hide extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait None extends LabelIntersectAction
  
  /* 1 */ val Hide: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.LabelIntersectAction.Hide with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.LabelIntersectAction.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelIntersectAction with Double] = js.native
}

