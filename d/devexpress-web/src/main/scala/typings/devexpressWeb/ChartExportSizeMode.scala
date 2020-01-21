package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists constants used to specify how a Chart dashboard item should be resized when being exported.
  */
@JSGlobal("ChartExportSizeMode")
@js.native
class ChartExportSizeMode () extends js.Object

/* static members */
@JSGlobal("ChartExportSizeMode")
@js.native
object ChartExportSizeMode extends js.Object {
  /**
    * A chart dashboard item is exported in a size identical to that shown on the dashboard.
    */
  val None: String = js.native
  /**
    * A chart dashboard item is stretched or shrunk to fit the page to which it is exported.
    */
  val Stretch: String = js.native
  /**
    * A chart dashboard item is resized proportionally to best fit the exported page.
    */
  val Zoom: String = js.native
}

