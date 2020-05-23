package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Pivot dashboard item is exported.
  */
trait PivotExportOptions extends js.Object {
  /** @deprecated The PivotExportOptions.PrintHeadersOnEveryPage property is obsolete now. Use the DashboardPdfExportOptions.PivotPrintHeadersOnEveryPage property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether to print the column headers of the Pivot dashboard item on every page.
    */
  var PrintHeadersOnEveryPage: Boolean
}

object PivotExportOptions {
  @scala.inline
  def apply(PrintHeadersOnEveryPage: Boolean): PivotExportOptions = {
    val __obj = js.Dynamic.literal(PrintHeadersOnEveryPage = PrintHeadersOnEveryPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotExportOptions]
  }
}

