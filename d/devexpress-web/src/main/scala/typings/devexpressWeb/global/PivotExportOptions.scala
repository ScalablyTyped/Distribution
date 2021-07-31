package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Pivot dashboard item is exported.
  */
@JSGlobal("PivotExportOptions")
@js.native
class PivotExportOptions ()
  extends StObject
     with typings.devexpressWeb.PivotExportOptions {
  
  /** @deprecated The PivotExportOptions.PrintHeadersOnEveryPage property is obsolete now. Use the DashboardPdfExportOptions.PivotPrintHeadersOnEveryPage property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether to print the column headers of the Pivot dashboard item on every page.
    */
  /* CompleteClass */
  var PrintHeadersOnEveryPage: Boolean = js.native
}
