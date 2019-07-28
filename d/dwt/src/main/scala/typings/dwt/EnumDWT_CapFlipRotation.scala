package typings.dwt

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
  
  /* 0 */ val TWFR_BOOK: typings.dwt.EnumDWT_CapFlipRotation.TWFR_BOOK with Double = js.native
  /* 1 */ val TWFR_FANFOLD: typings.dwt.EnumDWT_CapFlipRotation.TWFR_FANFOLD with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapFlipRotation with Double] = js.native
}

