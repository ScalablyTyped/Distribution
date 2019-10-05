package typings.ejDotWebDotAll.ej.datavisualization.Chart

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
  
  /* 6 */ val Hide: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelIntersectAction.Hide with Double = js.native
  /* 7 */ val MultipleRows: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelIntersectAction.MultipleRows with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelIntersectAction.None with Double = js.native
  /* 2 */ val Rotate45: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelIntersectAction.Rotate45 with Double = js.native
  /* 1 */ val Rotate90: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelIntersectAction.Rotate90 with Double = js.native
  /* 5 */ val Trim: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelIntersectAction.Trim with Double = js.native
  /* 3 */ val Wrap: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelIntersectAction.Wrap with Double = js.native
  /* 4 */ val WrapByword: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelIntersectAction.WrapByword with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelIntersectAction with Double] = js.native
}

