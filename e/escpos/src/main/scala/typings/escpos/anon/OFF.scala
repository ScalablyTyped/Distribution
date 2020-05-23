package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreeECNull
import typings.escpos.escposStrings.InformationseparatorthreeECStartofheading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OFF extends js.Object {
   // Barcode mode on
  var OFF: InformationseparatorthreeECNull
  var ON: InformationseparatorthreeECStartofheading
}

object OFF {
  @scala.inline
  def apply(OFF: InformationseparatorthreeECNull, ON: InformationseparatorthreeECStartofheading): OFF = {
    val __obj = js.Dynamic.literal(OFF = OFF.asInstanceOf[js.Any], ON = ON.asInstanceOf[js.Any])
    __obj.asInstanceOf[OFF]
  }
}

