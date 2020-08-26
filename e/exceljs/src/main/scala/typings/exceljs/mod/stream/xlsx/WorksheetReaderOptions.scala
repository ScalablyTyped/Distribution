package typings.exceljs.mod.stream.xlsx

import typings.exceljs.mod.Workbook
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorksheetReaderOptions extends js.Object {
  var entry: Stream = js.native
  var id: Double = js.native
  var options: WorkbookStreamReaderOptions = js.native
  var workbook: Workbook = js.native
}

object WorksheetReaderOptions {
  @scala.inline
  def apply(entry: Stream, id: Double, options: WorkbookStreamReaderOptions, workbook: Workbook): WorksheetReaderOptions = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], workbook = workbook.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetReaderOptions]
  }
  @scala.inline
  implicit class WorksheetReaderOptionsOps[Self <: WorksheetReaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntry(value: Stream): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: WorkbookStreamReaderOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkbook(value: Workbook): Self = this.set("workbook", value.asInstanceOf[js.Any])
  }
  
}

