package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_UnitType.TWUN_CENTIMETERS
import typings.dwt.EnumDWT_UnitType.TWUN_INCHES
import typings.dwt.EnumDWT_UnitType.TWUN_MILLIMETERS
import typings.dwt.EnumDWT_UnitType.TWUN_PICAS
import typings.dwt.EnumDWT_UnitType.TWUN_PIXELS
import typings.dwt.EnumDWT_UnitType.TWUN_POINTS
import typings.dwt.EnumDWT_UnitType.TWUN_TWIPS
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_UnitType with Double] = js.native
  /* 1 */ @js.native
  object TWUN_CENTIMETERS extends TopLevel[TWUN_CENTIMETERS with Double]
  
  /* 0 */ @js.native
  object TWUN_INCHES extends TopLevel[TWUN_INCHES with Double]
  
  /* 6 */ @js.native
  object TWUN_MILLIMETERS extends TopLevel[TWUN_MILLIMETERS with Double]
  
  /* 2 */ @js.native
  object TWUN_PICAS extends TopLevel[TWUN_PICAS with Double]
  
  /* 5 */ @js.native
  object TWUN_PIXELS extends TopLevel[TWUN_PIXELS with Double]
  
  /* 3 */ @js.native
  object TWUN_POINTS extends TopLevel[TWUN_POINTS with Double]
  
  /* 4 */ @js.native
  object TWUN_TWIPS extends TopLevel[TWUN_TWIPS with Double]
  
}

