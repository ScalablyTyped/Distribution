package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportingType extends js.Object

@JSGlobal("ej.datavisualization.DigitalGauge.ExportingType")
@js.native
object ExportingType extends js.Object {
  //string
  @js.native
  sealed trait JPG extends ExportingType
  
  //string
  @js.native
  sealed trait PNG extends ExportingType
  
  /* 1 */ val JPG: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.ExportingType.JPG with Double = js.native
  /* 0 */ val PNG: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DigitalGaugeNs.ExportingType.PNG with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportingType with Double] = js.native
}

