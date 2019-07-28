package typings.dwt

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
  sealed trait TWBR_CUSTHALFTONE extends EnumDWT_CapBitdepthReduction
  
  @js.native
  sealed trait TWBR_DIFFUSION extends EnumDWT_CapBitdepthReduction
  
  @js.native
  sealed trait TWBR_HALFTONE extends EnumDWT_CapBitdepthReduction
  
  @js.native
  sealed trait TWBR_THRESHOLD extends EnumDWT_CapBitdepthReduction
  
  /* 2 */ val TWBR_CUSTHALFTONE: typings.dwt.EnumDWT_CapBitdepthReduction.TWBR_CUSTHALFTONE with Double = js.native
  /* 3 */ val TWBR_DIFFUSION: typings.dwt.EnumDWT_CapBitdepthReduction.TWBR_DIFFUSION with Double = js.native
  /* 1 */ val TWBR_HALFTONE: typings.dwt.EnumDWT_CapBitdepthReduction.TWBR_HALFTONE with Double = js.native
  /* 0 */ val TWBR_THRESHOLD: typings.dwt.EnumDWT_CapBitdepthReduction.TWBR_THRESHOLD with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapBitdepthReduction with Double] = js.native
}

