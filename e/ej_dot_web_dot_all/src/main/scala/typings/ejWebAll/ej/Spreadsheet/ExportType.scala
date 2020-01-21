package typings.ejWebAll.ej.Spreadsheet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportType with Double] = js.native
  /* 1 */ @js.native
  object Csv extends TopLevel[Csv with Double]
  
  /* 0 */ @js.native
  object Excel extends TopLevel[Excel with Double]
  
  /* 2 */ @js.native
  object Pdf extends TopLevel[Pdf with Double]
  
}

