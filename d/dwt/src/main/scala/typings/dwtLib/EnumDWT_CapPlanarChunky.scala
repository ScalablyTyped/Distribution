package typings
package dwtLib

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
  sealed trait TWPC_CHUNKY
    extends dwtLib.EnumDWT_CapPlanarChunky
  
  @js.native
  sealed trait TWPC_PLANAR
    extends dwtLib.EnumDWT_CapPlanarChunky
  
  /* 0 */ val TWPC_CHUNKY: TWPC_CHUNKY with scala.Double = js.native
  /* 1 */ val TWPC_PLANAR: TWPC_PLANAR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapPlanarChunky with scala.Double] = js.native
}

