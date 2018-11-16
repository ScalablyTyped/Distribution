package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelPlacement extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.LabelPlacement")
@js.native
object LabelPlacement extends js.Object {
  //string
  @js.native
  sealed trait Inside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.LabelPlacement
  
  //string
  @js.native
  sealed trait Outside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.LabelPlacement
  
  val Inside: Inside with java.lang.String = js.native
  val Outside: Outside with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.LabelPlacement with java.lang.String
  ] = js.native
}

