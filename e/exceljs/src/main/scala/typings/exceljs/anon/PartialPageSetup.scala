package typings.exceljs.anon

import typings.exceljs.exceljsStrings.NA
import typings.exceljs.exceljsStrings.None
import typings.exceljs.exceljsStrings.asDisplayed
import typings.exceljs.exceljsStrings.atEnd
import typings.exceljs.exceljsStrings.blank
import typings.exceljs.exceljsStrings.dash
import typings.exceljs.exceljsStrings.displayed
import typings.exceljs.exceljsStrings.downThenOver
import typings.exceljs.exceljsStrings.landscape
import typings.exceljs.exceljsStrings.overThenDown
import typings.exceljs.exceljsStrings.portrait
import typings.exceljs.mod.Margins
import typings.exceljs.mod.PaperSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.PageSetup> */
@js.native
trait PartialPageSetup extends js.Object {
  var blackAndWhite: js.UndefOr[Boolean] = js.native
  var cellComments: js.UndefOr[atEnd | asDisplayed | None] = js.native
  var draft: js.UndefOr[Boolean] = js.native
  var errors: js.UndefOr[dash | blank | NA | displayed] = js.native
  var firstPageNumber: js.UndefOr[Double] = js.native
  var fitToHeight: js.UndefOr[Double] = js.native
  var fitToPage: js.UndefOr[Boolean] = js.native
  var fitToWidth: js.UndefOr[Double] = js.native
  var horizontalCentered: js.UndefOr[Boolean] = js.native
  var horizontalDpi: js.UndefOr[Double] = js.native
  var margins: js.UndefOr[Margins] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
  var pageOrder: js.UndefOr[downThenOver | overThenDown] = js.native
  var paperSize: js.UndefOr[PaperSize] = js.native
  var printArea: js.UndefOr[String] = js.native
  var printTitlesColumn: js.UndefOr[String] = js.native
  var printTitlesRow: js.UndefOr[String] = js.native
  var scale: js.UndefOr[Double] = js.native
  var showGridLines: js.UndefOr[Boolean] = js.native
  var showRowColHeaders: js.UndefOr[Boolean] = js.native
  var verticalCentered: js.UndefOr[Boolean] = js.native
  var verticalDpi: js.UndefOr[Double] = js.native
}

object PartialPageSetup {
  @scala.inline
  def apply(): PartialPageSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageSetup]
  }
  @scala.inline
  implicit class PartialPageSetupOps[Self <: PartialPageSetup] (val x: Self) extends AnyVal {
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
    def setBlackAndWhite(value: Boolean): Self = this.set("blackAndWhite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlackAndWhite: Self = this.set("blackAndWhite", js.undefined)
    @scala.inline
    def setCellComments(value: atEnd | asDisplayed | None): Self = this.set("cellComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellComments: Self = this.set("cellComments", js.undefined)
    @scala.inline
    def setDraft(value: Boolean): Self = this.set("draft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraft: Self = this.set("draft", js.undefined)
    @scala.inline
    def setErrors(value: dash | blank | NA | displayed): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setFirstPageNumber(value: Double): Self = this.set("firstPageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageNumber: Self = this.set("firstPageNumber", js.undefined)
    @scala.inline
    def setFitToHeight(value: Double): Self = this.set("fitToHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitToHeight: Self = this.set("fitToHeight", js.undefined)
    @scala.inline
    def setFitToPage(value: Boolean): Self = this.set("fitToPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitToPage: Self = this.set("fitToPage", js.undefined)
    @scala.inline
    def setFitToWidth(value: Double): Self = this.set("fitToWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitToWidth: Self = this.set("fitToWidth", js.undefined)
    @scala.inline
    def setHorizontalCentered(value: Boolean): Self = this.set("horizontalCentered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalCentered: Self = this.set("horizontalCentered", js.undefined)
    @scala.inline
    def setHorizontalDpi(value: Double): Self = this.set("horizontalDpi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalDpi: Self = this.set("horizontalDpi", js.undefined)
    @scala.inline
    def setMargins(value: Margins): Self = this.set("margins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargins: Self = this.set("margins", js.undefined)
    @scala.inline
    def setOrientation(value: portrait | landscape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPageOrder(value: downThenOver | overThenDown): Self = this.set("pageOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageOrder: Self = this.set("pageOrder", js.undefined)
    @scala.inline
    def setPaperSize(value: PaperSize): Self = this.set("paperSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperSize: Self = this.set("paperSize", js.undefined)
    @scala.inline
    def setPrintArea(value: String): Self = this.set("printArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintArea: Self = this.set("printArea", js.undefined)
    @scala.inline
    def setPrintTitlesColumn(value: String): Self = this.set("printTitlesColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintTitlesColumn: Self = this.set("printTitlesColumn", js.undefined)
    @scala.inline
    def setPrintTitlesRow(value: String): Self = this.set("printTitlesRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintTitlesRow: Self = this.set("printTitlesRow", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setShowGridLines(value: Boolean): Self = this.set("showGridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGridLines: Self = this.set("showGridLines", js.undefined)
    @scala.inline
    def setShowRowColHeaders(value: Boolean): Self = this.set("showRowColHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRowColHeaders: Self = this.set("showRowColHeaders", js.undefined)
    @scala.inline
    def setVerticalCentered(value: Boolean): Self = this.set("verticalCentered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalCentered: Self = this.set("verticalCentered", js.undefined)
    @scala.inline
    def setVerticalDpi(value: Double): Self = this.set("verticalDpi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalDpi: Self = this.set("verticalDpi", js.undefined)
  }
  
}

