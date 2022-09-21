package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values that specify a scale mode when exporting a dashboard/dashboard item.
  */
@JSGlobal("DashboardExportDocumentScaleMode")
@js.native
open class DashboardExportDocumentScaleMode ()
  extends StObject
     with typings.devexpressWeb.DashboardExportDocumentScaleMode
object DashboardExportDocumentScaleMode {
  
  /**
    * The size of the dashboard / dashboard item is changed according to the width of the exported pages.
    */
  /* static member */
  @JSGlobal("DashboardExportDocumentScaleMode.AutoFitToPagesWidth")
  @js.native
  val AutoFitToPagesWidth: String = js.native
  
  /**
    * The dashboard / dashboard item on the exported page retains its original size.
    */
  /* static member */
  @JSGlobal("DashboardExportDocumentScaleMode.None")
  @js.native
  val None: String = js.native
  
  /**
    * The size of the dashboard / dashboard item on the exported page is changed according to the scale factor value (DashboardPdfExportOptions.ScaleFactor).
    */
  /* static member */
  @JSGlobal("DashboardExportDocumentScaleMode.UseScaleFactor")
  @js.native
  val UseScaleFactor: String = js.native
}
