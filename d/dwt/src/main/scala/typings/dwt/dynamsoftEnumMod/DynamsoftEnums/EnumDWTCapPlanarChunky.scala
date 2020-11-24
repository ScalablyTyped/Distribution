package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapPlanarChunky extends js.Object
/** ICAP_PLANARCHUNKY values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapPlanarChunky")
@js.native
object EnumDWTCapPlanarChunky extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapPlanarChunky with Double] = js.native
  
  @js.native
  sealed trait TWPC_CHUNKY extends EnumDWTCapPlanarChunky
  /* 0 */ @js.native
  object TWPC_CHUNKY extends TopLevel[TWPC_CHUNKY with Double]
  
  @js.native
  sealed trait TWPC_PLANAR extends EnumDWTCapPlanarChunky
  /* 1 */ @js.native
  object TWPC_PLANAR extends TopLevel[TWPC_PLANAR with Double]
}
