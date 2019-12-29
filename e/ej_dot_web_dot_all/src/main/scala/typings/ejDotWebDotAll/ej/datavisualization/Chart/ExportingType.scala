package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportingType with Double] = js.native
  /* 3 */ @js.native
  object DOCX extends TopLevel[DOCX with Double]
  
  /* 1 */ @js.native
  object JPG extends TopLevel[JPG with Double]
  
  /* 2 */ @js.native
  object PDF extends TopLevel[PDF with Double]
  
  /* 0 */ @js.native
  object PNG extends TopLevel[PNG with Double]
  
  /* 5 */ @js.native
  object SVG extends TopLevel[SVG with Double]
  
  /* 4 */ @js.native
  object XLSX extends TopLevel[XLSX with Double]
  
}

