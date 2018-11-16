package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.Position")
@js.native
object Position extends js.Object {
  //string
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.Position
  
  //string
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.Position
  
  val Bottom: Bottom with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.Position with java.lang.String
  ] = js.native
}

