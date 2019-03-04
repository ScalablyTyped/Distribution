package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeFilterExportSizeModeStatic extends js.Object {
  /**
    * A Range Filter dashboard item is exported in a size identical to that shown on the dashboard.
    */
  var None: java.lang.String
  /**
    * A Range Filter dashboard item is stretched or shrunk to fit the page to which it is exported.
    */
  var Stretch: java.lang.String
  /**
    * A Range Filter dashboard item is resized proportionally to best fit the printed page.
    */
  var Zoom: java.lang.String
}

object RangeFilterExportSizeModeStatic {
  @scala.inline
  def apply(None: java.lang.String, Stretch: java.lang.String, Zoom: java.lang.String): RangeFilterExportSizeModeStatic = {
    val __obj = js.Dynamic.literal(None = None, Stretch = Stretch, Zoom = Zoom)
  
    __obj.asInstanceOf[RangeFilterExportSizeModeStatic]
  }
}

