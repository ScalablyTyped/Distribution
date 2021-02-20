package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTDUPLEX extends StObject
/** ICAP_DUPLEX values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_DUPLEX")
@js.native
object EnumDWTDUPLEX extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTDUPLEX with Double] = js.native
  
  @js.native
  sealed trait TWDX_1PASSDUPLEX extends EnumDWTDUPLEX
  /* 1 */ val TWDX_1PASSDUPLEX: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDUPLEX.TWDX_1PASSDUPLEX with Double = js.native
  
  @js.native
  sealed trait TWDX_2PASSDUPLEX extends EnumDWTDUPLEX
  /* 2 */ val TWDX_2PASSDUPLEX: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDUPLEX.TWDX_2PASSDUPLEX with Double = js.native
  
  @js.native
  sealed trait TWDX_NONE extends EnumDWTDUPLEX
  /* 0 */ val TWDX_NONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTDUPLEX.TWDX_NONE with Double = js.native
}
