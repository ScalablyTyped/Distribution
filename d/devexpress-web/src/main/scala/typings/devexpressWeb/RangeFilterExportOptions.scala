package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Range Filter dashboard item is exported.
  */
trait RangeFilterExportOptions extends StObject {
  
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
  
  inline def apply(AutomaticPageLayout: Boolean, SizeMode: String): RangeFilterExportOptions = {
    val __obj = js.Dynamic.literal(AutomaticPageLayout = AutomaticPageLayout.asInstanceOf[js.Any], SizeMode = SizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFilterExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeFilterExportOptions] (val x: Self) extends AnyVal {
    
    inline def setAutomaticPageLayout(value: Boolean): Self = StObject.set(x, "AutomaticPageLayout", value.asInstanceOf[js.Any])
    
    inline def setSizeMode(value: String): Self = StObject.set(x, "SizeMode", value.asInstanceOf[js.Any])
  }
}
