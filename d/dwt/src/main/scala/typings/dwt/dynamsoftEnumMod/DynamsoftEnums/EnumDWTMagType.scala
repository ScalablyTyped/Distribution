package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTMagType extends StObject
/** TWEI_MAGTYPE values. (MD_ means Mag Type) Added 2.0  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_MagType")
@js.native
object EnumDWTMagType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTMagType & Double] = js.native
  
  /** added 2.1  */
  @js.native
  sealed trait TWMD_INVALID
    extends StObject
       with EnumDWTMagType
  /* 2 */ val TWMD_INVALID: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMagType.TWMD_INVALID & Double = js.native
  
  /** Added 2.0  */
  @js.native
  sealed trait TWMD_MICR
    extends StObject
       with EnumDWTMagType
  /* 0 */ val TWMD_MICR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMagType.TWMD_MICR & Double = js.native
  
  /** added 2.1   */
  @js.native
  sealed trait TWMD_RAW
    extends StObject
       with EnumDWTMagType
  /* 1 */ val TWMD_RAW: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMagType.TWMD_RAW & Double = js.native
}
