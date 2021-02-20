package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapFeederOrder extends StObject
/** CAP_FEEDERORDER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFeederOrder")
@js.native
object EnumDWTCapFeederOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFeederOrder with Double] = js.native
  
  /** The feeder starts with the top of the first page. */
  @js.native
  sealed trait TWFO_FIRSTPAGEFIRST extends EnumDWTCapFeederOrder
  /* 0 */ val TWFO_FIRSTPAGEFIRST: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFeederOrder.TWFO_FIRSTPAGEFIRST with Double = js.native
  
  /** The feeder starts with the top of the last page. */
  @js.native
  sealed trait TWFO_LASTPAGEFIRST extends EnumDWTCapFeederOrder
  /* 1 */ val TWFO_LASTPAGEFIRST: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapFeederOrder.TWFO_LASTPAGEFIRST with Double = js.native
}
