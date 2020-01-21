package typings.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Barcodeformat extends js.Object {
  var AZTEC: Boolean
  var CODE_128: Boolean
  var CODE_39: Boolean
  var DATA_MATRIX: Boolean
  var EAN_13: Boolean
  var EAN_8: Boolean
  var ITF: Boolean
  var PDF_417: Boolean
  var QR_CODE: Boolean
  var UPC_A: Boolean
  var UPC_E: Boolean
}

object Barcodeformat {
  @scala.inline
  def apply(
    AZTEC: Boolean,
    CODE_128: Boolean,
    CODE_39: Boolean,
    DATA_MATRIX: Boolean,
    EAN_13: Boolean,
    EAN_8: Boolean,
    ITF: Boolean,
    PDF_417: Boolean,
    QR_CODE: Boolean,
    UPC_A: Boolean,
    UPC_E: Boolean
  ): Barcodeformat = {
    val __obj = js.Dynamic.literal(AZTEC = AZTEC.asInstanceOf[js.Any], CODE_128 = CODE_128.asInstanceOf[js.Any], CODE_39 = CODE_39.asInstanceOf[js.Any], DATA_MATRIX = DATA_MATRIX.asInstanceOf[js.Any], EAN_13 = EAN_13.asInstanceOf[js.Any], EAN_8 = EAN_8.asInstanceOf[js.Any], ITF = ITF.asInstanceOf[js.Any], PDF_417 = PDF_417.asInstanceOf[js.Any], QR_CODE = QR_CODE.asInstanceOf[js.Any], UPC_A = UPC_A.asInstanceOf[js.Any], UPC_E = UPC_E.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Barcodeformat]
  }
}

