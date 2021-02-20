package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Treemap dashboard item is Printing and Exporting.
  */
@js.native
trait TreemapExportOptions extends StObject {
  
  /** @deprecated The TreemapExportOptions.AutomaticPageLayout property is obsolete now. Use the DashboardPdfExportOptions.TreemapAutomaticPageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the page orientation used to export a Treemap dashboard item is selected automatically.
    */
  var AutomaticPageLayout: Boolean = js.native
  
  /** @deprecated The TreemapExportOptions.SizeMode property is obsolete now. Use the DashboardPdfExportOptions.TreemapSizeMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the export size mode for the Treemap dashboard item.
    */
  var SizeMode: String = js.native
}
object TreemapExportOptions {
  
  @scala.inline
  def apply(AutomaticPageLayout: Boolean, SizeMode: String): TreemapExportOptions = {
    val __obj = js.Dynamic.literal(AutomaticPageLayout = AutomaticPageLayout.asInstanceOf[js.Any], SizeMode = SizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapExportOptions]
  }
  
  @scala.inline
  implicit class TreemapExportOptionsMutableBuilder[Self <: TreemapExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticPageLayout(value: Boolean): Self = StObject.set(x, "AutomaticPageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeMode(value: String): Self = StObject.set(x, "SizeMode", value.asInstanceOf[js.Any])
  }
}
