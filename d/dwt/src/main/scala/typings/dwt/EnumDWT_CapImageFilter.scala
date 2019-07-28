package typings.dwt

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
  
  /* 1 */ val TWIF_AUTO: typings.dwt.EnumDWT_CapImageFilter.TWIF_AUTO with Double = js.native
  /* 3 */ val TWIF_BANDPASS: typings.dwt.EnumDWT_CapImageFilter.TWIF_BANDPASS with Double = js.native
  /* 4 */ val TWIF_FINELINE: typings.dwt.EnumDWT_CapImageFilter.TWIF_FINELINE with Double = js.native
  /* 4 */ val TWIF_HIGHPASS: typings.dwt.EnumDWT_CapImageFilter.TWIF_HIGHPASS with Double = js.native
  /* 2 */ val TWIF_LOWPASS: typings.dwt.EnumDWT_CapImageFilter.TWIF_LOWPASS with Double = js.native
  /* 0 */ val TWIF_NONE: typings.dwt.EnumDWT_CapImageFilter.TWIF_NONE with Double = js.native
  /* 3 */ val TWIF_TEXT: typings.dwt.EnumDWT_CapImageFilter.TWIF_TEXT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapImageFilter with Double] = js.native
}

