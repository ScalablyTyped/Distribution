package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTMagType extends js.Object

/** TWEI_MAGTYPE values. (MD_ means Mag Type) Added 2.0  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_MagType")
@js.native
object EnumDWTMagType extends js.Object {
  /** added 2.1  */
  @js.native
  sealed trait TWMD_INVALID extends EnumDWTMagType
  
  /** Added 2.0  */
  @js.native
  sealed trait TWMD_MICR extends EnumDWTMagType
  
  /** added 2.1   */
  @js.native
  sealed trait TWMD_RAW extends EnumDWTMagType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTMagType with Double] = js.native
  /* 2 */ @js.native
  object TWMD_INVALID extends TopLevel[TWMD_INVALID with Double]
  
  /* 0 */ @js.native
  object TWMD_MICR extends TopLevel[TWMD_MICR with Double]
  
  /* 1 */ @js.native
  object TWMD_RAW extends TopLevel[TWMD_RAW with Double]
  
}

