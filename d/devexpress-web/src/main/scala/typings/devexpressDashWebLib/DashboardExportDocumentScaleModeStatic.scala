package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportDocumentScaleModeStatic extends js.Object {
  /**
    * The size of the dashboard / dashboard item is changed according to the width of the exported pages.
    */
  var AutoFitToPagesWidth: java.lang.String
  /**
    * The dashboard / dashboard item on the exported page retains its original size.
    */
  var None: java.lang.String
  /**
    * The size of the dashboard / dashboard item on the exported page is changed according to the scale factor value (ScaleFactor).
    */
  var UseScaleFactor: java.lang.String
}

object DashboardExportDocumentScaleModeStatic {
  @scala.inline
  def apply(AutoFitToPagesWidth: java.lang.String, None: java.lang.String, UseScaleFactor: java.lang.String): DashboardExportDocumentScaleModeStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutoFitToPagesWidth")(AutoFitToPagesWidth)
    __obj.updateDynamic("None")(None)
    __obj.updateDynamic("UseScaleFactor")(UseScaleFactor)
    __obj.asInstanceOf[DashboardExportDocumentScaleModeStatic]
  }
}

