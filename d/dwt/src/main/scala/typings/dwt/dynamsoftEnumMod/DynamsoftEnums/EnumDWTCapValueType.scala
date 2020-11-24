package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapValueType extends js.Object
/** The kind of data stored in the container. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapValueType")
@js.native
object EnumDWTCapValueType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapValueType with Double] = js.native
  
  /** Means Item is a TW_BOOL    */
  @js.native
  sealed trait TWTY_BOOL extends EnumDWTCapValueType
  /* 6 */ @js.native
  object TWTY_BOOL extends TopLevel[TWTY_BOOL with Double]
  
  /** Means Item is a TW_FIX32   */
  @js.native
  sealed trait TWTY_FIX32 extends EnumDWTCapValueType
  /* 7 */ @js.native
  object TWTY_FIX32 extends TopLevel[TWTY_FIX32 with Double]
  
  /** Means Item is a TW_FRAME   */
  @js.native
  sealed trait TWTY_FRAME extends EnumDWTCapValueType
  /* 8 */ @js.native
  object TWTY_FRAME extends TopLevel[TWTY_FRAME with Double]
  
  /** Means Item is a TW_INT16   */
  @js.native
  sealed trait TWTY_INT16 extends EnumDWTCapValueType
  /* 1 */ @js.native
  object TWTY_INT16 extends TopLevel[TWTY_INT16 with Double]
  
  /** Means Item is a TW_INT32   */
  @js.native
  sealed trait TWTY_INT32 extends EnumDWTCapValueType
  /* 2 */ @js.native
  object TWTY_INT32 extends TopLevel[TWTY_INT32 with Double]
  
  @js.native
  sealed trait TWTY_INT8 extends EnumDWTCapValueType
  /* 0 */ @js.native
  object TWTY_INT8 extends TopLevel[TWTY_INT8 with Double]
  
  /** Means Item is a TW_STR128  */
  @js.native
  sealed trait TWTY_STR128 extends EnumDWTCapValueType
  /* 11 */ @js.native
  object TWTY_STR128 extends TopLevel[TWTY_STR128 with Double]
  
  /** Means Item is a TW_STR255  */
  @js.native
  sealed trait TWTY_STR255 extends EnumDWTCapValueType
  /* 12 */ @js.native
  object TWTY_STR255 extends TopLevel[TWTY_STR255 with Double]
  
  /** Means Item is a TW_STR32   */
  @js.native
  sealed trait TWTY_STR32 extends EnumDWTCapValueType
  /* 9 */ @js.native
  object TWTY_STR32 extends TopLevel[TWTY_STR32 with Double]
  
  /** Means Item is a TW_STR64   */
  @js.native
  sealed trait TWTY_STR64 extends EnumDWTCapValueType
  /* 10 */ @js.native
  object TWTY_STR64 extends TopLevel[TWTY_STR64 with Double]
  
  /** Means Item is a TW_UINT16  */
  @js.native
  sealed trait TWTY_UINT16 extends EnumDWTCapValueType
  /* 4 */ @js.native
  object TWTY_UINT16 extends TopLevel[TWTY_UINT16 with Double]
  
  /** Means Item is a TW_UINT8   */
  @js.native
  sealed trait TWTY_UINT8 extends EnumDWTCapValueType
  /* 3 */ @js.native
  object TWTY_UINT8 extends TopLevel[TWTY_UINT8 with Double]
  
  /** Means Item is a TW_int  */
  @js.native
  sealed trait TWTY_int extends EnumDWTCapValueType
  /* 5 */ @js.native
  object TWTY_int extends TopLevel[TWTY_int with Double]
}
