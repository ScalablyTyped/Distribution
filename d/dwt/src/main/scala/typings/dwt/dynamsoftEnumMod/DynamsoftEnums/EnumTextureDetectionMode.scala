package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTextureDetectionMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTextureDetectionMode")
@js.native
object EnumTextureDetectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTextureDetectionMode & Double] = js.native
  
  @js.native
  sealed trait TDM_AUTO
    extends StObject
       with EnumTextureDetectionMode
  /* 1 */ val TDM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTextureDetectionMode.TDM_AUTO & Double = js.native
  
  @js.native
  sealed trait TDM_GENERAL_WIDTH_CONCENTRATION
    extends StObject
       with EnumTextureDetectionMode
  /* 2 */ val TDM_GENERAL_WIDTH_CONCENTRATION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTextureDetectionMode.TDM_GENERAL_WIDTH_CONCENTRATION & Double = js.native
  
  @js.native
  sealed trait TDM_SKIP
    extends StObject
       with EnumTextureDetectionMode
  /* 0 */ val TDM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTextureDetectionMode.TDM_SKIP & Double = js.native
}
