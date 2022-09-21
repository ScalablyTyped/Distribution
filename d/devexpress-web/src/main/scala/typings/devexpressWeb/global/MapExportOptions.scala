package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how Map dashboard items are exported.
  */
@JSGlobal("MapExportOptions")
@js.native
open class MapExportOptions ()
  extends StObject
     with typings.devexpressWeb.MapExportOptions {
  
  /** @deprecated The MapExportOptions.AutomaticPageLayout property is obsolete now. Use the DashboardPdfExportOptions.MapAutomaticPageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the page orientation used to export a map dashboard item is selected automatically.
    */
  /* CompleteClass */
  var AutomaticPageLayout: Boolean = js.native
  
  /** @deprecated The MapExportOptions.SizeMode property is obsolete now. Use the DashboardPdfExportOptions.MapSizeMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the export size mode for the map dashboard item.
    */
  /* CompleteClass */
  var SizeMode: String = js.native
}
