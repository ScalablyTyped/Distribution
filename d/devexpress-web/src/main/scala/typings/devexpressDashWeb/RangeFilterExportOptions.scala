package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Range Filter dashboard item is exported.
  */
@JSGlobal("RangeFilterExportOptions")
@js.native
class RangeFilterExportOptions () extends js.Object {
  /** @deprecated The RangeFilterExportOptions.AutomaticPageLayout property is obsolete now. Use the DashboardPdfExportOptions.RangeFilterAutomaticPageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the page orientation used to export a Range Filter dashboard item is selected automatically.
    */
  var AutomaticPageLayout: Boolean = js.native
  /** @deprecated The RangeFilterExportOptions.SizeMode property is obsolete now. Use the DashboardPdfExportOptions.RangeFilterSizeMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the export size mode for the Range Filter dashboard item.
    */
  var SizeMode: String = js.native
}

