package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapFlash extends js.Object

/** ICAP_FLASHUSED2 values. */
@JSGlobal("EnumDWT_CapFlash")
@js.native
object EnumDWT_CapFlash extends js.Object {
  @js.native
  sealed trait TWFL_AUTO
    extends dwtLib.EnumDWT_CapFlash
  
  @js.native
  sealed trait TWFL_NONE
    extends dwtLib.EnumDWT_CapFlash
  
  @js.native
  sealed trait TWFL_OFF
    extends dwtLib.EnumDWT_CapFlash
  
  @js.native
  sealed trait TWFL_ON
    extends dwtLib.EnumDWT_CapFlash
  
  @js.native
  sealed trait TWFL_REDEYE
    extends dwtLib.EnumDWT_CapFlash
  
  /* 3 */ val TWFL_AUTO: TWFL_AUTO with scala.Double = js.native
  /* 0 */ val TWFL_NONE: TWFL_NONE with scala.Double = js.native
  /* 1 */ val TWFL_OFF: TWFL_OFF with scala.Double = js.native
  /* 2 */ val TWFL_ON: TWFL_ON with scala.Double = js.native
  /* 4 */ val TWFL_REDEYE: TWFL_REDEYE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapFlash with scala.Double] = js.native
}

