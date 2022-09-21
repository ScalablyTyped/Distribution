package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings that specify parameters affecting how the Gauge dashboard item is exported.
  */
@JSGlobal("GaugeExportOptions")
@js.native
open class GaugeExportOptions ()
  extends StObject
     with typings.devexpressWeb.GaugeExportOptions {
  
  /** @deprecated The GaugeExportOptions.AutoArrangeContent property is obsolete now. Use the DashboardPdfExportOptions.GaugeAutoArrangeContent property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether dashboard item elements are arranged automatically on the exported page.
    */
  /* CompleteClass */
  var AutoArrangeContent: Boolean = js.native
}
