package typings
package dvLib.dvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Barcodeformat extends js.Object {
  var AZTEC: scala.Boolean
  var CODE_128: scala.Boolean
  var CODE_39: scala.Boolean
  var DATA_MATRIX: scala.Boolean
  var EAN_13: scala.Boolean
  var EAN_8: scala.Boolean
  var ITF: scala.Boolean
  var PDF_417: scala.Boolean
  var QR_CODE: scala.Boolean
  var UPC_A: scala.Boolean
  var UPC_E: scala.Boolean
}

object Barcodeformat {
  @scala.inline
  def apply(
    AZTEC: scala.Boolean,
    CODE_128: scala.Boolean,
    CODE_39: scala.Boolean,
    DATA_MATRIX: scala.Boolean,
    EAN_13: scala.Boolean,
    EAN_8: scala.Boolean,
    ITF: scala.Boolean,
    PDF_417: scala.Boolean,
    QR_CODE: scala.Boolean,
    UPC_A: scala.Boolean,
    UPC_E: scala.Boolean
  ): Barcodeformat = {
    val __obj = js.Dynamic.literal(AZTEC = AZTEC, CODE_128 = CODE_128, CODE_39 = CODE_39, DATA_MATRIX = DATA_MATRIX, EAN_13 = EAN_13, EAN_8 = EAN_8, ITF = ITF, PDF_417 = PDF_417, QR_CODE = QR_CODE, UPC_A = UPC_A, UPC_E = UPC_E)
  
    __obj.asInstanceOf[Barcodeformat]
  }
}

