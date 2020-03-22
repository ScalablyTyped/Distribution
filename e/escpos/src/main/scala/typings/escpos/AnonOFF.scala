package typings.escpos

import typings.escpos.escposStrings.InformationseparatorthreeECNull
import typings.escpos.escposStrings.InformationseparatorthreeECStartofheading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOFF extends js.Object {
   // Barcode mode on
  var OFF: InformationseparatorthreeECNull
  var ON: InformationseparatorthreeECStartofheading
}

object AnonOFF {
  @scala.inline
  def apply(OFF: InformationseparatorthreeECNull, ON: InformationseparatorthreeECStartofheading): AnonOFF = {
    val __obj = js.Dynamic.literal(OFF = OFF.asInstanceOf[js.Any], ON = ON.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOFF]
  }
}

