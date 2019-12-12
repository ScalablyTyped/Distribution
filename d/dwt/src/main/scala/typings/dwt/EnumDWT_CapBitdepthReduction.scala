package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_CapBitdepthReduction.TWBR_CUSTHALFTONE
import typings.dwt.EnumDWT_CapBitdepthReduction.TWBR_DIFFUSION
import typings.dwt.EnumDWT_CapBitdepthReduction.TWBR_HALFTONE
import typings.dwt.EnumDWT_CapBitdepthReduction.TWBR_THRESHOLD
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapBitdepthReduction with Double] = js.native
  /* 2 */ @js.native
  object TWBR_CUSTHALFTONE extends TopLevel[TWBR_CUSTHALFTONE with Double]
  
  /* 3 */ @js.native
  object TWBR_DIFFUSION extends TopLevel[TWBR_DIFFUSION with Double]
  
  /* 1 */ @js.native
  object TWBR_HALFTONE extends TopLevel[TWBR_HALFTONE with Double]
  
  /* 0 */ @js.native
  object TWBR_THRESHOLD extends TopLevel[TWBR_THRESHOLD with Double]
  
}

