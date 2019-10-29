package typings.exceljs.exceljsMod.stream.xlsx

import typings.exceljs.exceljsMod.Workbook
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("exceljs", "stream.xlsx.WorkbookWriter")
@js.native
class WorkbookWriter protected () extends Workbook {
  def this(options: Partial[WorkbookStreamWriterOptions]) = this()
  def addApp(): js.Promise[Unit] = js.native
  def addContentTypes(): js.Promise[Unit] = js.native
  def addCore(): js.Promise[Unit] = js.native
  def addOfficeRels(): js.Promise[Unit] = js.native
  def addSharedStrings(): js.Promise[Unit] = js.native
  def addStyles(): js.Promise[Unit] = js.native
  def addThemes(): js.Promise[Unit] = js.native
  def addWorkbook(): js.Promise[Unit] = js.native
  def addWorkbookRels(): js.Promise[Unit] = js.native
  // commit all worksheets, then add suplimentary files
  def commit(): js.Promise[Unit] = js.native
}

