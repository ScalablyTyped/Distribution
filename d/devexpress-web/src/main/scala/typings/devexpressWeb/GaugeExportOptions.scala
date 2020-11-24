package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Gauge dashboard item is exported.
  */
@js.native
trait GaugeExportOptions extends js.Object {
  
  /** @deprecated The GaugeExportOptions.AutoArrangeContent property is obsolete now. Use the DashboardPdfExportOptions.GaugeAutoArrangeContent property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether dashboard item elements are arranged automatically on the exported page.
    */
  var AutoArrangeContent: Boolean = js.native
}
object GaugeExportOptions {
  
  @scala.inline
  def apply(AutoArrangeContent: Boolean): GaugeExportOptions = {
    val __obj = js.Dynamic.literal(AutoArrangeContent = AutoArrangeContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeExportOptions]
  }
  
  @scala.inline
  implicit class GaugeExportOptionsOps[Self <: GaugeExportOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoArrangeContent(value: Boolean): Self = this.set("AutoArrangeContent", value.asInstanceOf[js.Any])
  }
}
