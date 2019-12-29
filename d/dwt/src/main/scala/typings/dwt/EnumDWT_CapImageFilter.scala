package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapImageFilter extends js.Object

/** ICAP_IMAGEFILTER values. */
@JSGlobal("EnumDWT_CapImageFilter")
@js.native
object EnumDWT_CapImageFilter extends js.Object {
  @js.native
  sealed trait TWIF_AUTO extends EnumDWT_CapImageFilter
  
  /** Good for improving text. */
  @js.native
  sealed trait TWIF_BANDPASS extends EnumDWT_CapImageFilter
  
  @js.native
  sealed trait TWIF_FINELINE extends EnumDWT_CapImageFilter
  
  /** Good for improving fine lines. */
  @js.native
  sealed trait TWIF_HIGHPASS extends EnumDWT_CapImageFilter
  
  /** Good for halftone images. */
  @js.native
  sealed trait TWIF_LOWPASS extends EnumDWT_CapImageFilter
  
  @js.native
  sealed trait TWIF_NONE extends EnumDWT_CapImageFilter
  
  @js.native
  sealed trait TWIF_TEXT extends EnumDWT_CapImageFilter
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapImageFilter with Double] = js.native
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

