package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapFeederOrder with Double] = js.native
  /* 0 */ @js.native
  object TWFO_FIRSTPAGEFIRST extends TopLevel[TWFO_FIRSTPAGEFIRST with Double]
  
  /* 1 */ @js.native
  object TWFO_LASTPAGEFIRST extends TopLevel[TWFO_LASTPAGEFIRST with Double]
  
}

