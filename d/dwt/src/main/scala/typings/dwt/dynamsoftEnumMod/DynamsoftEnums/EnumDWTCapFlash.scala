package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapFlash extends StObject
/** ICAP_FLASHUSED2 values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFlash")
@js.native
object EnumDWTCapFlash extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFlash with Double] = js.native
  
  @js.native
  sealed trait TWFL_AUTO extends EnumDWTCapFlash
  /* 3 */ val TWFL_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFlash.TWFL_AUTO with Double = js.native
  
  @js.native
  sealed trait TWFL_NONE extends EnumDWTCapFlash
  /* 0 */ val TWFL_NONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFlash.TWFL_NONE with Double = js.native
  
  @js.native
  sealed trait TWFL_OFF extends EnumDWTCapFlash
  /* 1 */ val TWFL_OFF: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFlash.TWFL_OFF with Double = js.native
  
  @js.native
  sealed trait TWFL_ON extends EnumDWTCapFlash
  /* 2 */ val TWFL_ON: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFlash.TWFL_ON with Double = js.native
  
  @js.native
  sealed trait TWFL_REDEYE extends EnumDWTCapFlash
  /* 4 */ val TWFL_REDEYE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFlash.TWFL_REDEYE with Double = js.native
}
