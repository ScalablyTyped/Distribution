package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapFlipRotation extends js.Object

/** ICAP_FLIPROTATION values. */
@JSGlobal("EnumDWT_CapFlipRotation")
@js.native
object EnumDWTCapFlipRotation extends js.Object {
  /** The images to be scanned are viewed in book form, flipping each page from left to right or right to left. */
  @js.native
  sealed trait TWFR_BOOK extends EnumDWTCapFlipRotation
  
  /** The images to be scanned are viewed in fanfold paper style, flipping each page up or down. */
  @js.native
  sealed trait TWFR_FANFOLD extends EnumDWTCapFlipRotation
  
}

