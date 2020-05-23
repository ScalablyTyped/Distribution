package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTMagType extends js.Object

/** TWEI_MAGTYPE values. (MD_ means Mag Type) Added 2.0  */
@JSGlobal("EnumDWT_MagType")
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
  
}

