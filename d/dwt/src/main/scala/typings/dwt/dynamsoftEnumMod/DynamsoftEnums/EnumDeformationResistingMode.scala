package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDeformationResistingMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDeformationResistingMode")
@js.native
object EnumDeformationResistingMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDeformationResistingMode with Double] = js.native
  
  @js.native
  sealed trait DRM_AUTO extends EnumDeformationResistingMode
  /* 1 */ @js.native
  object DRM_AUTO extends TopLevel[DRM_AUTO with Double]
  
  @js.native
  sealed trait DRM_GENERAL extends EnumDeformationResistingMode
  /* 2 */ @js.native
  object DRM_GENERAL extends TopLevel[DRM_GENERAL with Double]
  
  @js.native
  sealed trait DRM_SKIP extends EnumDeformationResistingMode
  /* 0 */ @js.native
  object DRM_SKIP extends TopLevel[DRM_SKIP with Double]
}
