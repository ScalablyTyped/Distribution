package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapImageFilter extends StObject
/** ICAP_IMAGEFILTER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapImageFilter")
@js.native
object EnumDWTCapImageFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapImageFilter with Double] = js.native
  
  @js.native
  sealed trait TWIF_AUTO extends EnumDWTCapImageFilter
  /* 1 */ val TWIF_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_AUTO with Double = js.native
  
  /** Good for improving text. */
  @js.native
  sealed trait TWIF_BANDPASS extends EnumDWTCapImageFilter
  /* 3 */ val TWIF_BANDPASS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_BANDPASS with Double = js.native
  
  @js.native
  sealed trait TWIF_FINELINE extends EnumDWTCapImageFilter
  /* 4 */ val TWIF_FINELINE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_FINELINE with Double = js.native
  
  /** Good for improving fine lines. */
  @js.native
  sealed trait TWIF_HIGHPASS extends EnumDWTCapImageFilter
  /* 4 */ val TWIF_HIGHPASS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_HIGHPASS with Double = js.native
  
  /** Good for halftone images. */
  @js.native
  sealed trait TWIF_LOWPASS extends EnumDWTCapImageFilter
  /* 2 */ val TWIF_LOWPASS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_LOWPASS with Double = js.native
  
  @js.native
  sealed trait TWIF_NONE extends EnumDWTCapImageFilter
  /* 0 */ val TWIF_NONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_NONE with Double = js.native
  
  @js.native
  sealed trait TWIF_TEXT extends EnumDWTCapImageFilter
  /* 3 */ val TWIF_TEXT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_TEXT with Double = js.native
}
