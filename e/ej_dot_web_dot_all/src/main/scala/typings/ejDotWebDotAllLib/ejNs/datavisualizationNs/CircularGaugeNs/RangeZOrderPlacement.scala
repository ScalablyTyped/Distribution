package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeZOrderPlacement extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.RangeZOrderPlacement")
@js.native
object RangeZOrderPlacement extends js.Object {
  //string
  @js.native
  sealed trait Front
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.RangeZOrderPlacement
  
  //string
  @js.native
  sealed trait Rear
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.RangeZOrderPlacement
  
  val Front: Front with java.lang.String = js.native
  val Rear: Rear with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.RangeZOrderPlacement with java.lang.String
  ] = js.native
}

