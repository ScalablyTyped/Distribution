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
  
  val Csv: Csv with java.lang.String = js.native
  val Excel: Excel with java.lang.String = js.native
  val Pdf: Pdf with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.ExportType with java.lang.String] = js.native
}

