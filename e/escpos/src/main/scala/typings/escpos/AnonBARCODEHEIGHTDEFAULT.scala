package typings.escpos

import typings.escpos.escposStrings.InformationseparatorthreehCentsign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBARCODEHEIGHTDEFAULT extends js.Object {
  var BARCODE_HEIGHT_DEFAULT: InformationseparatorthreehCentsign
  var BARCODE_MODE: AnonEC
   // Barcode height default=162
  var CODE2D_FORMAT: Anon3
}

object AnonBARCODEHEIGHTDEFAULT {
  @scala.inline
  def apply(
    BARCODE_HEIGHT_DEFAULT: InformationseparatorthreehCentsign,
    BARCODE_MODE: AnonEC,
    CODE2D_FORMAT: Anon3
  ): AnonBARCODEHEIGHTDEFAULT = {
    val __obj = js.Dynamic.literal(BARCODE_HEIGHT_DEFAULT = BARCODE_HEIGHT_DEFAULT.asInstanceOf[js.Any], BARCODE_MODE = BARCODE_MODE.asInstanceOf[js.Any], CODE2D_FORMAT = CODE2D_FORMAT.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBARCODEHEIGHTDEFAULT]
  }
}

