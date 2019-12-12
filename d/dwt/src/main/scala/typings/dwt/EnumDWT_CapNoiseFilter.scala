package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_CapNoiseFilter.TWNF_AUTO
import typings.dwt.EnumDWT_CapNoiseFilter.TWNF_LONEPIXEL
import typings.dwt.EnumDWT_CapNoiseFilter.TWNF_MAJORITYRULE
import typings.dwt.EnumDWT_CapNoiseFilter.TWNF_NONE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapNoiseFilter with Double] = js.native
  /* 1 */ @js.native
  object TWNF_AUTO extends TopLevel[TWNF_AUTO with Double]
  
  /* 2 */ @js.native
  object TWNF_LONEPIXEL extends TopLevel[TWNF_LONEPIXEL with Double]
  
  /* 3 */ @js.native
  object TWNF_MAJORITYRULE extends TopLevel[TWNF_MAJORITYRULE with Double]
  
  /* 0 */ @js.native
  object TWNF_NONE extends TopLevel[TWNF_NONE with Double]
  
}

