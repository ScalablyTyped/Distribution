package typings.escpos.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoOpen extends js.Object {
  var autoOpen: Boolean
  var baudRate: Double
}

object AutoOpen {
  @scala.inline
  def apply(autoOpen: Boolean, baudRate: Double): AutoOpen = {
    val __obj = js.Dynamic.literal(autoOpen = autoOpen.asInstanceOf[js.Any], baudRate = baudRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoOpen]
  }
}

