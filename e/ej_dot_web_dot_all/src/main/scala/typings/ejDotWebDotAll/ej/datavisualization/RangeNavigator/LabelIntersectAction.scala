package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.LabelIntersectAction.Hide
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.LabelIntersectAction.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelIntersectAction with Double] = js.native
  /* 1 */ @js.native
  object Hide extends TopLevel[Hide with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

