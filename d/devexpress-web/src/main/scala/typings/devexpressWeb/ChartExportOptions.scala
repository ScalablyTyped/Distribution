package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how Chart dashboard items are exported.
  */
@js.native
trait ChartExportOptions extends js.Object {
  /** @deprecated The ChartExportOptions.AutomaticPageLayout property is obsolete now. Use the DashboardPdfExportOptions.ChartAutomaticPageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the page orientation used to export a Chart dashboard item is selected automatically.
    */
  var AutomaticPageLayout: Boolean = js.native
  /** @deprecated The ChartExportOptions.SizeMode property is obsolete now. Use the DashboardPdfExportOptions.ChartSizeMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the export size mode for the Chart dashboard item.
    */
  var SizeMode: String = js.native
}

object ChartExportOptions {
  @scala.inline
  def apply(AutomaticPageLayout: Boolean, SizeMode: String): ChartExportOptions = {
    val __obj = js.Dynamic.literal(AutomaticPageLayout = AutomaticPageLayout.asInstanceOf[js.Any], SizeMode = SizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartExportOptions]
  }
  @scala.inline
  implicit class ChartExportOptionsOps[Self <: ChartExportOptions] (val x: Self) extends AnyVal {
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
    def setAutomaticPageLayout(value: Boolean): Self = this.set("AutomaticPageLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeMode(value: String): Self = this.set("SizeMode", value.asInstanceOf[js.Any])
  }
  
}

