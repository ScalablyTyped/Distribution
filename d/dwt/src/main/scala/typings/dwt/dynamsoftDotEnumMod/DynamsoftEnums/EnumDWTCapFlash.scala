package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapFlash extends StObject
/** ICAP_FLASHUSED2 values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFlash")
@js.native
object EnumDWTCapFlash extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFlash & Double] = js.native
  
  @js.native
  sealed trait TWFL_AUTO
    extends StObject
       with EnumDWTCapFlash
  /* 3 */ val TWFL_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapFlash.TWFL_AUTO & Double = js.native
  
  @js.native
  sealed trait TWFL_NONE
    extends StObject
       with EnumDWTCapFlash
  /* 0 */ val TWFL_NONE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapFlash.TWFL_NONE & Double = js.native
  
  @js.native
  sealed trait TWFL_OFF
    extends StObject
       with EnumDWTCapFlash
  /* 1 */ val TWFL_OFF: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapFlash.TWFL_OFF & Double = js.native
  
  @js.native
  sealed trait TWFL_ON
    extends StObject
       with EnumDWTCapFlash
  /* 2 */ val TWFL_ON: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapFlash.TWFL_ON & Double = js.native
  
  @js.native
  sealed trait TWFL_REDEYE
    extends StObject
       with EnumDWTCapFlash
  /* 4 */ val TWFL_REDEYE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapFlash.TWFL_REDEYE & Double = js.native
}
