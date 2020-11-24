package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumGrayscaleTransformationMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumGrayscaleTransformationMode")
@js.native
object EnumGrayscaleTransformationMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumGrayscaleTransformationMode with Double] = js.native
  
  @js.native
  sealed trait GTM_INVERTED extends EnumGrayscaleTransformationMode
  /* 1 */ @js.native
  object GTM_INVERTED extends TopLevel[GTM_INVERTED with Double]
  
  @js.native
  sealed trait GTM_ORIGINAL extends EnumGrayscaleTransformationMode
  /* 2 */ @js.native
  object GTM_ORIGINAL extends TopLevel[GTM_ORIGINAL with Double]
  
  @js.native
  sealed trait GTM_SKIP extends EnumGrayscaleTransformationMode
  /* 0 */ @js.native
  object GTM_SKIP extends TopLevel[GTM_SKIP with Double]
}
