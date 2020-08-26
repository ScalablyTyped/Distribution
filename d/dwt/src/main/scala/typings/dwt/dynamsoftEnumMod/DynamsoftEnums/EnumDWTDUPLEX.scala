package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTDUPLEX extends js.Object

/** ICAP_DUPLEX values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_DUPLEX")
@js.native
object EnumDWTDUPLEX extends js.Object {
  @js.native
  sealed trait TWDX_1PASSDUPLEX extends EnumDWTDUPLEX
  
  @js.native
  sealed trait TWDX_2PASSDUPLEX extends EnumDWTDUPLEX
  
  @js.native
  sealed trait TWDX_NONE extends EnumDWTDUPLEX
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTDUPLEX with Double] = js.native
  /* 1 */ @js.native
  object TWDX_1PASSDUPLEX extends TopLevel[TWDX_1PASSDUPLEX with Double]
  
  /* 2 */ @js.native
  object TWDX_2PASSDUPLEX extends TopLevel[TWDX_2PASSDUPLEX with Double]
  
  /* 0 */ @js.native
  object TWDX_NONE extends TopLevel[TWDX_NONE with Double]
  
}

