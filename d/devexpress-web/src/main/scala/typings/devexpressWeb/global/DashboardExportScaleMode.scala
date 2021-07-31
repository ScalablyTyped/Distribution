package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values that specify a scale mode when exporting a dashboard (dashboard item).
  */
@JSGlobal("DashboardExportScaleMode")
@js.native
class DashboardExportScaleMode ()
  extends StObject
     with typings.devexpressWeb.DashboardExportScaleMode
object DashboardExportScaleMode {
  
  /**
    * The size of the dashboard (dashboard item) is changed according to the width of the exported page.
    */
  /* static member */
  @JSGlobal("DashboardExportScaleMode.AutoFitToPageWidth")
  @js.native
  val AutoFitToPageWidth: String = js.native
  
  /**
    * The size of the dashboard (dashboard item) is changed to fit its content on a single page.
    */
  /* static member */
  @JSGlobal("DashboardExportScaleMode.AutoFitWithinOnePage")
  @js.native
  val AutoFitWithinOnePage: String = js.native
  
  /**
    * The dashboard (dashboard item) on the exported page retains its original size.
    */
  /* static member */
  @JSGlobal("DashboardExportScaleMode.None")
  @js.native
  val None: String = js.native
  
  /**
    * The size of the dashboard (dashboard item) on the exported page is changed according to the scale factor value.
    */
  /* static member */
  @JSGlobal("DashboardExportScaleMode.UseScaleFactor")
  @js.native
  val UseScaleFactor: String = js.native
}
