package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapPlanarChunky extends js.Object

/** ICAP_PLANARCHUNKY values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapPlanarChunky")
@js.native
object EnumDWTCapPlanarChunky extends js.Object {
  @js.native
  sealed trait TWPC_CHUNKY extends EnumDWTCapPlanarChunky
  
  @js.native
  sealed trait TWPC_PLANAR extends EnumDWTCapPlanarChunky
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapPlanarChunky with Double] = js.native
  /* 0 */ @js.native
  object TWPC_CHUNKY extends TopLevel[TWPC_CHUNKY with Double]
  
  /* 1 */ @js.native
  object TWPC_PLANAR extends TopLevel[TWPC_PLANAR with Double]
  
}

