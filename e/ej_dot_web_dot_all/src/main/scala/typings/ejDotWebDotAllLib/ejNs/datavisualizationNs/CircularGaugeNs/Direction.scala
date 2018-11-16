package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.Direction")
@js.native
object Direction extends js.Object {
  //string
  @js.native
  sealed trait Clockwise
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.Direction
  
  //string
  @js.native
  sealed trait CounterClockwise
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.Direction
  
  val Clockwise: Clockwise with java.lang.String = js.native
  val CounterClockwise: CounterClockwise with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.Direction with java.lang.String
  ] = js.native
}

