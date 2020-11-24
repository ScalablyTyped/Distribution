package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapOverscan extends js.Object
/** ICAP_OVERSCAN values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapOverscan")
@js.native
object EnumDWTCapOverscan extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapOverscan with Double] = js.native
  
  @js.native
  sealed trait TWOV_ALL extends EnumDWTCapOverscan
  /* 4 */ @js.native
  object TWOV_ALL extends TopLevel[TWOV_ALL with Double]
  
  @js.native
  sealed trait TWOV_AUTO extends EnumDWTCapOverscan
  /* 1 */ @js.native
  object TWOV_AUTO extends TopLevel[TWOV_AUTO with Double]
  
  @js.native
  sealed trait TWOV_LEFTRIGHT extends EnumDWTCapOverscan
  /* 3 */ @js.native
  object TWOV_LEFTRIGHT extends TopLevel[TWOV_LEFTRIGHT with Double]
  
  @js.native
  sealed trait TWOV_NONE extends EnumDWTCapOverscan
  /* 0 */ @js.native
  object TWOV_NONE extends TopLevel[TWOV_NONE with Double]
  
  @js.native
  sealed trait TWOV_TOPBOTTOM extends EnumDWTCapOverscan
  /* 2 */ @js.native
  object TWOV_TOPBOTTOM extends TopLevel[TWOV_TOPBOTTOM with Double]
}
