package typings.dwt

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
  sealed trait TWTY_BOOL extends EnumDWT_CapValueType
  
  /** Means Item is a TW_FIX32   */
  @js.native
  sealed trait TWTY_FIX32 extends EnumDWT_CapValueType
  
  /** Means Item is a TW_FRAME   */
  @js.native
  sealed trait TWTY_FRAME extends EnumDWT_CapValueType
  
  /** Means Item is a TW_INT16   */
  @js.native
  sealed trait TWTY_INT16 extends EnumDWT_CapValueType
  
  /** Means Item is a TW_INT32   */
  @js.native
  sealed trait TWTY_INT32 extends EnumDWT_CapValueType
  
  @js.native
  sealed trait TWTY_INT8 extends EnumDWT_CapValueType
  
  /** Means Item is a TW_STR128  */
  @js.native
  sealed trait TWTY_STR128 extends EnumDWT_CapValueType
  
  /** Means Item is a TW_STR255  */
  @js.native
  sealed trait TWTY_STR255 extends EnumDWT_CapValueType
  
  /** Means Item is a TW_STR32   */
  @js.native
  sealed trait TWTY_STR32 extends EnumDWT_CapValueType
  
  /** Means Item is a TW_STR64   */
  @js.native
  sealed trait TWTY_STR64 extends EnumDWT_CapValueType
  
  /** Means Item is a TW_UINT16  */
  @js.native
  sealed trait TWTY_UINT16 extends EnumDWT_CapValueType
  
  /** Means Item is a TW_UINT8   */
  @js.native
  sealed trait TWTY_UINT8 extends EnumDWT_CapValueType
  
  /** Means Item is a TW_int  */
  @js.native
  sealed trait TWTY_int extends EnumDWT_CapValueType
  
  /* 6 */ val TWTY_BOOL: typings.dwt.EnumDWT_CapValueType.TWTY_BOOL with Double = js.native
  /* 7 */ val TWTY_FIX32: typings.dwt.EnumDWT_CapValueType.TWTY_FIX32 with Double = js.native
  /* 8 */ val TWTY_FRAME: typings.dwt.EnumDWT_CapValueType.TWTY_FRAME with Double = js.native
  /* 1 */ val TWTY_INT16: typings.dwt.EnumDWT_CapValueType.TWTY_INT16 with Double = js.native
  /* 2 */ val TWTY_INT32: typings.dwt.EnumDWT_CapValueType.TWTY_INT32 with Double = js.native
  /* 0 */ val TWTY_INT8: typings.dwt.EnumDWT_CapValueType.TWTY_INT8 with Double = js.native
  /* 11 */ val TWTY_STR128: typings.dwt.EnumDWT_CapValueType.TWTY_STR128 with Double = js.native
  /* 12 */ val TWTY_STR255: typings.dwt.EnumDWT_CapValueType.TWTY_STR255 with Double = js.native
  /* 9 */ val TWTY_STR32: typings.dwt.EnumDWT_CapValueType.TWTY_STR32 with Double = js.native
  /* 10 */ val TWTY_STR64: typings.dwt.EnumDWT_CapValueType.TWTY_STR64 with Double = js.native
  /* 4 */ val TWTY_UINT16: typings.dwt.EnumDWT_CapValueType.TWTY_UINT16 with Double = js.native
  /* 3 */ val TWTY_UINT8: typings.dwt.EnumDWT_CapValueType.TWTY_UINT8 with Double = js.native
  /* 5 */ val TWTY_int: typings.dwt.EnumDWT_CapValueType.TWTY_int with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapValueType with Double] = js.native
}

