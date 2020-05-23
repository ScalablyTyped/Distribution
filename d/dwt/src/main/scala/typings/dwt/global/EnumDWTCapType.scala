package typings.dwt.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Capabilities exist in many varieties but all have a Default Value, Current Value, and may have other values available that can be supported if selected.
  *  To help categorize the supported values into clear structures, TWAIN defines four types of containers for capabilities =
  *  TW_ONEVALUE, TW_ARRAY, TW_RANGE and TW_ENUMERATION.
  */
@JSGlobal("EnumDWT_CapType")
@js.native
object EnumDWTCapType extends js.Object {
  /* 3 */ val TWON_ARRAY: typings.dwt.EnumDWTCapType.TWON_ARRAY with Double = js.native
  /* 4 */ val TWON_ENUMERATION: typings.dwt.EnumDWTCapType.TWON_ENUMERATION with Double = js.native
  /* 0 */ val TWON_NONE: typings.dwt.EnumDWTCapType.TWON_NONE with Double = js.native
  /* 5 */ val TWON_ONEVALUE: typings.dwt.EnumDWTCapType.TWON_ONEVALUE with Double = js.native
  /* 6 */ val TWON_RANGE: typings.dwt.EnumDWTCapType.TWON_RANGE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.dwt.EnumDWTCapType with Double] = js.native
}

