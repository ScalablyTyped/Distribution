package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumGrayscaleTransformationMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumGrayscaleTransformationMode")
@js.native
object EnumGrayscaleTransformationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumGrayscaleTransformationMode & Double] = js.native
  
  @js.native
  sealed trait GTM_INVERTED
    extends StObject
       with EnumGrayscaleTransformationMode
  /* 1 */ val GTM_INVERTED: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumGrayscaleTransformationMode.GTM_INVERTED & Double = js.native
  
  @js.native
  sealed trait GTM_ORIGINAL
    extends StObject
       with EnumGrayscaleTransformationMode
  /* 2 */ val GTM_ORIGINAL: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumGrayscaleTransformationMode.GTM_ORIGINAL & Double = js.native
  
  @js.native
  sealed trait GTM_SKIP
    extends StObject
       with EnumGrayscaleTransformationMode
  /* 0 */ val GTM_SKIP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumGrayscaleTransformationMode.GTM_SKIP & Double = js.native
}
