package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportScaleModeStatic extends js.Object {
  /**
    * The size of the dashboard (dashboard item) is changed according to the width of the exported page.
    */
  var AutoFitToPageWidth: String
  /**
    * The size of the dashboard (dashboard item) is changed to fit its content on a single page.
    */
  var AutoFitWithinOnePage: String
  /**
    * The dashboard (dashboard item) on the exported page retains its original size.
    */
  var None: String
  /**
    * The size of the dashboard (dashboard item) on the exported page is changed according to the scale factor value.
    */
  var UseScaleFactor: String
}

object DashboardExportScaleModeStatic {
  @scala.inline
  def apply(AutoFitToPageWidth: String, AutoFitWithinOnePage: String, None: String, UseScaleFactor: String): DashboardExportScaleModeStatic = {
    val __obj = js.Dynamic.literal(AutoFitToPageWidth = AutoFitToPageWidth, AutoFitWithinOnePage = AutoFitWithinOnePage, None = None, UseScaleFactor = UseScaleFactor)
  
    __obj.asInstanceOf[DashboardExportScaleModeStatic]
  }
}

