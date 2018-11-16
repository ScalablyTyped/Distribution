package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportingMode extends js.Object

@JSGlobal("ej.datavisualization.DigitalGauge.ExportingMode")
@js.native
object ExportingMode extends js.Object {
  //string
  @js.native
  sealed trait ClientSide
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.ExportingMode
  
  //string
  @js.native
  sealed trait ServerSide
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.ExportingMode
  
  val ClientSide: ClientSide with java.lang.String = js.native
  val ServerSide: ServerSide with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DigitalGaugeNs.ExportingMode with java.lang.String
  ] = js.native
}

