package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapFlipRotation extends StObject
/** ICAP_FLIPROTATION values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFlipRotation")
@js.native
object EnumDWTCapFlipRotation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFlipRotation with Double] = js.native
  
  /** The images to be scanned are viewed in book form, flipping each page from left to right or right to left. */
  @js.native
  sealed trait TWFR_BOOK extends EnumDWTCapFlipRotation
  /* 0 */ val TWFR_BOOK: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFlipRotation.TWFR_BOOK with Double = js.native
  
  /** The images to be scanned are viewed in fanfold paper style, flipping each page up or down. */
  @js.native
  sealed trait TWFR_FANFOLD extends EnumDWTCapFlipRotation
  /* 1 */ val TWFR_FANFOLD: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFlipRotation.TWFR_FANFOLD with Double = js.native
}
