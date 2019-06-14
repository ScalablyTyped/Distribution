package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

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
  sealed trait DOCX
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingType
  
  //string
  @js.native
  sealed trait JPG
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingType
  
  //string
  @js.native
  sealed trait PDF
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingType
  
  //string
  @js.native
  sealed trait PNG
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingType
  
  //string
  @js.native
  sealed trait SVG
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingType
  
  //string
  @js.native
  sealed trait XLSX
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingType
  
  /* 3 */ val DOCX: DOCX with scala.Double = js.native
  /* 1 */ val JPG: JPG with scala.Double = js.native
  /* 2 */ val PDF: PDF with scala.Double = js.native
  /* 0 */ val PNG: PNG with scala.Double = js.native
  /* 5 */ val SVG: SVG with scala.Double = js.native
  /* 4 */ val XLSX: XLSX with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingType with scala.Double
  ] = js.native
}

