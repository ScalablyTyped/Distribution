package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapFlipRotation extends StObject
/** ICAP_FLIPROTATION values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFlipRotation")
@js.native
object EnumDWTCapFlipRotation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFlipRotation & Double] = js.native
  
  /** The images to be scanned are viewed in book form, flipping each page from left to right or right to left. */
  @js.native
  sealed trait TWFR_BOOK
    extends StObject
       with EnumDWTCapFlipRotation
  /* 0 */ val TWFR_BOOK: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapFlipRotation.TWFR_BOOK & Double = js.native
  
  /** The images to be scanned are viewed in fanfold paper style, flipping each page up or down. */
  @js.native
  sealed trait TWFR_FANFOLD
    extends StObject
       with EnumDWTCapFlipRotation
  /* 1 */ val TWFR_FANFOLD: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapFlipRotation.TWFR_FANFOLD & Double = js.native
}
