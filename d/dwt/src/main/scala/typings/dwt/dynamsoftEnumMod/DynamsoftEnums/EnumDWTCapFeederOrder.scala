package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapFeederOrder extends js.Object

/** CAP_FEEDERORDER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFeederOrder")
@js.native
object EnumDWTCapFeederOrder extends js.Object {
  /** The feeder starts with the top of the first page. */
  @js.native
  sealed trait TWFO_FIRSTPAGEFIRST extends EnumDWTCapFeederOrder
  
  /** The feeder starts with the top of the last page. */
  @js.native
  sealed trait TWFO_LASTPAGEFIRST extends EnumDWTCapFeederOrder
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFeederOrder with Double] = js.native
  /* 0 */ @js.native
  object TWFO_FIRSTPAGEFIRST extends TopLevel[TWFO_FIRSTPAGEFIRST with Double]
  
  /* 1 */ @js.native
  object TWFO_LASTPAGEFIRST extends TopLevel[TWFO_LASTPAGEFIRST with Double]
  
}

