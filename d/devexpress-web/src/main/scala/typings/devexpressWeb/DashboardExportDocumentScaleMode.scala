package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists values that specify a scale mode when exporting a dashboard/dashboard item.
  */
@JSGlobal("DashboardExportDocumentScaleMode")
@js.native
class DashboardExportDocumentScaleMode () extends js.Object

/* static members */
@JSGlobal("DashboardExportDocumentScaleMode")
@js.native
object DashboardExportDocumentScaleMode extends js.Object {
  /**
    * The size of the dashboard / dashboard item is changed according to the width of the exported pages.
    */
  val AutoFitToPagesWidth: String = js.native
  /**
    * The dashboard / dashboard item on the exported page retains its original size.
    */
  val None: String = js.native
  /**
    * The size of the dashboard / dashboard item on the exported page is changed according to the scale factor value (DashboardPdfExportOptions.ScaleFactor).
    */
  val UseScaleFactor: String = js.native
}

