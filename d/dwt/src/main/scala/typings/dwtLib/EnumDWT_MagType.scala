package typings
package dwtLib

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
  sealed trait TWMD_INVALID
    extends dwtLib.EnumDWT_MagType
  
  /** Added 2.0  */
  @js.native
  sealed trait TWMD_MICR
    extends dwtLib.EnumDWT_MagType
  
  /** added 2.1   */
  @js.native
  sealed trait TWMD_RAW
    extends dwtLib.EnumDWT_MagType
  
  /* 2 */ val TWMD_INVALID: TWMD_INVALID with scala.Double = js.native
  /* 0 */ val TWMD_MICR: TWMD_MICR with scala.Double = js.native
  /* 1 */ val TWMD_RAW: TWMD_RAW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_MagType with scala.Double] = js.native
}

