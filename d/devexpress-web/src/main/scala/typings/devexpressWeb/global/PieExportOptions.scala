package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Pie dashboard item is exported.
  */
@JSGlobal("PieExportOptions")
@js.native
class PieExportOptions ()
  extends StObject
     with typings.devexpressWeb.PieExportOptions {
  
  /** @deprecated The PieExportOptions.AutoArrangeContent property is obsolete now. Use the DashboardPdfExportOptions.PieAutoArrangeContent property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether dashboard item elements are arranged automatically on the exported page.
    */
  /* CompleteClass */
  var AutoArrangeContent: Boolean = js.native
}
