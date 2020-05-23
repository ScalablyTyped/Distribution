package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists values that specify a scale mode when exporting a dashboard (dashboard item).
  */
@JSGlobal("DashboardExportScaleMode")
@js.native
class DashboardExportScaleMode ()
  extends typings.devexpressWeb.DashboardExportScaleMode

/* static members */
@JSGlobal("DashboardExportScaleMode")
@js.native
object DashboardExportScaleMode extends js.Object {
  /**
    * The size of the dashboard (dashboard item) is changed according to the width of the exported page.
    */
  val AutoFitToPageWidth: String = js.native
  /**
    * The size of the dashboard (dashboard item) is changed to fit its content on a single page.
    */
  val AutoFitWithinOnePage: String = js.native
  /**
    * The dashboard (dashboard item) on the exported page retains its original size.
    */
  val None: String = js.native
  /**
    * The size of the dashboard (dashboard item) on the exported page is changed according to the scale factor value.
    */
  val UseScaleFactor: String = js.native
}

