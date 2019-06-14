package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorBarMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.ErrorBarMode")
@js.native
object ErrorBarMode extends js.Object {
  //string
  @js.native
  sealed trait Both
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarMode
  
  //string
  @js.native
  sealed trait Horizontal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarMode
  
  //string
  @js.native
  sealed trait Vertical
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarMode
  
  /* 0 */ val Both: Both with scala.Double = js.native
  /* 2 */ val Horizontal: Horizontal with scala.Double = js.native
  /* 1 */ val Vertical: Vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarMode with scala.Double
  ] = js.native
}

