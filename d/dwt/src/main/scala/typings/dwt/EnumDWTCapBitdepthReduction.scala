package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapBitdepthReduction extends js.Object

/** ICAP_BITDEPTHREDUCTION values. */
@JSGlobal("EnumDWT_CapBitdepthReduction")
@js.native
object EnumDWTCapBitdepthReduction extends js.Object {
  @js.native
  sealed trait TWBR_CUSTHALFTONE extends EnumDWTCapBitdepthReduction
  
  @js.native
  sealed trait TWBR_DIFFUSION extends EnumDWTCapBitdepthReduction
  
  @js.native
  sealed trait TWBR_HALFTONE extends EnumDWTCapBitdepthReduction
  
  @js.native
  sealed trait TWBR_THRESHOLD extends EnumDWTCapBitdepthReduction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapBitdepthReduction with Double] = js.native
  /* 2 */ @js.native
  object TWBR_CUSTHALFTONE extends TopLevel[TWBR_CUSTHALFTONE with Double]
  
  /* 3 */ @js.native
  object TWBR_DIFFUSION extends TopLevel[TWBR_DIFFUSION with Double]
  
  /* 1 */ @js.native
  object TWBR_HALFTONE extends TopLevel[TWBR_HALFTONE with Double]
  
  /* 0 */ @js.native
  object TWBR_THRESHOLD extends TopLevel[TWBR_THRESHOLD with Double]
  
}

