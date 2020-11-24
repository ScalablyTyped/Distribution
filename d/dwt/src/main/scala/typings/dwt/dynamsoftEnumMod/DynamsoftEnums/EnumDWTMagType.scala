package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTMagType extends js.Object
/** TWEI_MAGTYPE values. (MD_ means Mag Type) Added 2.0  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_MagType")
@js.native
object EnumDWTMagType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTMagType with Double] = js.native
  
  /** added 2.1  */
  @js.native
  sealed trait TWMD_INVALID extends EnumDWTMagType
  /* 2 */ @js.native
  object TWMD_INVALID extends TopLevel[TWMD_INVALID with Double]
  
  /** Added 2.0  */
  @js.native
  sealed trait TWMD_MICR extends EnumDWTMagType
  /* 0 */ @js.native
  object TWMD_MICR extends TopLevel[TWMD_MICR with Double]
  
  /** added 2.1   */
  @js.native
  sealed trait TWMD_RAW extends EnumDWTMagType
  /* 1 */ @js.native
  object TWMD_RAW extends TopLevel[TWMD_RAW with Double]
}
