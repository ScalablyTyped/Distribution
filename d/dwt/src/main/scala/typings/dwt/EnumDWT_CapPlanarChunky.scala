package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_CapPlanarChunky.TWPC_CHUNKY
import typings.dwt.EnumDWT_CapPlanarChunky.TWPC_PLANAR
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapPlanarChunky with Double] = js.native
  /* 0 */ @js.native
  object TWPC_CHUNKY extends TopLevel[TWPC_CHUNKY with Double]
  
  /* 1 */ @js.native
  object TWPC_PLANAR extends TopLevel[TWPC_PLANAR with Double]
  
}

