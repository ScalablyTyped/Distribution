package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

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
  sealed trait Hide
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.LabelIntersectAction
  
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.LabelIntersectAction
  
  val Hide: Hide with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.LabelIntersectAction with java.lang.String
  ] = js.native
}

