package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapFeederOrder extends js.Object

/** CAP_FEEDERORDER values. */
@JSGlobal("EnumDWT_CapFeederOrder")
@js.native
object EnumDWTCapFeederOrder extends js.Object {
  /** The feeder starts with the top of the first page. */
  @js.native
  sealed trait TWFO_FIRSTPAGEFIRST extends EnumDWTCapFeederOrder
  
  /** The feeder starts with the top of the last page. */
  @js.native
  sealed trait TWFO_LASTPAGEFIRST extends EnumDWTCapFeederOrder
  
}

