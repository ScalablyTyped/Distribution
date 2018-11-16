package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapFeederOrder extends js.Object

/** CAP_FEEDERORDER values. */
@JSGlobal("EnumDWT_CapFeederOrder")
@js.native
object EnumDWT_CapFeederOrder extends js.Object {
  /** The feeder starts with the top of the first page. */
  @js.native
  sealed trait TWFO_FIRSTPAGEFIRST
    extends dwtLib.EnumDWT_CapFeederOrder
  
  /** The feeder starts with the top of the last page. */
  @js.native
  sealed trait TWFO_LASTPAGEFIRST
    extends dwtLib.EnumDWT_CapFeederOrder
  
  /* 0 */ val TWFO_FIRSTPAGEFIRST: TWFO_FIRSTPAGEFIRST with scala.Double = js.native
  /* 1 */ val TWFO_LASTPAGEFIRST: TWFO_LASTPAGEFIRST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapFeederOrder with scala.Double] = js.native
}

