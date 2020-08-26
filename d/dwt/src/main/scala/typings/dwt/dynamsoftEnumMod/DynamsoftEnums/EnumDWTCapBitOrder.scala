package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapBitOrder extends js.Object

/** ICAP_BITORDER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapBitOrder")
@js.native
object EnumDWTCapBitOrder extends js.Object {
  @js.native
  sealed trait TWBO_LSBFIRST extends EnumDWTCapBitOrder
  
  /** Indicates that the leftmost bit in the byte (usually bit 7) is the byte's Most Significant Bit. */
  @js.native
  sealed trait TWBO_MSBFIRST extends EnumDWTCapBitOrder
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapBitOrder with Double] = js.native
  /* 0 */ @js.native
  object TWBO_LSBFIRST extends TopLevel[TWBO_LSBFIRST with Double]
  
  /* 1 */ @js.native
  object TWBO_MSBFIRST extends TopLevel[TWBO_MSBFIRST with Double]
  
}

