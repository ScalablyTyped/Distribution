package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportingType extends js.Object

@JSGlobal("ej.datavisualization.Chart.ExportingType")
@js.native
object ExportingType extends js.Object {
  //string
  @js.native
  sealed trait DOCX extends ExportingType
  
  //string
  @js.native
  sealed trait JPG extends ExportingType
  
  //string
  @js.native
  sealed trait PDF extends ExportingType
  
  //string
  @js.native
  sealed trait PNG extends ExportingType
  
  //string
  @js.native
  sealed trait SVG extends ExportingType
  
  //string
  @js.native
  sealed trait XLSX extends ExportingType
  
}

