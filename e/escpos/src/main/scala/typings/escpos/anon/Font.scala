package typings.escpos.anon

import typings.escpos.escposStrings.A
import typings.escpos.escposStrings.ABV
import typings.escpos.escposStrings.B
import typings.escpos.escposStrings.BLW
import typings.escpos.escposStrings.BTH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font extends js.Object {
  var font: A | B = js.native
  var height: Double = js.native
  var includeParity: Boolean = js.native
  /**
    * OFF, ABOVE, BELOW, BOTH
    *
    * @default BELOW
    */
  var position: typings.escpos.escposStrings.OFF | ABV | BLW | BTH = js.native
  var width: Double = js.native
}

object Font {
  @scala.inline
  def apply(
    font: A | B,
    height: Double,
    includeParity: Boolean,
    position: typings.escpos.escposStrings.OFF | ABV | BLW | BTH,
    width: Double
  ): Font = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], includeParity = includeParity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFont(value: A | B): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeParity(value: Boolean): Self = this.set("includeParity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: typings.escpos.escposStrings.OFF | ABV | BLW | BTH): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

