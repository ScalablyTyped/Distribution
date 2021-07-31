package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Grid dashboard item is exported.
  */
@JSGlobal("GridExportOptions")
@js.native
class GridExportOptions ()
  extends StObject
     with typings.devexpressWeb.GridExportOptions {
  
  /** @deprecated The GridExportOptions.FitToPageWidth property is obsolete now. Use the DashboardPdfExportOptions.GridFitToPageWidth property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the size of the Grid dashboard item is changed according to the width of the exported page.
    */
  /* CompleteClass */
  var FitToPageWidth: Boolean = js.native
  
  /** @deprecated The GridExportOptions.PrintHeadersOnEveryPage property is obsolete now. Use the DashboardPdfExportOptions.GridPrintHeadersOnEveryPage property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether to print column headers of the Grid dashboard item on every page.
    */
  /* CompleteClass */
  var PrintHeadersOnEveryPage: Boolean = js.native
}
