package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumImagePreprocessingMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumImagePreprocessingMode")
@js.native
object EnumImagePreprocessingMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumImagePreprocessingMode with Double] = js.native
  
  @js.native
  sealed trait IPM_AUTO extends EnumImagePreprocessingMode
  /* 1 */ @js.native
  object IPM_AUTO extends TopLevel[IPM_AUTO with Double]
  
  @js.native
  sealed trait IPM_GENERAL extends EnumImagePreprocessingMode
  /* 2 */ @js.native
  object IPM_GENERAL extends TopLevel[IPM_GENERAL with Double]
  
  @js.native
  sealed trait IPM_GRAY_EQUALIZE extends EnumImagePreprocessingMode
  /* 4 */ @js.native
  object IPM_GRAY_EQUALIZE extends TopLevel[IPM_GRAY_EQUALIZE with Double]
  
  @js.native
  sealed trait IPM_GRAY_SMOOTH extends EnumImagePreprocessingMode
  /* 8 */ @js.native
  object IPM_GRAY_SMOOTH extends TopLevel[IPM_GRAY_SMOOTH with Double]
  
  @js.native
  sealed trait IPM_MORPHOLOGY extends EnumImagePreprocessingMode
  /* 32 */ @js.native
  object IPM_MORPHOLOGY extends TopLevel[IPM_MORPHOLOGY with Double]
  
  @js.native
  sealed trait IPM_SHARPEN_SMOOTH extends EnumImagePreprocessingMode
  /* 16 */ @js.native
  object IPM_SHARPEN_SMOOTH extends TopLevel[IPM_SHARPEN_SMOOTH with Double]
  
  @js.native
  sealed trait IPM_SKIP extends EnumImagePreprocessingMode
  /* 0 */ @js.native
  object IPM_SKIP extends TopLevel[IPM_SKIP with Double]
}
