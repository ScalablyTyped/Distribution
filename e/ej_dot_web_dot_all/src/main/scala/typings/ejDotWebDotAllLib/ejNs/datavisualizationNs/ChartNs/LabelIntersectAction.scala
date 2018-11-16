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
  
  val Hide: Hide with java.lang.String = js.native
  val MultipleRows: MultipleRows with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Rotate45: Rotate45 with java.lang.String = js.native
  val Rotate90: Rotate90 with java.lang.String = js.native
  val Trim: Trim with java.lang.String = js.native
  val Wrap: Wrap with java.lang.String = js.native
  val WrapByword: WrapByword with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelIntersectAction with java.lang.String
  ] = js.native
}

