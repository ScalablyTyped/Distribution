package typings
package dwtLib

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
  sealed trait TWUN_CENTIMETERS
    extends dwtLib.EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_INCHES
    extends dwtLib.EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_MILLIMETERS
    extends dwtLib.EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_PICAS
    extends dwtLib.EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_PIXELS
    extends dwtLib.EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_POINTS
    extends dwtLib.EnumDWT_UnitType
  
  @js.native
  sealed trait TWUN_TWIPS
    extends dwtLib.EnumDWT_UnitType
  
  /* 1 */ val TWUN_CENTIMETERS: TWUN_CENTIMETERS with scala.Double = js.native
  /* 0 */ val TWUN_INCHES: TWUN_INCHES with scala.Double = js.native
  /* 6 */ val TWUN_MILLIMETERS: TWUN_MILLIMETERS with scala.Double = js.native
  /* 2 */ val TWUN_PICAS: TWUN_PICAS with scala.Double = js.native
  /* 5 */ val TWUN_PIXELS: TWUN_PIXELS with scala.Double = js.native
  /* 3 */ val TWUN_POINTS: TWUN_POINTS with scala.Double = js.native
  /* 4 */ val TWUN_TWIPS: TWUN_TWIPS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_UnitType with scala.Double] = js.native
}

