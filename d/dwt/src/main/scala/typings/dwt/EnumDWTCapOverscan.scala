package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapOverscan extends js.Object

/** ICAP_OVERSCAN values. */
@JSGlobal("EnumDWT_CapOverscan")
@js.native
object EnumDWTCapOverscan extends js.Object {
  @js.native
  sealed trait TWOV_ALL extends EnumDWTCapOverscan
  
  @js.native
  sealed trait TWOV_AUTO extends EnumDWTCapOverscan
  
  @js.native
  sealed trait TWOV_LEFTRIGHT extends EnumDWTCapOverscan
  
  @js.native
  sealed trait TWOV_NONE extends EnumDWTCapOverscan
  
  @js.native
  sealed trait TWOV_TOPBOTTOM extends EnumDWTCapOverscan
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapOverscan with Double] = js.native
  /* 4 */ @js.native
  object TWOV_ALL extends TopLevel[TWOV_ALL with Double]
  
  /* 1 */ @js.native
  object TWOV_AUTO extends TopLevel[TWOV_AUTO with Double]
  
  /* 3 */ @js.native
  object TWOV_LEFTRIGHT extends TopLevel[TWOV_LEFTRIGHT with Double]
  
  /* 0 */ @js.native
  object TWOV_NONE extends TopLevel[TWOV_NONE with Double]
  
  /* 2 */ @js.native
  object TWOV_TOPBOTTOM extends TopLevel[TWOV_TOPBOTTOM with Double]
  
}

