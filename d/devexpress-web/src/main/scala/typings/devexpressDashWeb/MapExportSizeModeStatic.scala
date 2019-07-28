package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapExportSizeModeStatic extends js.Object {
  /**
    * A map dashboard item is exported in a size identical to that shown on the dashboard
    */
  var None: String
  /**
    * A map dashboard item is resized proportionally to best fit the exported page.
    */
  var Zoom: String
}

object MapExportSizeModeStatic {
  @scala.inline
  def apply(None: String, Zoom: String): MapExportSizeModeStatic = {
    val __obj = js.Dynamic.literal(None = None, Zoom = Zoom)
  
    __obj.asInstanceOf[MapExportSizeModeStatic]
  }
}

