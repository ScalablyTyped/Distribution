package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_CapFlipRotation.TWFR_BOOK
import typings.dwt.EnumDWT_CapFlipRotation.TWFR_FANFOLD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapFlipRotation extends js.Object

/** ICAP_FLIPROTATION values. */
@JSGlobal("EnumDWT_CapFlipRotation")
@js.native
object EnumDWT_CapFlipRotation extends js.Object {
  /** The images to be scanned are viewed in book form, flipping each page from left to right or right to left. */
  @js.native
  sealed trait TWFR_BOOK extends EnumDWT_CapFlipRotation
  
  /** The images to be scanned are viewed in fanfold paper style, flipping each page up or down. */
  @js.native
  sealed trait TWFR_FANFOLD extends EnumDWT_CapFlipRotation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapFlipRotation with Double] = js.native
  /* 0 */ @js.native
  object TWFR_BOOK extends TopLevel[TWFR_BOOK with Double]
  
  /* 1 */ @js.native
  object TWFR_FANFOLD extends TopLevel[TWFR_FANFOLD with Double]
  
}

