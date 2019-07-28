package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

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
  
  /* 6 */ val Hide: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction.Hide with Double = js.native
  /* 7 */ val MultipleRows: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction.MultipleRows with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction.None with Double = js.native
  /* 2 */ val Rotate45: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction.Rotate45 with Double = js.native
  /* 1 */ val Rotate90: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction.Rotate90 with Double = js.native
  /* 5 */ val Trim: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction.Trim with Double = js.native
  /* 3 */ val Wrap: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction.Wrap with Double = js.native
  /* 4 */ val WrapByword: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction.WrapByword with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelIntersectAction with Double] = js.native
}

