package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapNoiseFilter extends StObject
/** ICAP_NOISEFILTER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapNoiseFilter")
@js.native
object EnumDWTCapNoiseFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapNoiseFilter with Double] = js.native
  
  @js.native
  sealed trait TWNF_AUTO extends EnumDWTCapNoiseFilter
  /* 1 */ val TWNF_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapNoiseFilter.TWNF_AUTO with Double = js.native
  
  @js.native
  sealed trait TWNF_LONEPIXEL extends EnumDWTCapNoiseFilter
  /* 2 */ val TWNF_LONEPIXEL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapNoiseFilter.TWNF_LONEPIXEL with Double = js.native
  
  @js.native
  sealed trait TWNF_MAJORITYRULE extends EnumDWTCapNoiseFilter
  /* 3 */ val TWNF_MAJORITYRULE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapNoiseFilter.TWNF_MAJORITYRULE with Double = js.native
  
  @js.native
  sealed trait TWNF_NONE extends EnumDWTCapNoiseFilter
  /* 0 */ val TWNF_NONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapNoiseFilter.TWNF_NONE with Double = js.native
}
