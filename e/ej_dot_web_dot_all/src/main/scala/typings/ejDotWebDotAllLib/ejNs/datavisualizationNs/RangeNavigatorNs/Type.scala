package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.Type")
@js.native
object Type extends js.Object {
  //string
  @js.native
  sealed trait Area
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  //string
  @js.native
  sealed trait Line
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  //string
  @js.native
  sealed trait Spline
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  //string
  @js.native
  sealed trait SplineArea
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  //string
  @js.native
  sealed trait StepArea
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  //string
  @js.native
  sealed trait StepLine
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  /* 0 */ val Area: Area with scala.Double = js.native
  /* 1 */ val Line: Line with scala.Double = js.native
  /* 2 */ val Spline: Spline with scala.Double = js.native
  /* 4 */ val SplineArea: SplineArea with scala.Double = js.native
  /* 3 */ val StepArea: StepArea with scala.Double = js.native
  /* 5 */ val StepLine: StepLine with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.Type with scala.Double
  ] = js.native
}

