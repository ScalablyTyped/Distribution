package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDeformationResistingMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDeformationResistingMode")
@js.native
object EnumDeformationResistingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDeformationResistingMode with Double] = js.native
  
  @js.native
  sealed trait DRM_AUTO extends EnumDeformationResistingMode
  /* 1 */ val DRM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDeformationResistingMode.DRM_AUTO with Double = js.native
  
  @js.native
  sealed trait DRM_GENERAL extends EnumDeformationResistingMode
  /* 2 */ val DRM_GENERAL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDeformationResistingMode.DRM_GENERAL with Double = js.native
  
  @js.native
  sealed trait DRM_SKIP extends EnumDeformationResistingMode
  /* 0 */ val DRM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDeformationResistingMode.DRM_SKIP with Double = js.native
}
