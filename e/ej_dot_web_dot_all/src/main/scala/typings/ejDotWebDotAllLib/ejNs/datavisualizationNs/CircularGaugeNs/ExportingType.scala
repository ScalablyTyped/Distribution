package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportingType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.ExportingType")
@js.native
object ExportingType extends js.Object {
  //string
  @js.native
  sealed trait JPG
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.ExportingType
  
  //string
  @js.native
  sealed trait PNG
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.ExportingType
  
  val JPG: JPG with java.lang.String = js.native
  val PNG: PNG with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.ExportingType with java.lang.String
  ] = js.native
}

