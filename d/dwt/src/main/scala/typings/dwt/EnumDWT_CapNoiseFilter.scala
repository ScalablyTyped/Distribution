package typings.dwt

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
  sealed trait TWNF_AUTO extends EnumDWT_CapNoiseFilter
  
  @js.native
  sealed trait TWNF_LONEPIXEL extends EnumDWT_CapNoiseFilter
  
  @js.native
  sealed trait TWNF_MAJORITYRULE extends EnumDWT_CapNoiseFilter
  
  @js.native
  sealed trait TWNF_NONE extends EnumDWT_CapNoiseFilter
  
  /* 1 */ val TWNF_AUTO: typings.dwt.EnumDWT_CapNoiseFilter.TWNF_AUTO with Double = js.native
  /* 2 */ val TWNF_LONEPIXEL: typings.dwt.EnumDWT_CapNoiseFilter.TWNF_LONEPIXEL with Double = js.native
  /* 3 */ val TWNF_MAJORITYRULE: typings.dwt.EnumDWT_CapNoiseFilter.TWNF_MAJORITYRULE with Double = js.native
  /* 0 */ val TWNF_NONE: typings.dwt.EnumDWT_CapNoiseFilter.TWNF_NONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapNoiseFilter with Double] = js.native
}

