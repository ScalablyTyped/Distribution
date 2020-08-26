package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreehCentsign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BARCODEHEIGHTDEFAULT extends js.Object {
  var BARCODE_HEIGHT_DEFAULT: InformationseparatorthreehCentsign = js.native
  var BARCODE_MODE: OFF = js.native
   // Barcode height default=162
  var CODE2D_FORMAT: LENOFFSET = js.native
}

object BARCODEHEIGHTDEFAULT {
  @scala.inline
  def apply(
    BARCODE_HEIGHT_DEFAULT: InformationseparatorthreehCentsign,
    BARCODE_MODE: OFF,
    CODE2D_FORMAT: LENOFFSET
  ): BARCODEHEIGHTDEFAULT = {
    val __obj = js.Dynamic.literal(BARCODE_HEIGHT_DEFAULT = BARCODE_HEIGHT_DEFAULT.asInstanceOf[js.Any], BARCODE_MODE = BARCODE_MODE.asInstanceOf[js.Any], CODE2D_FORMAT = CODE2D_FORMAT.asInstanceOf[js.Any])
    __obj.asInstanceOf[BARCODEHEIGHTDEFAULT]
  }
  @scala.inline
  implicit class BARCODEHEIGHTDEFAULTOps[Self <: BARCODEHEIGHTDEFAULT] (val x: Self) extends AnyVal {
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
    def setBARCODE_HEIGHT_DEFAULT(value: InformationseparatorthreehCentsign): Self = this.set("BARCODE_HEIGHT_DEFAULT", value.asInstanceOf[js.Any])
    @scala.inline
    def setBARCODE_MODE(value: OFF): Self = this.set("BARCODE_MODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setCODE2D_FORMAT(value: LENOFFSET): Self = this.set("CODE2D_FORMAT", value.asInstanceOf[js.Any])
  }
  
}

