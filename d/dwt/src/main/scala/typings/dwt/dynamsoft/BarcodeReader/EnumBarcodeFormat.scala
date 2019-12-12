package typings.dwt.dynamsoft.BarcodeReader

import org.scalablytyped.runtime.TopLevel
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.AZTEC
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.All
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.CODABAR
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.CODE_128
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.CODE_39
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.CODE_93
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.DATAMATRIX
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.EAN_13
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.EAN_8
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.INDUSTRIAL_25
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.ITF
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.OneD
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.PDF417
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.QR_CODE
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.UPC_A
import typings.dwt.dynamsoft.BarcodeReader.EnumBarcodeFormat.UPC_E
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBarcodeFormat with Double] = js.native
  /* 0x10000000 */ @js.native
  object AZTEC extends TopLevel[AZTEC with Double]
  
  /* 503317503 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 0x8 */ @js.native
  object CODABAR extends TopLevel[CODABAR with Double]
  
  /* 0x2 */ @js.native
  object CODE_128 extends TopLevel[CODE_128 with Double]
  
  /* 0x1 */ @js.native
  object CODE_39 extends TopLevel[CODE_39 with Double]
  
  /* 0x4 */ @js.native
  object CODE_93 extends TopLevel[CODE_93 with Double]
  
  /* 0x8000000 */ @js.native
  object DATAMATRIX extends TopLevel[DATAMATRIX with Double]
  
  /* 0x20 */ @js.native
  object EAN_13 extends TopLevel[EAN_13 with Double]
  
  /* 0x40 */ @js.native
  object EAN_8 extends TopLevel[EAN_8 with Double]
  
  /* 0x200 */ @js.native
  object INDUSTRIAL_25 extends TopLevel[INDUSTRIAL_25 with Double]
  
  /* 0x10 */ @js.native
  object ITF extends TopLevel[ITF with Double]
  
  /* 0x3FF */ @js.native
  object OneD extends TopLevel[OneD with Double]
  
  /* 0x2000000 */ @js.native
  object PDF417 extends TopLevel[PDF417 with Double]
  
  /* 0x4000000 */ @js.native
  object QR_CODE extends TopLevel[QR_CODE with Double]
  
  /* 0x80 */ @js.native
  object UPC_A extends TopLevel[UPC_A with Double]
  
  /* 0x100 */ @js.native
  object UPC_E extends TopLevel[UPC_E with Double]
  
}

