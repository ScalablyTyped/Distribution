package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorBarDirection extends js.Object

@JSGlobal("ej.datavisualization.Chart.ErrorBarDirection")
@js.native
object ErrorBarDirection extends js.Object {
  //string
  @js.native
  sealed trait Both
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarDirection
  
  //string
  @js.native
  sealed trait Minus
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarDirection
  
  //string
  @js.native
  sealed trait Plus
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarDirection
  
  /* 0 */ val Both: Both with scala.Double = js.native
  /* 2 */ val Minus: Minus with scala.Double = js.native
  /* 1 */ val Plus: Plus with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarDirection with scala.Double
  ] = js.native
}

