package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Pivot dashboard item is exported.
  */
@js.native
trait PivotExportOptions extends js.Object {
  /** @deprecated The PivotExportOptions.PrintHeadersOnEveryPage property is obsolete now. Use the DashboardPdfExportOptions.PivotPrintHeadersOnEveryPage property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether to print the column headers of the Pivot dashboard item on every page.
    */
  var PrintHeadersOnEveryPage: Boolean = js.native
}

object PivotExportOptions {
  @scala.inline
  def apply(PrintHeadersOnEveryPage: Boolean): PivotExportOptions = {
    val __obj = js.Dynamic.literal(PrintHeadersOnEveryPage = PrintHeadersOnEveryPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotExportOptions]
  }
  @scala.inline
  implicit class PivotExportOptionsOps[Self <: PivotExportOptions] (val x: Self) extends AnyVal {
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
    def setPrintHeadersOnEveryPage(value: Boolean): Self = this.set("PrintHeadersOnEveryPage", value.asInstanceOf[js.Any])
  }
  
}

