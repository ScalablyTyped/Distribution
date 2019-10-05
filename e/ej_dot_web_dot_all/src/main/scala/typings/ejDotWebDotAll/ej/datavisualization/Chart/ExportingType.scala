package typings.ejDotWebDotAll.ej.datavisualization.Chart

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
  
  /* 3 */ val DOCX: typings.ejDotWebDotAll.ej.datavisualization.Chart.ExportingType.DOCX with Double = js.native
  /* 1 */ val JPG: typings.ejDotWebDotAll.ej.datavisualization.Chart.ExportingType.JPG with Double = js.native
  /* 2 */ val PDF: typings.ejDotWebDotAll.ej.datavisualization.Chart.ExportingType.PDF with Double = js.native
  /* 0 */ val PNG: typings.ejDotWebDotAll.ej.datavisualization.Chart.ExportingType.PNG with Double = js.native
  /* 5 */ val SVG: typings.ejDotWebDotAll.ej.datavisualization.Chart.ExportingType.SVG with Double = js.native
  /* 4 */ val XLSX: typings.ejDotWebDotAll.ej.datavisualization.Chart.ExportingType.XLSX with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportingType with Double] = js.native
}

