package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Gauge dashboard item is exported.
  */
trait GaugeExportOptions extends js.Object {
  /** @deprecated The GaugeExportOptions.AutoArrangeContent property is obsolete now. Use the DashboardPdfExportOptions.GaugeAutoArrangeContent property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether dashboard item elements are arranged automatically on the exported page.
    */
  var AutoArrangeContent: Boolean
}

object GaugeExportOptions {
  @scala.inline
  def apply(AutoArrangeContent: Boolean): GaugeExportOptions = {
    val __obj = js.Dynamic.literal(AutoArrangeContent = AutoArrangeContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeExportOptions]
  }
}

