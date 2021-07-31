package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapLightSource extends StObject
/** ICAP_LIGHTSOURCE values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapLightSource")
@js.native
object EnumDWTCapLightSource extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapLightSource & Double] = js.native
  
  @js.native
  sealed trait TWLS_BLUE
    extends StObject
       with EnumDWTCapLightSource
  /* 2 */ val TWLS_BLUE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapLightSource.TWLS_BLUE & Double = js.native
  
  @js.native
  sealed trait TWLS_GREEN
    extends StObject
       with EnumDWTCapLightSource
  /* 1 */ val TWLS_GREEN: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapLightSource.TWLS_GREEN & Double = js.native
  
  @js.native
  sealed trait TWLS_IR
    extends StObject
       with EnumDWTCapLightSource
  /* 6 */ val TWLS_IR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapLightSource.TWLS_IR & Double = js.native
  
  @js.native
  sealed trait TWLS_NONE
    extends StObject
       with EnumDWTCapLightSource
  /* 3 */ val TWLS_NONE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapLightSource.TWLS_NONE & Double = js.native
  
  @js.native
  sealed trait TWLS_RED
    extends StObject
       with EnumDWTCapLightSource
  /* 0 */ val TWLS_RED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapLightSource.TWLS_RED & Double = js.native
  
  @js.native
  sealed trait TWLS_UV
    extends StObject
       with EnumDWTCapLightSource
  /* 5 */ val TWLS_UV: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapLightSource.TWLS_UV & Double = js.native
  
  @js.native
  sealed trait TWLS_WHITE
    extends StObject
       with EnumDWTCapLightSource
  /* 4 */ val TWLS_WHITE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCapLightSource.TWLS_WHITE & Double = js.native
}
