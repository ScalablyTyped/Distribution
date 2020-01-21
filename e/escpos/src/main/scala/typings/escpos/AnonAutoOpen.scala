package typings.escpos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoOpen extends js.Object {
  var autoOpen: Boolean
  var baudRate: Double
}

object AnonAutoOpen {
  @scala.inline
  def apply(autoOpen: Boolean, baudRate: Double): AnonAutoOpen = {
    val __obj = js.Dynamic.literal(autoOpen = autoOpen.asInstanceOf[js.Any], baudRate = baudRate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAutoOpen]
  }
}

