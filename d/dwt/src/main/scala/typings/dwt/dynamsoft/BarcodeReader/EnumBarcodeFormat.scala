package typings.dwt.dynamsoft.BarcodeReader

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
  
}

