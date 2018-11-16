package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapBitdepthReduction extends js.Object

/** ICAP_BITDEPTHREDUCTION values. */
@JSGlobal("EnumDWT_CapBitdepthReduction")
@js.native
object EnumDWT_CapBitdepthReduction extends js.Object {
  @js.native
  sealed trait TWBR_CUSTHALFTONE
    extends dwtLib.EnumDWT_CapBitdepthReduction
  
  @js.native
  sealed trait TWBR_DIFFUSION
    extends dwtLib.EnumDWT_CapBitdepthReduction
  
  @js.native
  sealed trait TWBR_HALFTONE
    extends dwtLib.EnumDWT_CapBitdepthReduction
  
  @js.native
  sealed trait TWBR_THRESHOLD
    extends dwtLib.EnumDWT_CapBitdepthReduction
  
  /* 2 */ val TWBR_CUSTHALFTONE: TWBR_CUSTHALFTONE with scala.Double = js.native
  /* 3 */ val TWBR_DIFFUSION: TWBR_DIFFUSION with scala.Double = js.native
  /* 1 */ val TWBR_HALFTONE: TWBR_HALFTONE with scala.Double = js.native
  /* 0 */ val TWBR_THRESHOLD: TWBR_THRESHOLD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapBitdepthReduction with scala.Double] = js.native
}

