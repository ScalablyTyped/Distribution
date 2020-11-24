package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Range Filter dashboard item is exported.
  */
@js.native
trait RangeFilterExportOptions extends js.Object {
  
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
object RangeFilterExportOptions {
  
  @scala.inline
  def apply(AutomaticPageLayout: Boolean, SizeMode: String): RangeFilterExportOptions = {
    val __obj = js.Dynamic.literal(AutomaticPageLayout = AutomaticPageLayout.asInstanceOf[js.Any], SizeMode = SizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFilterExportOptions]
  }
  
  @scala.inline
  implicit class RangeFilterExportOptionsOps[Self <: RangeFilterExportOptions] (val x: Self) extends AnyVal {
    
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
