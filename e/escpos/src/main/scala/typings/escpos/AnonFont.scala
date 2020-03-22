package typings.escpos

import typings.escpos.escposStrings.A
import typings.escpos.escposStrings.ABV
import typings.escpos.escposStrings.B
import typings.escpos.escposStrings.BLW
import typings.escpos.escposStrings.BTH
import typings.escpos.escposStrings.OFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFont extends js.Object {
  var font: A | B
  var height: Double
  var includeParity: Boolean
  /**
    * OFF, ABOVE, BELOW, BOTH
    *
    * @default BELOW
    */
  var position: OFF | ABV | BLW | BTH
  var width: Double
}

object AnonFont {
  @scala.inline
  def apply(
    font: A | B,
    height: Double,
    includeParity: Boolean,
    position: OFF | ABV | BLW | BTH,
    width: Double
  ): AnonFont = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], includeParity = includeParity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFont]
  }
}

