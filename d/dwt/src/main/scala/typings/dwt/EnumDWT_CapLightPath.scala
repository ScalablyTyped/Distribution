package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapLightPath with Double] = js.native
  /* 0 */ @js.native
  object TWLP_REFLECTIVE extends TopLevel[TWLP_REFLECTIVE with Double]
  
  /* 1 */ @js.native
  object TWLP_TRANSMISSIVE extends TopLevel[TWLP_TRANSMISSIVE with Double]
  
}

