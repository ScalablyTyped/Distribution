package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapValueType extends js.Object

/** The kind of data stored in the container. */
@JSGlobal("EnumDWT_CapValueType")
@js.native
object EnumDWTCapValueType extends js.Object {
  /** Means Item is a TW_BOOL    */
  @js.native
  sealed trait TWTY_BOOL extends EnumDWTCapValueType
  
  /** Means Item is a TW_FIX32   */
  @js.native
  sealed trait TWTY_FIX32 extends EnumDWTCapValueType
  
  /** Means Item is a TW_FRAME   */
  @js.native
  sealed trait TWTY_FRAME extends EnumDWTCapValueType
  
  /** Means Item is a TW_INT16   */
  @js.native
  sealed trait TWTY_INT16 extends EnumDWTCapValueType
  
  /** Means Item is a TW_INT32   */
  @js.native
  sealed trait TWTY_INT32 extends EnumDWTCapValueType
  
  @js.native
  sealed trait TWTY_INT8 extends EnumDWTCapValueType
  
  /** Means Item is a TW_STR128  */
  @js.native
  sealed trait TWTY_STR128 extends EnumDWTCapValueType
  
  /** Means Item is a TW_STR255  */
  @js.native
  sealed trait TWTY_STR255 extends EnumDWTCapValueType
  
  /** Means Item is a TW_STR32   */
  @js.native
  sealed trait TWTY_STR32 extends EnumDWTCapValueType
  
  /** Means Item is a TW_STR64   */
  @js.native
  sealed trait TWTY_STR64 extends EnumDWTCapValueType
  
  /** Means Item is a TW_UINT16  */
  @js.native
  sealed trait TWTY_UINT16 extends EnumDWTCapValueType
  
  /** Means Item is a TW_UINT8   */
  @js.native
  sealed trait TWTY_UINT8 extends EnumDWTCapValueType
  
  /** Means Item is a TW_int  */
  @js.native
  sealed trait TWTY_int extends EnumDWTCapValueType
  
}

