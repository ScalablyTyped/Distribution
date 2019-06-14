package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelPosition extends js.Object

@JSGlobal("ej.datavisualization.Chart.LabelPosition")
@js.native
object LabelPosition extends js.Object {
  //string
  @js.native
  sealed trait Inside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelPosition
  
  //string
  @js.native
  sealed trait Outside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelPosition
  
  //string
  @js.native
  sealed trait OutsideExtended
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelPosition
  
  /* 0 */ val Inside: Inside with scala.Double = js.native
  /* 1 */ val Outside: Outside with scala.Double = js.native
  /* 2 */ val OutsideExtended: OutsideExtended with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelPosition with scala.Double
  ] = js.native
}

