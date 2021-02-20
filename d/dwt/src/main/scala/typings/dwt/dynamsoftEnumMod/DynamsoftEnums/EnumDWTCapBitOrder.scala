package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapBitOrder extends StObject
/** ICAP_BITORDER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapBitOrder")
@js.native
object EnumDWTCapBitOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapBitOrder with Double] = js.native
  
  @js.native
  sealed trait TWBO_LSBFIRST extends EnumDWTCapBitOrder
  /* 0 */ val TWBO_LSBFIRST: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapBitOrder.TWBO_LSBFIRST with Double = js.native
  
  /** Indicates that the leftmost bit in the byte (usually bit 7) is the byte's Most Significant Bit. */
  @js.native
  sealed trait TWBO_MSBFIRST extends EnumDWTCapBitOrder
  /* 1 */ val TWBO_MSBFIRST: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapBitOrder.TWBO_MSBFIRST with Double = js.native
}
