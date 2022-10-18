package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTConvertMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_ConvertMode")
@js.native
object EnumDWTConvertMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTConvertMode & Double] = js.native
  
  @js.native
  sealed trait CM_DEFAULT
    extends StObject
       with EnumDWTConvertMode
  /* 0 */ val CM_DEFAULT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTConvertMode.CM_DEFAULT & Double = js.native
  
  @js.native
  sealed trait CM_RENDERALL
    extends StObject
       with EnumDWTConvertMode
  /* 1 */ val CM_RENDERALL: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTConvertMode.CM_RENDERALL & Double = js.native
}
