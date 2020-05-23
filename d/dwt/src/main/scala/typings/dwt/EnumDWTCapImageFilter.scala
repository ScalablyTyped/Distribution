package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapImageFilter extends js.Object

/** ICAP_IMAGEFILTER values. */
@JSGlobal("EnumDWT_CapImageFilter")
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
  
}

