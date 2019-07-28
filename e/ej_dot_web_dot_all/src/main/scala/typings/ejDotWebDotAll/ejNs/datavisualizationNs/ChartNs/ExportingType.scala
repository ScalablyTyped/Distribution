package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

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
  
  /* 3 */ val DOCX: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ExportingType.DOCX with Double = js.native
  /* 1 */ val JPG: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ExportingType.JPG with Double = js.native
  /* 2 */ val PDF: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ExportingType.PDF with Double = js.native
  /* 0 */ val PNG: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ExportingType.PNG with Double = js.native
  /* 5 */ val SVG: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ExportingType.SVG with Double = js.native
  /* 4 */ val XLSX: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ExportingType.XLSX with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportingType with Double] = js.native
}

