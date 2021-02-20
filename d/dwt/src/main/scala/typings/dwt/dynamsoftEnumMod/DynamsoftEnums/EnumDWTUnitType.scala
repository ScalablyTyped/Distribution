package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTUnitType extends StObject
/** ICAP_UNITS values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_UnitType")
@js.native
object EnumDWTUnitType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTUnitType with Double] = js.native
  
  @js.native
  sealed trait TWUN_CENTIMETERS extends EnumDWTUnitType
  /* 1 */ val TWUN_CENTIMETERS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_CENTIMETERS with Double = js.native
  
  @js.native
  sealed trait TWUN_INCHES extends EnumDWTUnitType
  /* 0 */ val TWUN_INCHES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_INCHES with Double = js.native
  
  @js.native
  sealed trait TWUN_MILLIMETERS extends EnumDWTUnitType
  /* 6 */ val TWUN_MILLIMETERS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_MILLIMETERS with Double = js.native
  
  @js.native
  sealed trait TWUN_PICAS extends EnumDWTUnitType
  /* 2 */ val TWUN_PICAS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_PICAS with Double = js.native
  
  @js.native
  sealed trait TWUN_PIXELS extends EnumDWTUnitType
  /* 5 */ val TWUN_PIXELS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_PIXELS with Double = js.native
  
  @js.native
  sealed trait TWUN_POINTS extends EnumDWTUnitType
  /* 3 */ val TWUN_POINTS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_POINTS with Double = js.native
  
  @js.native
  sealed trait TWUN_TWIPS extends EnumDWTUnitType
  /* 4 */ val TWUN_TWIPS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_TWIPS with Double = js.native
}
