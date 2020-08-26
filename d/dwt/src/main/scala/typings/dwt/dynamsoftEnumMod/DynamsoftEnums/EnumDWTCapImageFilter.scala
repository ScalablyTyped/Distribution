package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapImageFilter extends js.Object

/** ICAP_IMAGEFILTER values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapImageFilter")
@js.native
object EnumDWTCapImageFilter extends js.Object {
  @js.native
  sealed trait TWIF_AUTO extends EnumDWTCapImageFilter
  
  /** Good for improving text. */
  @js.native
  sealed trait TWIF_BANDPASS extends EnumDWTCapImageFilter
  
  @js.native
  sealed trait TWIF_FINELINE extends EnumDWTCapImageFilter
  
  /** Good for improving fine lines. */
  @js.native
  sealed trait TWIF_HIGHPASS extends EnumDWTCapImageFilter
  
  /** Good for halftone images. */
  @js.native
  sealed trait TWIF_LOWPASS extends EnumDWTCapImageFilter
  
  @js.native
  sealed trait TWIF_NONE extends EnumDWTCapImageFilter
  
  @js.native
  sealed trait TWIF_TEXT extends EnumDWTCapImageFilter
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapImageFilter with Double] = js.native
  /* 1 */ @js.native
  object TWIF_AUTO extends TopLevel[TWIF_AUTO with Double]
  
  /* 3 */ @js.native
  object TWIF_BANDPASS extends TopLevel[TWIF_BANDPASS with Double]
  
  /* 4 */ @js.native
  object TWIF_FINELINE extends TopLevel[TWIF_FINELINE with Double]
  
  /* 4 */ @js.native
  object TWIF_HIGHPASS extends TopLevel[TWIF_HIGHPASS with Double]
  
  /* 2 */ @js.native
  object TWIF_LOWPASS extends TopLevel[TWIF_LOWPASS with Double]
  
  /* 0 */ @js.native
  object TWIF_NONE extends TopLevel[TWIF_NONE with Double]
  
  /* 3 */ @js.native
  object TWIF_TEXT extends TopLevel[TWIF_TEXT with Double]
  
}

