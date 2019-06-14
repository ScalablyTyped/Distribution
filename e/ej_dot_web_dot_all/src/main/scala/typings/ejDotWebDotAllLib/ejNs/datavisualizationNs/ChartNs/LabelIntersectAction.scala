package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

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
  sealed trait Hide
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction
  
  //string
  @js.native
  sealed trait MultipleRows
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction
  
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction
  
  //string
  @js.native
  sealed trait Rotate45
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction
  
  //string
  @js.native
  sealed trait Rotate90
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction
  
  //string
  @js.native
  sealed trait Trim
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction
  
  //string
  @js.native
  sealed trait Wrap
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction
  
  //string
  @js.native
  sealed trait WrapByword
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction
  
  /* 6 */ val Hide: Hide with scala.Double = js.native
  /* 7 */ val MultipleRows: MultipleRows with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Rotate45: Rotate45 with scala.Double = js.native
  /* 1 */ val Rotate90: Rotate90 with scala.Double = js.native
  /* 5 */ val Trim: Trim with scala.Double = js.native
  /* 3 */ val Wrap: Wrap with scala.Double = js.native
  /* 4 */ val WrapByword: WrapByword with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction with scala.Double
  ] = js.native
}

