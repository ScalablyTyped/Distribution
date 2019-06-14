package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangePadding extends js.Object

@JSGlobal("ej.datavisualization.Chart.RangePadding")
@js.native
object RangePadding extends js.Object {
  //string
  @js.native
  sealed trait Additional
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangePadding
  
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangePadding
  
  //string
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangePadding
  
  //string
  @js.native
  sealed trait Round
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangePadding
  
  /* 0 */ val Additional: Additional with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  /* 1 */ val Normal: Normal with scala.Double = js.native
  /* 3 */ val Round: Round with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.RangePadding with scala.Double
  ] = js.native
}

