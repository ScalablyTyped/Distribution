package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapPlanarChunky extends StObject
/** ICAP_PLANARCHUNKY values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapPlanarChunky")
@js.native
object EnumDWTCapPlanarChunky extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapPlanarChunky & Double] = js.native
  
  @js.native
  sealed trait TWPC_CHUNKY
    extends StObject
       with EnumDWTCapPlanarChunky
  /* 0 */ val TWPC_CHUNKY: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapPlanarChunky.TWPC_CHUNKY & Double = js.native
  
  @js.native
  sealed trait TWPC_PLANAR
    extends StObject
       with EnumDWTCapPlanarChunky
  /* 1 */ val TWPC_PLANAR: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapPlanarChunky.TWPC_PLANAR & Double = js.native
}
