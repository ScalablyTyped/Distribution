package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_MagType extends js.Object

/** TWEI_MAGTYPE values. (MD_ means Mag Type) Added 2.0  */
@JSGlobal("EnumDWT_MagType")
@js.native
object EnumDWT_MagType extends js.Object {
  /** added 2.1  */
  @js.native
  sealed trait TWMD_INVALID extends EnumDWT_MagType
  
  /** Added 2.0  */
  @js.native
  sealed trait TWMD_MICR extends EnumDWT_MagType
  
  /** added 2.1   */
  @js.native
  sealed trait TWMD_RAW extends EnumDWT_MagType
  
  /* 2 */ val TWMD_INVALID: typings.dwt.EnumDWT_MagType.TWMD_INVALID with Double = js.native
  /* 0 */ val TWMD_MICR: typings.dwt.EnumDWT_MagType.TWMD_MICR with Double = js.native
  /* 1 */ val TWMD_RAW: typings.dwt.EnumDWT_MagType.TWMD_RAW with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_MagType with Double] = js.native
}

