package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnitTextPlacement extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.UnitTextPlacement")
@js.native
object UnitTextPlacement extends js.Object {
  //string
  @js.native
  sealed trait Back
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.UnitTextPlacement
  
  //string
  @js.native
  sealed trait Front
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.UnitTextPlacement
  
  val Back: Back with java.lang.String = js.native
  val Front: Front with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.UnitTextPlacement with java.lang.String
  ] = js.native
}

