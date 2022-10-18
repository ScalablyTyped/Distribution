package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumImagePreprocessingMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumImagePreprocessingMode")
@js.native
object EnumImagePreprocessingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumImagePreprocessingMode & Double] = js.native
  
  @js.native
  sealed trait IPM_AUTO
    extends StObject
       with EnumImagePreprocessingMode
  /* 1 */ val IPM_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_AUTO & Double = js.native
  
  @js.native
  sealed trait IPM_GENERAL
    extends StObject
       with EnumImagePreprocessingMode
  /* 2 */ val IPM_GENERAL: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_GENERAL & Double = js.native
  
  @js.native
  sealed trait IPM_GRAY_EQUALIZE
    extends StObject
       with EnumImagePreprocessingMode
  /* 4 */ val IPM_GRAY_EQUALIZE: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_GRAY_EQUALIZE & Double = js.native
  
  @js.native
  sealed trait IPM_GRAY_SMOOTH
    extends StObject
       with EnumImagePreprocessingMode
  /* 8 */ val IPM_GRAY_SMOOTH: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_GRAY_SMOOTH & Double = js.native
  
  @js.native
  sealed trait IPM_MORPHOLOGY
    extends StObject
       with EnumImagePreprocessingMode
  /* 32 */ val IPM_MORPHOLOGY: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_MORPHOLOGY & Double = js.native
  
  @js.native
  sealed trait IPM_SHARPEN_SMOOTH
    extends StObject
       with EnumImagePreprocessingMode
  /* 16 */ val IPM_SHARPEN_SMOOTH: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_SHARPEN_SMOOTH & Double = js.native
  
  @js.native
  sealed trait IPM_SKIP
    extends StObject
       with EnumImagePreprocessingMode
  /* 0 */ val IPM_SKIP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImagePreprocessingMode.IPM_SKIP & Double = js.native
}
