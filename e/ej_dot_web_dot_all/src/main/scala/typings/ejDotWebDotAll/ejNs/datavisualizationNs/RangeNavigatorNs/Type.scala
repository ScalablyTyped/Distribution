package typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs

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
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  //string
  @js.native
  sealed trait Line
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  //string
  @js.native
  sealed trait Spline
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  //string
  @js.native
  sealed trait SplineArea
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  //string
  @js.native
  sealed trait StepArea
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  //string
  @js.native
  sealed trait StepLine
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type
  
  /* 0 */ val Area: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type.Area with Double = js.native
  /* 1 */ val Line: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type.Line with Double = js.native
  /* 2 */ val Spline: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type.Spline with Double = js.native
  /* 4 */ val SplineArea: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type.SplineArea with Double = js.native
  /* 3 */ val StepArea: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type.StepArea with Double = js.native
  /* 5 */ val StepLine: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type.StepLine with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.Type with Double
  ] = js.native
}

