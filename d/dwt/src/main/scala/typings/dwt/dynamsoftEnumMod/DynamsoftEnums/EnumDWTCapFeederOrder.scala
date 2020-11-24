package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapFeederOrder extends js.Object
/** CAP_FEEDERORDER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapFeederOrder")
@js.native
object EnumDWTCapFeederOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapFeederOrder with Double] = js.native
  
  /** The feeder starts with the top of the first page. */
  @js.native
  sealed trait TWFO_FIRSTPAGEFIRST extends EnumDWTCapFeederOrder
  /* 0 */ @js.native
  object TWFO_FIRSTPAGEFIRST extends TopLevel[TWFO_FIRSTPAGEFIRST with Double]
  
  /** The feeder starts with the top of the last page. */
  @js.native
  sealed trait TWFO_LASTPAGEFIRST extends EnumDWTCapFeederOrder
  /* 1 */ @js.native
  object TWFO_LASTPAGEFIRST extends TopLevel[TWFO_LASTPAGEFIRST with Double]
}
