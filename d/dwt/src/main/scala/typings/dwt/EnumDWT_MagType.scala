package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_MagType with Double] = js.native
  /* 2 */ @js.native
  object TWMD_INVALID extends TopLevel[TWMD_INVALID with Double]
  
  /* 0 */ @js.native
  object TWMD_MICR extends TopLevel[TWMD_MICR with Double]
  
  /* 1 */ @js.native
  object TWMD_RAW extends TopLevel[TWMD_RAW with Double]
  
}

