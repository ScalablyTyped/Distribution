package typings
package dwtLib

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
  sealed trait TWLP_REFLECTIVE
    extends dwtLib.EnumDWT_CapLightPath
  
  @js.native
  sealed trait TWLP_TRANSMISSIVE
    extends dwtLib.EnumDWT_CapLightPath
  
  /* 0 */ val TWLP_REFLECTIVE: TWLP_REFLECTIVE with scala.Double = js.native
  /* 1 */ val TWLP_TRANSMISSIVE: TWLP_TRANSMISSIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapLightPath with scala.Double] = js.native
}

