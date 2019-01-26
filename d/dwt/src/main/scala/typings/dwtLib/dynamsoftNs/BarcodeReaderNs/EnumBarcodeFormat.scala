package typings
package dwtLib.dynamsoftNs.BarcodeReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumBarcodeFormat extends js.Object

/** Barcode Formats */
@JSGlobal("dynamsoft.BarcodeReader.EnumBarcodeFormat")
@js.native
object EnumBarcodeFormat extends js.Object {
  @js.native
  sealed trait AZTEC
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait All
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait CODABAR
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait CODE_128
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait CODE_39
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait CODE_93
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait DATAMATRIX
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait EAN_13
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait EAN_8
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait INDUSTRIAL_25
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait ITF
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait OneD
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait PDF417
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait QR_CODE
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait UPC_A
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  @js.native
  sealed trait UPC_E
    extends dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat
  
  /* 0x10000000 */ val AZTEC: AZTEC with scala.Double = js.native
  /* 503317503 */ val All: All with scala.Double = js.native
  /* 0x8 */ val CODABAR: CODABAR with scala.Double = js.native
  /* 0x2 */ val CODE_128: CODE_128 with scala.Double = js.native
  /* 0x1 */ val CODE_39: CODE_39 with scala.Double = js.native
  /* 0x4 */ val CODE_93: CODE_93 with scala.Double = js.native
  /* 0x8000000 */ val DATAMATRIX: DATAMATRIX with scala.Double = js.native
  /* 0x20 */ val EAN_13: EAN_13 with scala.Double = js.native
  /* 0x40 */ val EAN_8: EAN_8 with scala.Double = js.native
  /* 0x200 */ val INDUSTRIAL_25: INDUSTRIAL_25 with scala.Double = js.native
  /* 0x10 */ val ITF: ITF with scala.Double = js.native
  /* 0x3FF */ val OneD: OneD with scala.Double = js.native
  /* 0x2000000 */ val PDF417: PDF417 with scala.Double = js.native
  /* 0x4000000 */ val QR_CODE: QR_CODE with scala.Double = js.native
  /* 0x80 */ val UPC_A: UPC_A with scala.Double = js.native
  /* 0x100 */ val UPC_E: UPC_E with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat with scala.Double] = js.native
}

