package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDeformationResistingMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDeformationResistingMode")
@js.native
object EnumDeformationResistingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDeformationResistingMode & Double] = js.native
  
  @js.native
  sealed trait DRM_AUTO
    extends StObject
       with EnumDeformationResistingMode
  /* 1 */ val DRM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDeformationResistingMode.DRM_AUTO & Double = js.native
  
  @js.native
  sealed trait DRM_GENERAL
    extends StObject
       with EnumDeformationResistingMode
  /* 2 */ val DRM_GENERAL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDeformationResistingMode.DRM_GENERAL & Double = js.native
  
  @js.native
  sealed trait DRM_SKIP
    extends StObject
       with EnumDeformationResistingMode
  /* 0 */ val DRM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDeformationResistingMode.DRM_SKIP & Double = js.native
}
