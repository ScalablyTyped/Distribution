package typings.escpos

import typings.escpos.escposStrings.InformationseparatorthreeECNull
import typings.escpos.escposStrings.InformationseparatorthreeECStartofheading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EC extends js.Object {
   // Barcode mode on
  var OFF: InformationseparatorthreeECNull
  var ON: InformationseparatorthreeECStartofheading
}

object Anon_EC {
  @scala.inline
  def apply(OFF: InformationseparatorthreeECNull, ON: InformationseparatorthreeECStartofheading): Anon_EC = {
    val __obj = js.Dynamic.literal(OFF = OFF.asInstanceOf[js.Any], ON = ON.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EC]
  }
}

