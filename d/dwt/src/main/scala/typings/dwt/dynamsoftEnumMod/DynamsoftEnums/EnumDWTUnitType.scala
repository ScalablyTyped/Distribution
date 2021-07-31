package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTUnitType extends StObject
/** ICAP_UNITS values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_UnitType")
@js.native
object EnumDWTUnitType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTUnitType & Double] = js.native
  
  @js.native
  sealed trait TWUN_CENTIMETERS
    extends StObject
       with EnumDWTUnitType
  /* 1 */ val TWUN_CENTIMETERS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_CENTIMETERS & Double = js.native
  
  @js.native
  sealed trait TWUN_INCHES
    extends StObject
       with EnumDWTUnitType
  /* 0 */ val TWUN_INCHES: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_INCHES & Double = js.native
  
  @js.native
  sealed trait TWUN_MILLIMETERS
    extends StObject
       with EnumDWTUnitType
  /* 6 */ val TWUN_MILLIMETERS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_MILLIMETERS & Double = js.native
  
  @js.native
  sealed trait TWUN_PICAS
    extends StObject
       with EnumDWTUnitType
  /* 2 */ val TWUN_PICAS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_PICAS & Double = js.native
  
  @js.native
  sealed trait TWUN_PIXELS
    extends StObject
       with EnumDWTUnitType
  /* 5 */ val TWUN_PIXELS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_PIXELS & Double = js.native
  
  @js.native
  sealed trait TWUN_POINTS
    extends StObject
       with EnumDWTUnitType
  /* 3 */ val TWUN_POINTS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_POINTS & Double = js.native
  
  @js.native
  sealed trait TWUN_TWIPS
    extends StObject
       with EnumDWTUnitType
  /* 4 */ val TWUN_TWIPS: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTUnitType.TWUN_TWIPS & Double = js.native
}
