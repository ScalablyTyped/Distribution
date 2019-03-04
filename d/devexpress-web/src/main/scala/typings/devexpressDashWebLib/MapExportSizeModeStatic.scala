package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapExportSizeModeStatic extends js.Object {
  /**
    * A map dashboard item is exported in a size identical to that shown on the dashboard
    */
  var None: java.lang.String
  /**
    * A map dashboard item is resized proportionally to best fit the exported page.
    */
  var Zoom: java.lang.String
}

object MapExportSizeModeStatic {
  @scala.inline
  def apply(None: java.lang.String, Zoom: java.lang.String): MapExportSizeModeStatic = {
    val __obj = js.Dynamic.literal(None = None, Zoom = Zoom)
  
    __obj.asInstanceOf[MapExportSizeModeStatic]
  }
}

