package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelIntersectAction extends js.Object

@JSGlobal("ej.datavisualization.Chart.LabelIntersectAction")
@js.native
object LabelIntersectAction extends js.Object {
  //string
  @js.native
  sealed trait Hide extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait MultipleRows extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait None extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait Rotate45 extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait Rotate90 extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait Trim extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait Wrap extends LabelIntersectAction
  
  //string
  @js.native
  sealed trait WrapByword extends LabelIntersectAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelIntersectAction with Double] = js.native
  /* 6 */ @js.native
  object Hide extends TopLevel[Hide with Double]
  
  /* 7 */ @js.native
  object MultipleRows extends TopLevel[MultipleRows with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Rotate45 extends TopLevel[Rotate45 with Double]
  
  /* 1 */ @js.native
  object Rotate90 extends TopLevel[Rotate90 with Double]
  
  /* 5 */ @js.native
  object Trim extends TopLevel[Trim with Double]
  
  /* 3 */ @js.native
  object Wrap extends TopLevel[Wrap with Double]
  
  /* 4 */ @js.native
  object WrapByword extends TopLevel[WrapByword with Double]
  
}

