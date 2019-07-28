package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapFlash extends js.Object

/** ICAP_FLASHUSED2 values. */
@JSGlobal("EnumDWT_CapFlash")
@js.native
object EnumDWT_CapFlash extends js.Object {
  @js.native
  sealed trait TWFL_AUTO extends EnumDWT_CapFlash
  
  @js.native
  sealed trait TWFL_NONE extends EnumDWT_CapFlash
  
  @js.native
  sealed trait TWFL_OFF extends EnumDWT_CapFlash
  
  @js.native
  sealed trait TWFL_ON extends EnumDWT_CapFlash
  
  @js.native
  sealed trait TWFL_REDEYE extends EnumDWT_CapFlash
  
  /* 3 */ val TWFL_AUTO: typings.dwt.EnumDWT_CapFlash.TWFL_AUTO with Double = js.native
  /* 0 */ val TWFL_NONE: typings.dwt.EnumDWT_CapFlash.TWFL_NONE with Double = js.native
  /* 1 */ val TWFL_OFF: typings.dwt.EnumDWT_CapFlash.TWFL_OFF with Double = js.native
  /* 2 */ val TWFL_ON: typings.dwt.EnumDWT_CapFlash.TWFL_ON with Double = js.native
  /* 4 */ val TWFL_REDEYE: typings.dwt.EnumDWT_CapFlash.TWFL_REDEYE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapFlash with Double] = js.native
}

