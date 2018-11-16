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
  
  val Inside: Inside with java.lang.String = js.native
  val Outside: Outside with java.lang.String = js.native
  val OutsideExtended: OutsideExtended with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LabelPosition with java.lang.String
  ] = js.native
}

