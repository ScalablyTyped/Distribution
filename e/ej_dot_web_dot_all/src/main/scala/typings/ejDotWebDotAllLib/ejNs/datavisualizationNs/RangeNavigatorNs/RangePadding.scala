package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangePadding extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.RangePadding")
@js.native
object RangePadding extends js.Object {
  //string
  @js.native
  sealed trait Additional
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.RangePadding
  
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.RangePadding
  
  //string
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.RangePadding
  
  //string
  @js.native
  sealed trait Round
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.RangePadding
  
  val Additional: Additional with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  val Round: Round with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.RangePadding with java.lang.String
  ] = js.native
}

