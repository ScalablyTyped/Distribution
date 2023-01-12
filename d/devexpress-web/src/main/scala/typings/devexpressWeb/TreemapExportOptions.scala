package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Treemap dashboard item is Printing and Exporting.
  */
trait TreemapExportOptions extends StObject {
  
  /** @deprecated The TreemapExportOptions.AutomaticPageLayout property is obsolete now. Use the DashboardPdfExportOptions.TreemapAutomaticPageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the page orientation used to export a Treemap dashboard item is selected automatically.
    */
  var AutomaticPageLayout: Boolean
  
  /** @deprecated The TreemapExportOptions.SizeMode property is obsolete now. Use the DashboardPdfExportOptions.TreemapSizeMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the export size mode for the Treemap dashboard item.
    */
  var SizeMode: String
}
object TreemapExportOptions {
  
  inline def apply(AutomaticPageLayout: Boolean, SizeMode: String): TreemapExportOptions = {
    val __obj = js.Dynamic.literal(AutomaticPageLayout = AutomaticPageLayout.asInstanceOf[js.Any], SizeMode = SizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreemapExportOptions] (val x: Self) extends AnyVal {
    
    inline def setAutomaticPageLayout(value: Boolean): Self = StObject.set(x, "AutomaticPageLayout", value.asInstanceOf[js.Any])
    
    inline def setSizeMode(value: String): Self = StObject.set(x, "SizeMode", value.asInstanceOf[js.Any])
  }
}
