package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTUnitType extends js.Object

/** ICAP_UNITS values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_UnitType")
@js.native
object EnumDWTUnitType extends js.Object {
  @js.native
  sealed trait TWUN_CENTIMETERS extends EnumDWTUnitType
  
  @js.native
  sealed trait TWUN_INCHES extends EnumDWTUnitType
  
  @js.native
  sealed trait TWUN_MILLIMETERS extends EnumDWTUnitType
  
  @js.native
  sealed trait TWUN_PICAS extends EnumDWTUnitType
  
  @js.native
  sealed trait TWUN_PIXELS extends EnumDWTUnitType
  
  @js.native
  sealed trait TWUN_POINTS extends EnumDWTUnitType
  
  @js.native
  sealed trait TWUN_TWIPS extends EnumDWTUnitType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTUnitType with Double] = js.native
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

