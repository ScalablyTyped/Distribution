package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Range Filter dashboard item is exported.
  */
trait RangeFilterExportOptions extends js.Object {
  /** @deprecated The RangeFilterExportOptions.AutomaticPageLayout property is obsolete now. Use the DashboardPdfExportOptions.RangeFilterAutomaticPageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the page orientation used to export a Range Filter dashboard item is selected automatically.
    */
  var AutomaticPageLayout: Boolean
  /** @deprecated The RangeFilterExportOptions.SizeMode property is obsolete now. Use the DashboardPdfExportOptions.RangeFilterSizeMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the export size mode for the Range Filter dashboard item.
    */
  var SizeMode: String
}

object RangeFilterExportOptions {
  @scala.inline
  def apply(AutomaticPageLayout: Boolean, SizeMode: String): RangeFilterExportOptions = {
    val __obj = js.Dynamic.literal(AutomaticPageLayout = AutomaticPageLayout.asInstanceOf[js.Any], SizeMode = SizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFilterExportOptions]
  }
}

