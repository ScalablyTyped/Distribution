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
  
  val Area: Area with java.lang.String = js.native
  val Line: Line with java.lang.String = js.native
  val Spline: Spline with java.lang.String = js.native
  val SplineArea: SplineArea with java.lang.String = js.native
  val StepArea: StepArea with java.lang.String = js.native
  val StepLine: StepLine with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.Type with java.lang.String
  ] = js.native
}

