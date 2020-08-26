package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreeECNull
import typings.escpos.escposStrings.InformationseparatorthreeECStartofheading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OFF extends js.Object {
   // Barcode mode on
  var OFF: InformationseparatorthreeECNull = js.native
  var ON: InformationseparatorthreeECStartofheading = js.native
}

object OFF {
  @scala.inline
  def apply(OFF: InformationseparatorthreeECNull, ON: InformationseparatorthreeECStartofheading): OFF = {
    val __obj = js.Dynamic.literal(OFF = OFF.asInstanceOf[js.Any], ON = ON.asInstanceOf[js.Any])
    __obj.asInstanceOf[OFF]
  }
  @scala.inline
  implicit class OFFOps[Self <: OFF] (val x: Self) extends AnyVal {
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
    def setOFF(value: InformationseparatorthreeECNull): Self = this.set("OFF", value.asInstanceOf[js.Any])
    @scala.inline
    def setON(value: InformationseparatorthreeECStartofheading): Self = this.set("ON", value.asInstanceOf[js.Any])
  }
  
}

