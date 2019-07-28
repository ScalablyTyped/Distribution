package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapOverscan extends js.Object

/** ICAP_OVERSCAN values. */
@JSGlobal("EnumDWT_CapOverscan")
@js.native
object EnumDWT_CapOverscan extends js.Object {
  @js.native
  sealed trait TWOV_ALL extends EnumDWT_CapOverscan
  
  @js.native
  sealed trait TWOV_AUTO extends EnumDWT_CapOverscan
  
  @js.native
  sealed trait TWOV_LEFTRIGHT extends EnumDWT_CapOverscan
  
  @js.native
  sealed trait TWOV_NONE extends EnumDWT_CapOverscan
  
  @js.native
  sealed trait TWOV_TOPBOTTOM extends EnumDWT_CapOverscan
  
  /* 4 */ val TWOV_ALL: typings.dwt.EnumDWT_CapOverscan.TWOV_ALL with Double = js.native
  /* 1 */ val TWOV_AUTO: typings.dwt.EnumDWT_CapOverscan.TWOV_AUTO with Double = js.native
  /* 3 */ val TWOV_LEFTRIGHT: typings.dwt.EnumDWT_CapOverscan.TWOV_LEFTRIGHT with Double = js.native
  /* 0 */ val TWOV_NONE: typings.dwt.EnumDWT_CapOverscan.TWOV_NONE with Double = js.native
  /* 2 */ val TWOV_TOPBOTTOM: typings.dwt.EnumDWT_CapOverscan.TWOV_TOPBOTTOM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapOverscan with Double] = js.native
}

