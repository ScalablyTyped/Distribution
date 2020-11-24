package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapLightPath extends js.Object
/** ICAP_LIGHTPATH values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapLightPath")
@js.native
object EnumDWTCapLightPath extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapLightPath with Double] = js.native
  
  @js.native
  sealed trait TWLP_REFLECTIVE extends EnumDWTCapLightPath
  /* 0 */ @js.native
  object TWLP_REFLECTIVE extends TopLevel[TWLP_REFLECTIVE with Double]
  
  @js.native
  sealed trait TWLP_TRANSMISSIVE extends EnumDWTCapLightPath
  /* 1 */ @js.native
  object TWLP_TRANSMISSIVE extends TopLevel[TWLP_TRANSMISSIVE with Double]
}
