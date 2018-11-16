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
  
  val Both: Both with java.lang.String = js.native
  val Minus: Minus with java.lang.String = js.native
  val Plus: Plus with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarDirection with java.lang.String
  ] = js.native
}

