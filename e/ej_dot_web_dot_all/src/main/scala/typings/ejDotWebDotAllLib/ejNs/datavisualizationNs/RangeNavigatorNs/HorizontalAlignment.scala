package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.HorizontalAlignment
  
  //string
  @js.native
  sealed trait Middle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.HorizontalAlignment
  
  //string
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.HorizontalAlignment
  
  val Left: Left with java.lang.String = js.native
  val Middle: Middle with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.HorizontalAlignment with java.lang.String
  ] = js.native
}

