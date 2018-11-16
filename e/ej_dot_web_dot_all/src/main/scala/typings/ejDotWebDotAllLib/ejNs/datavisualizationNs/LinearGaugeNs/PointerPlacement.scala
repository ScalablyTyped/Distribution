package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerPlacement extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.PointerPlacement")
@js.native
object PointerPlacement extends js.Object {
  //string
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.PointerPlacement
  
  //string
  @js.native
  sealed trait Far
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.PointerPlacement
  
  //string
  @js.native
  sealed trait Near
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.PointerPlacement
  
  val Center: Center with java.lang.String = js.native
  val Far: Far with java.lang.String = js.native
  val Near: Near with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.PointerPlacement with java.lang.String
  ] = js.native
}

