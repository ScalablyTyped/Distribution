package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardExportDocumentScaleModeStatic extends js.Object {
  /**
    * The size of the dashboard / dashboard item is changed according to the width of the exported pages.
    */
  var AutoFitToPagesWidth: String
  /**
    * The dashboard / dashboard item on the exported page retains its original size.
    */
  var None: String
  /**
    * The size of the dashboard / dashboard item on the exported page is changed according to the scale factor value (ScaleFactor).
    */
  var UseScaleFactor: String
}

object DashboardExportDocumentScaleModeStatic {
  @scala.inline
  def apply(AutoFitToPagesWidth: String, None: String, UseScaleFactor: String): DashboardExportDocumentScaleModeStatic = {
    val __obj = js.Dynamic.literal(AutoFitToPagesWidth = AutoFitToPagesWidth, None = None, UseScaleFactor = UseScaleFactor)
  
    __obj.asInstanceOf[DashboardExportDocumentScaleModeStatic]
  }
}

