package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumImagePreprocessingMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumImagePreprocessingMode")
@js.native
object EnumImagePreprocessingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumImagePreprocessingMode with Double] = js.native
  
  @js.native
  sealed trait IPM_AUTO extends EnumImagePreprocessingMode
  /* 1 */ val IPM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_AUTO with Double = js.native
  
  @js.native
  sealed trait IPM_GENERAL extends EnumImagePreprocessingMode
  /* 2 */ val IPM_GENERAL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_GENERAL with Double = js.native
  
  @js.native
  sealed trait IPM_GRAY_EQUALIZE extends EnumImagePreprocessingMode
  /* 4 */ val IPM_GRAY_EQUALIZE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_GRAY_EQUALIZE with Double = js.native
  
  @js.native
  sealed trait IPM_GRAY_SMOOTH extends EnumImagePreprocessingMode
  /* 8 */ val IPM_GRAY_SMOOTH: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_GRAY_SMOOTH with Double = js.native
  
  @js.native
  sealed trait IPM_MORPHOLOGY extends EnumImagePreprocessingMode
  /* 32 */ val IPM_MORPHOLOGY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_MORPHOLOGY with Double = js.native
  
  @js.native
  sealed trait IPM_SHARPEN_SMOOTH extends EnumImagePreprocessingMode
  /* 16 */ val IPM_SHARPEN_SMOOTH: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_SHARPEN_SMOOTH with Double = js.native
  
  @js.native
  sealed trait IPM_SKIP extends EnumImagePreprocessingMode
  /* 0 */ val IPM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_SKIP with Double = js.native
}
