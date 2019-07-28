package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_UnitType extends js.Object

/** ICAP_UNITS values. */
@JSGlobal("EnumDWT_UnitType")
@js.native
object EnumDWT_UnitType extends js.Object {
  @js.native
  sealed trait TWUN_CENTIMETERS extends EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_INCHES extends EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_MILLIMETERS extends EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_PICAS extends EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_PIXELS extends EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_POINTS extends EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_TWIPS extends EnumDWT_UnitType
  
  /* 1 */ val TWUN_CENTIMETERS: typings.dwt.EnumDWT_UnitType.TWUN_CENTIMETERS with Double = js.native
  /* 0 */ val TWUN_INCHES: typings.dwt.EnumDWT_UnitType.TWUN_INCHES with Double = js.native
  /* 6 */ val TWUN_MILLIMETERS: typings.dwt.EnumDWT_UnitType.TWUN_MILLIMETERS with Double = js.native
  /* 2 */ val TWUN_PICAS: typings.dwt.EnumDWT_UnitType.TWUN_PICAS with Double = js.native
  /* 5 */ val TWUN_PIXELS: typings.dwt.EnumDWT_UnitType.TWUN_PIXELS with Double = js.native
  /* 3 */ val TWUN_POINTS: typings.dwt.EnumDWT_UnitType.TWUN_POINTS with Double = js.native
  /* 4 */ val TWUN_TWIPS: typings.dwt.EnumDWT_UnitType.TWUN_TWIPS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_UnitType with Double] = js.native
}

