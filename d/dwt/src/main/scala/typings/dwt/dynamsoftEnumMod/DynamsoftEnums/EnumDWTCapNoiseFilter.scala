package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapNoiseFilter extends js.Object
/** ICAP_NOISEFILTER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapNoiseFilter")
@js.native
object EnumDWTCapNoiseFilter extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapNoiseFilter with Double] = js.native
  
  @js.native
  sealed trait TWNF_AUTO extends EnumDWTCapNoiseFilter
  /* 1 */ @js.native
  object TWNF_AUTO extends TopLevel[TWNF_AUTO with Double]
  
  @js.native
  sealed trait TWNF_LONEPIXEL extends EnumDWTCapNoiseFilter
  /* 2 */ @js.native
  object TWNF_LONEPIXEL extends TopLevel[TWNF_LONEPIXEL with Double]
  
  @js.native
  sealed trait TWNF_MAJORITYRULE extends EnumDWTCapNoiseFilter
  /* 3 */ @js.native
  object TWNF_MAJORITYRULE extends TopLevel[TWNF_MAJORITYRULE with Double]
  
  @js.native
  sealed trait TWNF_NONE extends EnumDWTCapNoiseFilter
  /* 0 */ @js.native
  object TWNF_NONE extends TopLevel[TWNF_NONE with Double]
}
