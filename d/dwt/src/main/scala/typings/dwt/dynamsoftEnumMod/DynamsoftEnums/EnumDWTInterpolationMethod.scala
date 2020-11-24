package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTInterpolationMethod extends js.Object
/** The method to do interpolation. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_InterpolationMethod")
@js.native
object EnumDWTInterpolationMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTInterpolationMethod with Double] = js.native
  
  @js.native
  sealed trait IM_BESTQUALITY extends EnumDWTInterpolationMethod
  /* 5 */ @js.native
  object IM_BESTQUALITY extends TopLevel[IM_BESTQUALITY with Double]
  
  @js.native
  sealed trait IM_BICUBIC extends EnumDWTInterpolationMethod
  /* 3 */ @js.native
  object IM_BICUBIC extends TopLevel[IM_BICUBIC with Double]
  
  @js.native
  sealed trait IM_BILINEAR extends EnumDWTInterpolationMethod
  /* 2 */ @js.native
  object IM_BILINEAR extends TopLevel[IM_BILINEAR with Double]
  
  @js.native
  sealed trait IM_NEARESTNEIGHBOUR extends EnumDWTInterpolationMethod
  /* 1 */ @js.native
  object IM_NEARESTNEIGHBOUR extends TopLevel[IM_NEARESTNEIGHBOUR with Double]
}
