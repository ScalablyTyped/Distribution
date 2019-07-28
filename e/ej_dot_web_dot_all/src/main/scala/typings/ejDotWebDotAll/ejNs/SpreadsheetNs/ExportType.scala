package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportType extends js.Object

@JSGlobal("ej.Spreadsheet.ExportType")
@js.native
object ExportType extends js.Object {
  ///Specifies to export the file in Csv format.
  @js.native
  sealed trait Csv extends ExportType
  
  ///Specifies to export the file in Excel format.
  @js.native
  sealed trait Excel extends ExportType
  
  ///Specifies to export the file in Pdf format.
  @js.native
  sealed trait Pdf extends ExportType
  
  /* 1 */ val Csv: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.ExportType.Csv with Double = js.native
  /* 0 */ val Excel: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.ExportType.Excel with Double = js.native
  /* 2 */ val Pdf: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.ExportType.Pdf with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportType with Double] = js.native
}

