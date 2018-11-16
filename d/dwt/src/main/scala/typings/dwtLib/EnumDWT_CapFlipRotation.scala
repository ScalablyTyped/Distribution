package typings
package dwtLib

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
  sealed trait TWFR_BOOK
    extends dwtLib.EnumDWT_CapFlipRotation
  
  /** The images to be scanned are viewed in fanfold paper style, flipping each page up or down. */
  @js.native
  sealed trait TWFR_FANFOLD
    extends dwtLib.EnumDWT_CapFlipRotation
  
  /* 0 */ val TWFR_BOOK: TWFR_BOOK with scala.Double = js.native
  /* 1 */ val TWFR_FANFOLD: TWFR_FANFOLD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapFlipRotation with scala.Double] = js.native
}

