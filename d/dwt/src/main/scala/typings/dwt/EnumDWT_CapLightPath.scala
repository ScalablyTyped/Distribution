package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapLightPath extends js.Object

/** ICAP_LIGHTPATH values. */
@JSGlobal("EnumDWT_CapLightPath")
@js.native
object EnumDWT_CapLightPath extends js.Object {
  @js.native
  sealed trait TWLP_REFLECTIVE extends EnumDWT_CapLightPath
  
  @js.native
  sealed trait TWLP_TRANSMISSIVE extends EnumDWT_CapLightPath
  
  /* 0 */ val TWLP_REFLECTIVE: typings.dwt.EnumDWT_CapLightPath.TWLP_REFLECTIVE with Double = js.native
  /* 1 */ val TWLP_TRANSMISSIVE: typings.dwt.EnumDWT_CapLightPath.TWLP_TRANSMISSIVE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapLightPath with Double] = js.native
}

