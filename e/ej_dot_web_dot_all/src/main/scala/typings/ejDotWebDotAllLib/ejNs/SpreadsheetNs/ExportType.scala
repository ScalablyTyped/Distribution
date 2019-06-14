package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

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
  sealed trait Csv
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ExportType
  
  ///Specifies to export the file in Excel format.
  @js.native
  sealed trait Excel
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ExportType
  
  ///Specifies to export the file in Pdf format.
  @js.native
  sealed trait Pdf
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ExportType
  
  /* 1 */ val Csv: Csv with scala.Double = js.native
  /* 0 */ val Excel: Excel with scala.Double = js.native
  /* 2 */ val Pdf: Pdf with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.ExportType with scala.Double] = js.native
}

