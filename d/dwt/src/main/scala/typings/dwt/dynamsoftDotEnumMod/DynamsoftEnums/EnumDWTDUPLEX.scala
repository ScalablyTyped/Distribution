package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTDUPLEX extends StObject
/** ICAP_DUPLEX values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_DUPLEX")
@js.native
object EnumDWTDUPLEX extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTDUPLEX & Double] = js.native
  
  @js.native
  sealed trait TWDX_1PASSDUPLEX
    extends StObject
       with EnumDWTDUPLEX
  /* 1 */ val TWDX_1PASSDUPLEX: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTDUPLEX.TWDX_1PASSDUPLEX & Double = js.native
  
  @js.native
  sealed trait TWDX_2PASSDUPLEX
    extends StObject
       with EnumDWTDUPLEX
  /* 2 */ val TWDX_2PASSDUPLEX: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTDUPLEX.TWDX_2PASSDUPLEX & Double = js.native
  
  @js.native
  sealed trait TWDX_NONE
    extends StObject
       with EnumDWTDUPLEX
  /* 0 */ val TWDX_NONE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTDUPLEX.TWDX_NONE & Double = js.native
}
