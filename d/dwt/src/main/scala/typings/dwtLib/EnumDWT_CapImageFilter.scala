package typings
package dwtLib

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
  sealed trait TWIF_AUTO
    extends dwtLib.EnumDWT_CapImageFilter
  
  /** Good for improving text. */
  @js.native
  sealed trait TWIF_BANDPASS
    extends dwtLib.EnumDWT_CapImageFilter
  
  @js.native
  sealed trait TWIF_FINELINE
    extends dwtLib.EnumDWT_CapImageFilter
  
  /** Good for improving fine lines. */
  @js.native
  sealed trait TWIF_HIGHPASS
    extends dwtLib.EnumDWT_CapImageFilter
  
  /** Good for halftone images. */
  @js.native
  sealed trait TWIF_LOWPASS
    extends dwtLib.EnumDWT_CapImageFilter
  
  @js.native
  sealed trait TWIF_NONE
    extends dwtLib.EnumDWT_CapImageFilter
  
  @js.native
  sealed trait TWIF_TEXT
    extends dwtLib.EnumDWT_CapImageFilter
  
  /* 1 */ val TWIF_AUTO: TWIF_AUTO with scala.Double = js.native
  /* 3 */ val TWIF_BANDPASS: TWIF_BANDPASS with scala.Double = js.native
  /* 4 */ val TWIF_FINELINE: TWIF_FINELINE with scala.Double = js.native
  /* 4 */ val TWIF_HIGHPASS: TWIF_HIGHPASS with scala.Double = js.native
  /* 2 */ val TWIF_LOWPASS: TWIF_LOWPASS with scala.Double = js.native
  /* 0 */ val TWIF_NONE: TWIF_NONE with scala.Double = js.native
  /* 3 */ val TWIF_TEXT: TWIF_TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapImageFilter with scala.Double] = js.native
}

