package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartExportSizeModeStatic extends js.Object {
  /**
    * A chart dashboard item is exported in a size identical to that shown on the dashboard.
    */
  var None: String
  /**
    * A chart dashboard item is stretched or shrunk to fit the page to which it is exported.
    */
  var Stretch: String
  /**
    * A chart dashboard item is resized proportionally to best fit the exported page.
    */
  var Zoom: String
}

object ChartExportSizeModeStatic {
  @scala.inline
  def apply(None: String, Stretch: String, Zoom: String): ChartExportSizeModeStatic = {
    val __obj = js.Dynamic.literal(None = None, Stretch = Stretch, Zoom = Zoom)
  
    __obj.asInstanceOf[ChartExportSizeModeStatic]
  }
}

