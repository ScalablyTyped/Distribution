package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportScaleModeStatic extends js.Object {
  /**
    * The size of the dashboard (dashboard item) is changed according to the width of the exported page.
    */
  var AutoFitToPageWidth: java.lang.String
  /**
    * The size of the dashboard (dashboard item) is changed to fit its content on a single page.
    */
  var AutoFitWithinOnePage: java.lang.String
  /**
    * The dashboard (dashboard item) on the exported page retains its original size.
    */
  var None: java.lang.String
  /**
    * The size of the dashboard (dashboard item) on the exported page is changed according to the scale factor value.
    */
  var UseScaleFactor: java.lang.String
}

object DashboardExportScaleModeStatic {
  @scala.inline
  def apply(
    AutoFitToPageWidth: java.lang.String,
    AutoFitWithinOnePage: java.lang.String,
    None: java.lang.String,
    UseScaleFactor: java.lang.String
  ): DashboardExportScaleModeStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutoFitToPageWidth")(AutoFitToPageWidth)
    __obj.updateDynamic("AutoFitWithinOnePage")(AutoFitWithinOnePage)
    __obj.updateDynamic("None")(None)
    __obj.updateDynamic("UseScaleFactor")(UseScaleFactor)
    __obj.asInstanceOf[DashboardExportScaleModeStatic]
  }
}

