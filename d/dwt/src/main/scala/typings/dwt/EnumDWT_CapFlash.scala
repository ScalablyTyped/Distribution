package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_CapFlash.TWFL_AUTO
import typings.dwt.EnumDWT_CapFlash.TWFL_NONE
import typings.dwt.EnumDWT_CapFlash.TWFL_OFF
import typings.dwt.EnumDWT_CapFlash.TWFL_ON
import typings.dwt.EnumDWT_CapFlash.TWFL_REDEYE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapFlash with Double] = js.native
  /* 3 */ @js.native
  object TWFL_AUTO extends TopLevel[TWFL_AUTO with Double]
  
  /* 0 */ @js.native
  object TWFL_NONE extends TopLevel[TWFL_NONE with Double]
  
  /* 1 */ @js.native
  object TWFL_OFF extends TopLevel[TWFL_OFF with Double]
  
  /* 2 */ @js.native
  object TWFL_ON extends TopLevel[TWFL_ON with Double]
  
  /* 4 */ @js.native
  object TWFL_REDEYE extends TopLevel[TWFL_REDEYE with Double]
  
}

