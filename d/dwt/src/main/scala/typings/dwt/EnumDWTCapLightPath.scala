package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapLightPath extends js.Object

/** ICAP_LIGHTPATH values. */
@JSGlobal("EnumDWT_CapLightPath")
@js.native
object EnumDWTCapLightPath extends js.Object {
  @js.native
  sealed trait TWLP_REFLECTIVE extends EnumDWTCapLightPath
  
  @js.native
  sealed trait TWLP_TRANSMISSIVE extends EnumDWTCapLightPath
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapLightPath with Double] = js.native
  /* 0 */ @js.native
  object TWLP_REFLECTIVE extends TopLevel[TWLP_REFLECTIVE with Double]
  
  /* 1 */ @js.native
  object TWLP_TRANSMISSIVE extends TopLevel[TWLP_TRANSMISSIVE with Double]
  
}

