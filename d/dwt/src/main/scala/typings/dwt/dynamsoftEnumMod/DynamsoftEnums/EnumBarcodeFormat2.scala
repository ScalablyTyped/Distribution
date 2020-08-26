package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumBarcodeFormat2 extends js.Object

/** Barcode Format 2 */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBarcodeFormat_2")
@js.native
object EnumBarcodeFormat2 extends js.Object {
  @js.native
  sealed trait BF2_AUSTRALIANPOST extends EnumBarcodeFormat2
  
  @js.native
  sealed trait BF2_DOTCODE extends EnumBarcodeFormat2
  
  @js.native
  sealed trait BF2_NONSTANDARD_BARCODE extends EnumBarcodeFormat2
  
  @js.native
  sealed trait BF2_NULL extends EnumBarcodeFormat2
  
  @js.native
  sealed trait BF2_PLANET extends EnumBarcodeFormat2
  
  @js.native
  sealed trait BF2_POSTALCODE extends EnumBarcodeFormat2
  
  @js.native
  sealed trait BF2_POSTNET extends EnumBarcodeFormat2
  
  @js.native
  sealed trait BF2_RM4SCC extends EnumBarcodeFormat2
  
  @js.native
  sealed trait BF2_USPSINTELLIGENTMAIL extends EnumBarcodeFormat2
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBarcodeFormat2 with Double] = js.native
  /* 8388608 */ @js.native
  object BF2_AUSTRALIANPOST extends TopLevel[BF2_AUSTRALIANPOST with Double]
  
  /* 2 */ @js.native
  object BF2_DOTCODE extends TopLevel[BF2_DOTCODE with Double]
  
  /* 1 */ @js.native
  object BF2_NONSTANDARD_BARCODE extends TopLevel[BF2_NONSTANDARD_BARCODE with Double]
  
  /* 0 */ @js.native
  object BF2_NULL extends TopLevel[BF2_NULL with Double]
  
  /* 4194304 */ @js.native
  object BF2_PLANET extends TopLevel[BF2_PLANET with Double]
  
  /* 32505856 */ @js.native
  object BF2_POSTALCODE extends TopLevel[BF2_POSTALCODE with Double]
  
  /* 2097152 */ @js.native
  object BF2_POSTNET extends TopLevel[BF2_POSTNET with Double]
  
  /* 16777216 */ @js.native
  object BF2_RM4SCC extends TopLevel[BF2_RM4SCC with Double]
  
  /* 1048576 */ @js.native
  object BF2_USPSINTELLIGENTMAIL extends TopLevel[BF2_USPSINTELLIGENTMAIL with Double]
  
}

