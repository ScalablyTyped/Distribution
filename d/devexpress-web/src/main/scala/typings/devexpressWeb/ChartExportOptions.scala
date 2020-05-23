package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how Chart dashboard items are exported.
  */
trait ChartExportOptions extends js.Object {
  /** @deprecated The ChartExportOptions.AutomaticPageLayout property is obsolete now. Use the DashboardPdfExportOptions.ChartAutomaticPageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the page orientation used to export a Chart dashboard item is selected automatically.
    */
  var AutomaticPageLayout: Boolean
  /** @deprecated The ChartExportOptions.SizeMode property is obsolete now. Use the DashboardPdfExportOptions.ChartSizeMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the export size mode for the Chart dashboard item.
    */
  var SizeMode: String
}

object ChartExportOptions {
  @scala.inline
  def apply(AutomaticPageLayout: Boolean, SizeMode: String): ChartExportOptions = {
    val __obj = js.Dynamic.literal(AutomaticPageLayout = AutomaticPageLayout.asInstanceOf[js.Any], SizeMode = SizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartExportOptions]
  }
}

