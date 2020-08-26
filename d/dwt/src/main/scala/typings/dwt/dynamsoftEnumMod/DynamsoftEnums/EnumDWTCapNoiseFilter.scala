package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapNoiseFilter extends js.Object

/** ICAP_NOISEFILTER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapNoiseFilter")
@js.native
object EnumDWTCapNoiseFilter extends js.Object {
  @js.native
  sealed trait TWNF_AUTO extends EnumDWTCapNoiseFilter
  
  @js.native
  sealed trait TWNF_LONEPIXEL extends EnumDWTCapNoiseFilter
  
  @js.native
  sealed trait TWNF_MAJORITYRULE extends EnumDWTCapNoiseFilter
  
  @js.native
  sealed trait TWNF_NONE extends EnumDWTCapNoiseFilter
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapNoiseFilter with Double] = js.native
  /* 1 */ @js.native
  object TWNF_AUTO extends TopLevel[TWNF_AUTO with Double]
  
  /* 2 */ @js.native
  object TWNF_LONEPIXEL extends TopLevel[TWNF_LONEPIXEL with Double]
  
  /* 3 */ @js.native
  object TWNF_MAJORITYRULE extends TopLevel[TWNF_MAJORITYRULE with Double]
  
  /* 0 */ @js.native
  object TWNF_NONE extends TopLevel[TWNF_NONE with Double]
  
}

