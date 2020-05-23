package typings.ejWebAll.ej.Spreadsheet

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
  
}

