package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapLightPath extends StObject
/** ICAP_LIGHTPATH values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapLightPath")
@js.native
object EnumDWTCapLightPath extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapLightPath & Double] = js.native
  
  @js.native
  sealed trait TWLP_REFLECTIVE
    extends StObject
       with EnumDWTCapLightPath
  /* 0 */ val TWLP_REFLECTIVE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapLightPath.TWLP_REFLECTIVE & Double = js.native
  
  @js.native
  sealed trait TWLP_TRANSMISSIVE
    extends StObject
       with EnumDWTCapLightPath
  /* 1 */ val TWLP_TRANSMISSIVE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapLightPath.TWLP_TRANSMISSIVE & Double = js.native
}
