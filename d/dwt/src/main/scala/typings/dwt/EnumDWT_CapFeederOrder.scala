package typings.dwt

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
  sealed trait TWFO_FIRSTPAGEFIRST extends EnumDWT_CapFeederOrder
  
  /** The feeder starts with the top of the last page. */
  @js.native
  sealed trait TWFO_LASTPAGEFIRST extends EnumDWT_CapFeederOrder
  
  /* 0 */ val TWFO_FIRSTPAGEFIRST: typings.dwt.EnumDWT_CapFeederOrder.TWFO_FIRSTPAGEFIRST with Double = js.native
  /* 1 */ val TWFO_LASTPAGEFIRST: typings.dwt.EnumDWT_CapFeederOrder.TWFO_LASTPAGEFIRST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapFeederOrder with Double] = js.native
}

