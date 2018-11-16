package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapFilterType extends js.Object

/** ICAP_FILTER values. */
@JSGlobal("EnumDWT_CapFilterType")
@js.native
object EnumDWT_CapFilterType extends js.Object {
  @js.native
  sealed trait TWFT_BLACK
    extends dwtLib.EnumDWT_CapFilterType
  
  @js.native
  sealed trait TWFT_BLUE
    extends dwtLib.EnumDWT_CapFilterType
  
  @js.native
  sealed trait TWFT_CYAN
    extends dwtLib.EnumDWT_CapFilterType
  
  @js.native
  sealed trait TWFT_GREEN
    extends dwtLib.EnumDWT_CapFilterType
  
  @js.native
  sealed trait TWFT_MAGENTA
    extends dwtLib.EnumDWT_CapFilterType
  
  @js.native
  sealed trait TWFT_NONE
    extends dwtLib.EnumDWT_CapFilterType
  
  @js.native
  sealed trait TWFT_RED
    extends dwtLib.EnumDWT_CapFilterType
  
  @js.native
  sealed trait TWFT_WHITE
    extends dwtLib.EnumDWT_CapFilterType
  
  @js.native
  sealed trait TWFT_YELLOW
    extends dwtLib.EnumDWT_CapFilterType
  
  /* 8 */ val TWFT_BLACK: TWFT_BLACK with scala.Double = js.native
  /* 2 */ val TWFT_BLUE: TWFT_BLUE with scala.Double = js.native
  /* 5 */ val TWFT_CYAN: TWFT_CYAN with scala.Double = js.native
  /* 1 */ val TWFT_GREEN: TWFT_GREEN with scala.Double = js.native
  /* 6 */ val TWFT_MAGENTA: TWFT_MAGENTA with scala.Double = js.native
  /* 3 */ val TWFT_NONE: TWFT_NONE with scala.Double = js.native
  /* 0 */ val TWFT_RED: TWFT_RED with scala.Double = js.native
  /* 4 */ val TWFT_WHITE: TWFT_WHITE with scala.Double = js.native
  /* 7 */ val TWFT_YELLOW: TWFT_YELLOW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapFilterType with scala.Double] = js.native
}

