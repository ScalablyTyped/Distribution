package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapOverscan extends StObject
/** ICAP_OVERSCAN values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapOverscan")
@js.native
object EnumDWTCapOverscan extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapOverscan & Double] = js.native
  
  @js.native
  sealed trait TWOV_ALL
    extends StObject
       with EnumDWTCapOverscan
  /* 4 */ val TWOV_ALL: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapOverscan.TWOV_ALL & Double = js.native
  
  @js.native
  sealed trait TWOV_AUTO
    extends StObject
       with EnumDWTCapOverscan
  /* 1 */ val TWOV_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapOverscan.TWOV_AUTO & Double = js.native
  
  @js.native
  sealed trait TWOV_LEFTRIGHT
    extends StObject
       with EnumDWTCapOverscan
  /* 3 */ val TWOV_LEFTRIGHT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapOverscan.TWOV_LEFTRIGHT & Double = js.native
  
  @js.native
  sealed trait TWOV_NONE
    extends StObject
       with EnumDWTCapOverscan
  /* 0 */ val TWOV_NONE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapOverscan.TWOV_NONE & Double = js.native
  
  @js.native
  sealed trait TWOV_TOPBOTTOM
    extends StObject
       with EnumDWTCapOverscan
  /* 2 */ val TWOV_TOPBOTTOM: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapOverscan.TWOV_TOPBOTTOM & Double = js.native
}
