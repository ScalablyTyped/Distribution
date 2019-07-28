package typings.dwt.dynamsoftNs.BarcodeReaderNs

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
  sealed trait AZTEC extends EnumBarcodeFormat
  
  @js.native
  sealed trait All extends EnumBarcodeFormat
  
  @js.native
  sealed trait CODABAR extends EnumBarcodeFormat
  
  @js.native
  sealed trait CODE_128 extends EnumBarcodeFormat
  
  @js.native
  sealed trait CODE_39 extends EnumBarcodeFormat
  
  @js.native
  sealed trait CODE_93 extends EnumBarcodeFormat
  
  @js.native
  sealed trait DATAMATRIX extends EnumBarcodeFormat
  
  @js.native
  sealed trait EAN_13 extends EnumBarcodeFormat
  
  @js.native
  sealed trait EAN_8 extends EnumBarcodeFormat
  
  @js.native
  sealed trait INDUSTRIAL_25 extends EnumBarcodeFormat
  
  @js.native
  sealed trait ITF extends EnumBarcodeFormat
  
  @js.native
  sealed trait OneD extends EnumBarcodeFormat
  
  @js.native
  sealed trait PDF417 extends EnumBarcodeFormat
  
  @js.native
  sealed trait QR_CODE extends EnumBarcodeFormat
  
  @js.native
  sealed trait UPC_A extends EnumBarcodeFormat
  
  @js.native
  sealed trait UPC_E extends EnumBarcodeFormat
  
  /* 0x10000000 */ val AZTEC: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.AZTEC with Double = js.native
  /* 503317503 */ val All: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.All with Double = js.native
  /* 0x8 */ val CODABAR: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.CODABAR with Double = js.native
  /* 0x2 */ val CODE_128: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.CODE_128 with Double = js.native
  /* 0x1 */ val CODE_39: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.CODE_39 with Double = js.native
  /* 0x4 */ val CODE_93: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.CODE_93 with Double = js.native
  /* 0x8000000 */ val DATAMATRIX: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.DATAMATRIX with Double = js.native
  /* 0x20 */ val EAN_13: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.EAN_13 with Double = js.native
  /* 0x40 */ val EAN_8: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.EAN_8 with Double = js.native
  /* 0x200 */ val INDUSTRIAL_25: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.INDUSTRIAL_25 with Double = js.native
  /* 0x10 */ val ITF: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.ITF with Double = js.native
  /* 0x3FF */ val OneD: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.OneD with Double = js.native
  /* 0x2000000 */ val PDF417: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.PDF417 with Double = js.native
  /* 0x4000000 */ val QR_CODE: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.QR_CODE with Double = js.native
  /* 0x80 */ val UPC_A: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.UPC_A with Double = js.native
  /* 0x100 */ val UPC_E: typings.dwt.dynamsoftNs.BarcodeReaderNs.EnumBarcodeFormat.UPC_E with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBarcodeFormat with Double] = js.native
}

