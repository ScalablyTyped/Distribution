package typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge.ExportingType.JPG
import typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge.ExportingType.PNG
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportingType with Double] = js.native
  /* 1 */ @js.native
  object JPG extends TopLevel[JPG with Double]
  
  /* 0 */ @js.native
  object PNG extends TopLevel[PNG with Double]
  
}

