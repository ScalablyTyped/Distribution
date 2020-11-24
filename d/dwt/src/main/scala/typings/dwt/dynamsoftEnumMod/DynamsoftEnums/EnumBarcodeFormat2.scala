package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumBarcodeFormat2 extends js.Object
/** Barcode Format 2 */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBarcodeFormat_2")
@js.native
object EnumBarcodeFormat2 extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBarcodeFormat2 with Double] = js.native
  
  @js.native
  sealed trait BF2_AUSTRALIANPOST extends EnumBarcodeFormat2
  /* 8388608 */ @js.native
  object BF2_AUSTRALIANPOST extends TopLevel[BF2_AUSTRALIANPOST with Double]
  
  @js.native
  sealed trait BF2_DOTCODE extends EnumBarcodeFormat2
  /* 2 */ @js.native
  object BF2_DOTCODE extends TopLevel[BF2_DOTCODE with Double]
  
  @js.native
  sealed trait BF2_NONSTANDARD_BARCODE extends EnumBarcodeFormat2
  /* 1 */ @js.native
  object BF2_NONSTANDARD_BARCODE extends TopLevel[BF2_NONSTANDARD_BARCODE with Double]
  
  @js.native
  sealed trait BF2_NULL extends EnumBarcodeFormat2
  /* 0 */ @js.native
  object BF2_NULL extends TopLevel[BF2_NULL with Double]
  
  @js.native
  sealed trait BF2_PLANET extends EnumBarcodeFormat2
  /* 4194304 */ @js.native
  object BF2_PLANET extends TopLevel[BF2_PLANET with Double]
  
  @js.native
  sealed trait BF2_POSTALCODE extends EnumBarcodeFormat2
  /* 32505856 */ @js.native
  object BF2_POSTALCODE extends TopLevel[BF2_POSTALCODE with Double]
  
  @js.native
  sealed trait BF2_POSTNET extends EnumBarcodeFormat2
  /* 2097152 */ @js.native
  object BF2_POSTNET extends TopLevel[BF2_POSTNET with Double]
  
  @js.native
  sealed trait BF2_RM4SCC extends EnumBarcodeFormat2
  /* 16777216 */ @js.native
  object BF2_RM4SCC extends TopLevel[BF2_RM4SCC with Double]
  
  @js.native
  sealed trait BF2_USPSINTELLIGENTMAIL extends EnumBarcodeFormat2
  /* 1048576 */ @js.native
  object BF2_USPSINTELLIGENTMAIL extends TopLevel[BF2_USPSINTELLIGENTMAIL with Double]
}
