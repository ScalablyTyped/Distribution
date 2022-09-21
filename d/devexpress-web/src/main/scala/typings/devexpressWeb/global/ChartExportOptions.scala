package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how Chart dashboard items are exported.
  */
@JSGlobal("ChartExportOptions")
@js.native
open class ChartExportOptions ()
  extends StObject
     with typings.devexpressWeb.ChartExportOptions {
  
  /** @deprecated The ChartExportOptions.AutomaticPageLayout property is obsolete now. Use the DashboardPdfExportOptions.ChartAutomaticPageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the page orientation used to export a Chart dashboard item is selected automatically.
    */
  /* CompleteClass */
  var AutomaticPageLayout: Boolean = js.native
  
  /** @deprecated The ChartExportOptions.SizeMode property is obsolete now. Use the DashboardPdfExportOptions.ChartSizeMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the export size mode for the Chart dashboard item.
    */
  /* CompleteClass */
  var SizeMode: String = js.native
}
