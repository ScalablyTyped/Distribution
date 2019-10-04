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

trait Anon_A extends js.Object {
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

object Anon_A {
  @scala.inline
  def apply(
    font: A | B,
    height: Double,
    includeParity: Boolean,
    position: OFF | ABV | BLW | BTH,
    width: Double
  ): Anon_A = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], height = height, includeParity = includeParity, position = position.asInstanceOf[js.Any], width = width)
  
    __obj.asInstanceOf[Anon_A]
  }
}

