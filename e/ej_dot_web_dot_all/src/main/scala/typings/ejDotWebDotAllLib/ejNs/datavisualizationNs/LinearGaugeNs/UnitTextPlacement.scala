package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnitTextPlacement extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.UnitTextPlacement")
@js.native
object UnitTextPlacement extends js.Object {
  //string
  @js.native
  sealed trait Back
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.UnitTextPlacement
  
  //string
  @js.native
  sealed trait From
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.UnitTextPlacement
  
  val Back: Back with java.lang.String = js.native
  val From: From with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.UnitTextPlacement with java.lang.String
  ] = js.native
}

