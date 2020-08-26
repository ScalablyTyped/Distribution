package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Grid dashboard item is exported.
  */
@js.native
trait GridExportOptions extends js.Object {
  /** @deprecated The GridExportOptions.FitToPageWidth property is obsolete now. Use the DashboardPdfExportOptions.GridFitToPageWidth property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the size of the Grid dashboard item is changed according to the width of the exported page.
    */
  var FitToPageWidth: Boolean = js.native
  /** @deprecated The GridExportOptions.PrintHeadersOnEveryPage property is obsolete now. Use the DashboardPdfExportOptions.GridPrintHeadersOnEveryPage property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether to print column headers of the Grid dashboard item on every page.
    */
  var PrintHeadersOnEveryPage: Boolean = js.native
}

object GridExportOptions {
  @scala.inline
  def apply(FitToPageWidth: Boolean, PrintHeadersOnEveryPage: Boolean): GridExportOptions = {
    val __obj = js.Dynamic.literal(FitToPageWidth = FitToPageWidth.asInstanceOf[js.Any], PrintHeadersOnEveryPage = PrintHeadersOnEveryPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridExportOptions]
  }
  @scala.inline
  implicit class GridExportOptionsOps[Self <: GridExportOptions] (val x: Self) extends AnyVal {
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
    def setFitToPageWidth(value: Boolean): Self = this.set("FitToPageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintHeadersOnEveryPage(value: Boolean): Self = this.set("PrintHeadersOnEveryPage", value.asInstanceOf[js.Any])
  }
  
}

