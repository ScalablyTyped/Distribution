package typings.escpos

import typings.escpos.escposStrings.InformationseparatorthreehCentsign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BARCODEHEIGHTDEFAULT extends js.Object {
  var BARCODE_HEIGHT_DEFAULT: InformationseparatorthreehCentsign
  var BARCODE_MODE: Anon_EC
   // Barcode height default=162
  var CODE2D_FORMAT: Anon_3
}

object Anon_BARCODEHEIGHTDEFAULT {
  @scala.inline
  def apply(
    BARCODE_HEIGHT_DEFAULT: InformationseparatorthreehCentsign,
    BARCODE_MODE: Anon_EC,
    CODE2D_FORMAT: Anon_3
  ): Anon_BARCODEHEIGHTDEFAULT = {
    val __obj = js.Dynamic.literal(BARCODE_HEIGHT_DEFAULT = BARCODE_HEIGHT_DEFAULT.asInstanceOf[js.Any], BARCODE_MODE = BARCODE_MODE.asInstanceOf[js.Any], CODE2D_FORMAT = CODE2D_FORMAT.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BARCODEHEIGHTDEFAULT]
  }
}

