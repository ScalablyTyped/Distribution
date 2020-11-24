package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTUnitType extends js.Object
/** ICAP_UNITS values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_UnitType")
@js.native
object EnumDWTUnitType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTUnitType with Double] = js.native
  
  @js.native
  sealed trait TWUN_CENTIMETERS extends EnumDWTUnitType
  /* 1 */ @js.native
  object TWUN_CENTIMETERS extends TopLevel[TWUN_CENTIMETERS with Double]
  
  @js.native
  sealed trait TWUN_INCHES extends EnumDWTUnitType
  /* 0 */ @js.native
  object TWUN_INCHES extends TopLevel[TWUN_INCHES with Double]
  
  @js.native
  sealed trait TWUN_MILLIMETERS extends EnumDWTUnitType
  /* 6 */ @js.native
  object TWUN_MILLIMETERS extends TopLevel[TWUN_MILLIMETERS with Double]
  
  @js.native
  sealed trait TWUN_PICAS extends EnumDWTUnitType
  /* 2 */ @js.native
  object TWUN_PICAS extends TopLevel[TWUN_PICAS with Double]
  
  @js.native
  sealed trait TWUN_PIXELS extends EnumDWTUnitType
  /* 5 */ @js.native
  object TWUN_PIXELS extends TopLevel[TWUN_PIXELS with Double]
  
  @js.native
  sealed trait TWUN_POINTS extends EnumDWTUnitType
  /* 3 */ @js.native
  object TWUN_POINTS extends TopLevel[TWUN_POINTS with Double]
  
  @js.native
  sealed trait TWUN_TWIPS extends EnumDWTUnitType
  /* 4 */ @js.native
  object TWUN_TWIPS extends TopLevel[TWUN_TWIPS with Double]
}
