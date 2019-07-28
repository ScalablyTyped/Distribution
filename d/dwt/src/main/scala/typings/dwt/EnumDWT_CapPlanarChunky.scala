package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapPlanarChunky extends js.Object

/** ICAP_PLANARCHUNKY values. */
@JSGlobal("EnumDWT_CapPlanarChunky")
@js.native
object EnumDWT_CapPlanarChunky extends js.Object {
  @js.native
  sealed trait TWPC_CHUNKY extends EnumDWT_CapPlanarChunky
  
  @js.native
  sealed trait TWPC_PLANAR extends EnumDWT_CapPlanarChunky
  
  /* 0 */ val TWPC_CHUNKY: typings.dwt.EnumDWT_CapPlanarChunky.TWPC_CHUNKY with Double = js.native
  /* 1 */ val TWPC_PLANAR: typings.dwt.EnumDWT_CapPlanarChunky.TWPC_PLANAR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapPlanarChunky with Double] = js.native
}

