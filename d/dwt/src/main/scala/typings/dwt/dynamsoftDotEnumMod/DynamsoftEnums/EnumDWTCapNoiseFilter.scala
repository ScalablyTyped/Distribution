package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapNoiseFilter extends StObject
/** ICAP_NOISEFILTER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapNoiseFilter")
@js.native
object EnumDWTCapNoiseFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapNoiseFilter & Double] = js.native
  
  @js.native
  sealed trait TWNF_AUTO
    extends StObject
       with EnumDWTCapNoiseFilter
  /* 1 */ val TWNF_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapNoiseFilter.TWNF_AUTO & Double = js.native
  
  @js.native
  sealed trait TWNF_LONEPIXEL
    extends StObject
       with EnumDWTCapNoiseFilter
  /* 2 */ val TWNF_LONEPIXEL: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapNoiseFilter.TWNF_LONEPIXEL & Double = js.native
  
  @js.native
  sealed trait TWNF_MAJORITYRULE
    extends StObject
       with EnumDWTCapNoiseFilter
  /* 3 */ val TWNF_MAJORITYRULE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapNoiseFilter.TWNF_MAJORITYRULE & Double = js.native
  
  @js.native
  sealed trait TWNF_NONE
    extends StObject
       with EnumDWTCapNoiseFilter
  /* 0 */ val TWNF_NONE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapNoiseFilter.TWNF_NONE & Double = js.native
}
