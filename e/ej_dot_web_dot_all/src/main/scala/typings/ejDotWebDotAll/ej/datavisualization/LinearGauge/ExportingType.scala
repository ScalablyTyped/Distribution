package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportingType extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.ExportingType")
@js.native
object ExportingType extends js.Object {
  //string
  @js.native
  sealed trait JPG extends ExportingType
  
  //string
  @js.native
  sealed trait PNG extends ExportingType
  
  /* 1 */ val JPG: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.ExportingType.JPG with Double = js.native
  /* 0 */ val PNG: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.ExportingType.PNG with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportingType with Double] = js.native
}

