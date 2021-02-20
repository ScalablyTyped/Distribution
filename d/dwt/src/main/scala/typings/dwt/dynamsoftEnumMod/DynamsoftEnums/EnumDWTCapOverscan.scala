package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapOverscan extends StObject
/** ICAP_OVERSCAN values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapOverscan")
@js.native
object EnumDWTCapOverscan extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapOverscan with Double] = js.native
  
  @js.native
  sealed trait TWOV_ALL extends EnumDWTCapOverscan
  /* 4 */ val TWOV_ALL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapOverscan.TWOV_ALL with Double = js.native
  
  @js.native
  sealed trait TWOV_AUTO extends EnumDWTCapOverscan
  /* 1 */ val TWOV_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapOverscan.TWOV_AUTO with Double = js.native
  
  @js.native
  sealed trait TWOV_LEFTRIGHT extends EnumDWTCapOverscan
  /* 3 */ val TWOV_LEFTRIGHT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapOverscan.TWOV_LEFTRIGHT with Double = js.native
  
  @js.native
  sealed trait TWOV_NONE extends EnumDWTCapOverscan
  /* 0 */ val TWOV_NONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapOverscan.TWOV_NONE with Double = js.native
  
  @js.native
  sealed trait TWOV_TOPBOTTOM extends EnumDWTCapOverscan
  /* 2 */ val TWOV_TOPBOTTOM: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapOverscan.TWOV_TOPBOTTOM with Double = js.native
}
