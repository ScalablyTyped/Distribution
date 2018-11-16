package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapValueType extends js.Object

/** The kind of data stored in the container. */
@JSGlobal("EnumDWT_CapValueType")
@js.native
object EnumDWT_CapValueType extends js.Object {
  /** Means Item is a TW_BOOL    */
  @js.native
  sealed trait TWTY_BOOL
    extends dwtLib.EnumDWT_CapValueType
  
  /** Means Item is a TW_FIX32   */
  @js.native
  sealed trait TWTY_FIX32
    extends dwtLib.EnumDWT_CapValueType
  
  /** Means Item is a TW_FRAME   */
  @js.native
  sealed trait TWTY_FRAME
    extends dwtLib.EnumDWT_CapValueType
  
  /** Means Item is a TW_INT16   */
  @js.native
  sealed trait TWTY_INT16
    extends dwtLib.EnumDWT_CapValueType
  
  /** Means Item is a TW_INT32   */
  @js.native
  sealed trait TWTY_INT32
    extends dwtLib.EnumDWT_CapValueType
  
  @js.native
  sealed trait TWTY_INT8
    extends dwtLib.EnumDWT_CapValueType
  
  /** Means Item is a TW_STR128  */
  @js.native
  sealed trait TWTY_STR128
    extends dwtLib.EnumDWT_CapValueType
  
  /** Means Item is a TW_STR255  */
  @js.native
  sealed trait TWTY_STR255
    extends dwtLib.EnumDWT_CapValueType
  
  /** Means Item is a TW_STR32   */
  @js.native
  sealed trait TWTY_STR32
    extends dwtLib.EnumDWT_CapValueType
  
  /** Means Item is a TW_STR64   */
  @js.native
  sealed trait TWTY_STR64
    extends dwtLib.EnumDWT_CapValueType
  
  /** Means Item is a TW_UINT16  */
  @js.native
  sealed trait TWTY_UINT16
    extends dwtLib.EnumDWT_CapValueType
  
  /** Means Item is a TW_UINT8   */
  @js.native
  sealed trait TWTY_UINT8
    extends dwtLib.EnumDWT_CapValueType
  
  /** Means Item is a TW_int  */
  @js.native
  sealed trait TWTY_int
    extends dwtLib.EnumDWT_CapValueType
  
  /* 6 */ val TWTY_BOOL: TWTY_BOOL with scala.Double = js.native
  /* 7 */ val TWTY_FIX32: TWTY_FIX32 with scala.Double = js.native
  /* 8 */ val TWTY_FRAME: TWTY_FRAME with scala.Double = js.native
  /* 1 */ val TWTY_INT16: TWTY_INT16 with scala.Double = js.native
  /* 2 */ val TWTY_INT32: TWTY_INT32 with scala.Double = js.native
  /* 0 */ val TWTY_INT8: TWTY_INT8 with scala.Double = js.native
  /* 11 */ val TWTY_STR128: TWTY_STR128 with scala.Double = js.native
  /* 12 */ val TWTY_STR255: TWTY_STR255 with scala.Double = js.native
  /* 9 */ val TWTY_STR32: TWTY_STR32 with scala.Double = js.native
  /* 10 */ val TWTY_STR64: TWTY_STR64 with scala.Double = js.native
  /* 4 */ val TWTY_UINT16: TWTY_UINT16 with scala.Double = js.native
  /* 3 */ val TWTY_UINT8: TWTY_UINT8 with scala.Double = js.native
  /* 5 */ val TWTY_int: TWTY_int with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapValueType with scala.Double] = js.native
}

