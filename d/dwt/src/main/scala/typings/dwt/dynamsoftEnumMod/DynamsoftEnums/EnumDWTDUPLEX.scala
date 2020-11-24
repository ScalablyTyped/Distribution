package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTDUPLEX extends js.Object
/** ICAP_DUPLEX values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_DUPLEX")
@js.native
object EnumDWTDUPLEX extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTDUPLEX with Double] = js.native
  
  @js.native
  sealed trait TWDX_1PASSDUPLEX extends EnumDWTDUPLEX
  /* 1 */ @js.native
  object TWDX_1PASSDUPLEX extends TopLevel[TWDX_1PASSDUPLEX with Double]
  
  @js.native
  sealed trait TWDX_2PASSDUPLEX extends EnumDWTDUPLEX
  /* 2 */ @js.native
  object TWDX_2PASSDUPLEX extends TopLevel[TWDX_2PASSDUPLEX with Double]
  
  @js.native
  sealed trait TWDX_NONE extends EnumDWTDUPLEX
  /* 0 */ @js.native
  object TWDX_NONE extends TopLevel[TWDX_NONE with Double]
}
