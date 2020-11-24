package typings.exceljs.mod.stream.xlsx

import typings.exceljs.anon.PartialWorkbookStreamRead
import typings.exceljs.mod.Workbook
import typings.node.streamMod.Stream
import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("exceljs", "stream.xlsx.WorkbookReader")
@js.native
class WorkbookReader protected () extends Workbook {
  def this(input: String, options: PartialWorkbookStreamRead) = this()
  def this(input: Stream, options: PartialWorkbookStreamRead) = this()
  
  def parse(): AsyncIterator[_, _, js.UndefOr[scala.Nothing]] = js.native
  
  def read(): js.Promise[Unit] = js.native
}
