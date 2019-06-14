package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.datavisualization.Chart.SelectionType")
@js.native
object SelectionType extends js.Object {
  //string
  @js.native
  sealed trait Multiple
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SelectionType
  
  //string
  @js.native
  sealed trait Single
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SelectionType
  
  /* 1 */ val Multiple: Multiple with scala.Double = js.native
  /* 0 */ val Single: Single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.SelectionType with scala.Double
  ] = js.native
}

