package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapNoiseFilter extends js.Object

/** ICAP_NOISEFILTER values. */
@JSGlobal("EnumDWT_CapNoiseFilter")
@js.native
object EnumDWT_CapNoiseFilter extends js.Object {
  @js.native
  sealed trait TWNF_AUTO
    extends dwtLib.EnumDWT_CapNoiseFilter
  
  @js.native
  sealed trait TWNF_LONEPIXEL
    extends dwtLib.EnumDWT_CapNoiseFilter
  
  @js.native
  sealed trait TWNF_MAJORITYRULE
    extends dwtLib.EnumDWT_CapNoiseFilter
  
  @js.native
  sealed trait TWNF_NONE
    extends dwtLib.EnumDWT_CapNoiseFilter
  
  /* 1 */ val TWNF_AUTO: TWNF_AUTO with scala.Double = js.native
  /* 2 */ val TWNF_LONEPIXEL: TWNF_LONEPIXEL with scala.Double = js.native
  /* 3 */ val TWNF_MAJORITYRULE: TWNF_MAJORITYRULE with scala.Double = js.native
  /* 0 */ val TWNF_NONE: TWNF_NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapNoiseFilter with scala.Double] = js.native
}

