package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapImageFilter extends StObject
/** ICAP_IMAGEFILTER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapImageFilter")
@js.native
object EnumDWTCapImageFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapImageFilter & Double] = js.native
  
  @js.native
  sealed trait TWIF_AUTO
    extends StObject
       with EnumDWTCapImageFilter
  /* 1 */ val TWIF_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_AUTO & Double = js.native
  
  /** Good for improving text. */
  @js.native
  sealed trait TWIF_BANDPASS
    extends StObject
       with EnumDWTCapImageFilter
  /* 3 */ val TWIF_BANDPASS: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_BANDPASS & Double = js.native
  
  @js.native
  sealed trait TWIF_FINELINE
    extends StObject
       with EnumDWTCapImageFilter
  /* 4 */ val TWIF_FINELINE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_FINELINE & Double = js.native
  
  /** Good for improving fine lines. */
  @js.native
  sealed trait TWIF_HIGHPASS
    extends StObject
       with EnumDWTCapImageFilter
  /* 4 */ val TWIF_HIGHPASS: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_HIGHPASS & Double = js.native
  
  /** Good for halftone images. */
  @js.native
  sealed trait TWIF_LOWPASS
    extends StObject
       with EnumDWTCapImageFilter
  /* 2 */ val TWIF_LOWPASS: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_LOWPASS & Double = js.native
  
  @js.native
  sealed trait TWIF_NONE
    extends StObject
       with EnumDWTCapImageFilter
  /* 0 */ val TWIF_NONE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_NONE & Double = js.native
  
  @js.native
  sealed trait TWIF_TEXT
    extends StObject
       with EnumDWTCapImageFilter
  /* 3 */ val TWIF_TEXT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCapImageFilter.TWIF_TEXT & Double = js.native
}
