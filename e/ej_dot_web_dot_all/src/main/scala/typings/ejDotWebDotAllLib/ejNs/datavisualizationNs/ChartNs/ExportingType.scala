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
  
  val DOCX: DOCX with java.lang.String = js.native
  val JPG: JPG with java.lang.String = js.native
  val PDF: PDF with java.lang.String = js.native
  val PNG: PNG with java.lang.String = js.native
  val SVG: SVG with java.lang.String = js.native
  val XLSX: XLSX with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingType with java.lang.String
  ] = js.native
}

