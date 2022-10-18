package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapFeederOrder extends StObject
/** CAP_FEEDERORDER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFeederOrder")
@js.native
object EnumDWTCapFeederOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFeederOrder & Double] = js.native
  
  /** The feeder starts with the top of the first page. */
  @js.native
  sealed trait TWFO_FIRSTPAGEFIRST
    extends StObject
       with EnumDWTCapFeederOrder
  /* 0 */ val TWFO_FIRSTPAGEFIRST: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapFeederOrder.TWFO_FIRSTPAGEFIRST & Double = js.native
  
  /** The feeder starts with the top of the last page. */
  @js.native
  sealed trait TWFO_LASTPAGEFIRST
    extends StObject
       with EnumDWTCapFeederOrder
  /* 1 */ val TWFO_LASTPAGEFIRST: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapFeederOrder.TWFO_LASTPAGEFIRST & Double = js.native
}
