package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how Map dashboard items are exported.
  */
trait MapExportOptions extends StObject {
  
  /** @deprecated The MapExportOptions.AutomaticPageLayout property is obsolete now. Use the DashboardPdfExportOptions.MapAutomaticPageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the page orientation used to export a map dashboard item is selected automatically.
    */
  var AutomaticPageLayout: Boolean
  
  /** @deprecated The MapExportOptions.SizeMode property is obsolete now. Use the DashboardPdfExportOptions.MapSizeMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the export size mode for the map dashboard item.
    */
  var SizeMode: String
}
object MapExportOptions {
  
  inline def apply(AutomaticPageLayout: Boolean, SizeMode: String): MapExportOptions = {
    val __obj = js.Dynamic.literal(AutomaticPageLayout = AutomaticPageLayout.asInstanceOf[js.Any], SizeMode = SizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapExportOptions] (val x: Self) extends AnyVal {
    
    inline def setAutomaticPageLayout(value: Boolean): Self = StObject.set(x, "AutomaticPageLayout", value.asInstanceOf[js.Any])
    
    inline def setSizeMode(value: String): Self = StObject.set(x, "SizeMode", value.asInstanceOf[js.Any])
  }
}
