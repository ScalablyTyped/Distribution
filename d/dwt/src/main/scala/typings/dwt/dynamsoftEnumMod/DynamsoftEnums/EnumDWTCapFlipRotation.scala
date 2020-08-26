package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapFlipRotation extends js.Object

/** ICAP_FLIPROTATION values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFlipRotation")
@js.native
object EnumDWTCapFlipRotation extends js.Object {
  /** The images to be scanned are viewed in book form, flipping each page from left to right or right to left. */
  @js.native
  sealed trait TWFR_BOOK extends EnumDWTCapFlipRotation
  
  /** The images to be scanned are viewed in fanfold paper style, flipping each page up or down. */
  @js.native
  sealed trait TWFR_FANFOLD extends EnumDWTCapFlipRotation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFlipRotation with Double] = js.native
  /* 0 */ @js.native
  object TWFR_BOOK extends TopLevel[TWFR_BOOK with Double]
  
  /* 1 */ @js.native
  object TWFR_FANFOLD extends TopLevel[TWFR_FANFOLD with Double]
  
}

