package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumGrayscaleTransformationMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumGrayscaleTransformationMode")
@js.native
object EnumGrayscaleTransformationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumGrayscaleTransformationMode with Double] = js.native
  
  @js.native
  sealed trait GTM_INVERTED extends EnumGrayscaleTransformationMode
  /* 1 */ val GTM_INVERTED: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumGrayscaleTransformationMode.GTM_INVERTED with Double = js.native
  
  @js.native
  sealed trait GTM_ORIGINAL extends EnumGrayscaleTransformationMode
  /* 2 */ val GTM_ORIGINAL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumGrayscaleTransformationMode.GTM_ORIGINAL with Double = js.native
  
  @js.native
  sealed trait GTM_SKIP extends EnumGrayscaleTransformationMode
  /* 0 */ val GTM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumGrayscaleTransformationMode.GTM_SKIP with Double = js.native
}
