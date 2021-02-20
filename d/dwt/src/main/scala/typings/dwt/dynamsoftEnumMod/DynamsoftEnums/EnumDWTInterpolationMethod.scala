package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTInterpolationMethod extends StObject
/** The method to do interpolation. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_InterpolationMethod")
@js.native
object EnumDWTInterpolationMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTInterpolationMethod with Double] = js.native
  
  @js.native
  sealed trait IM_BESTQUALITY extends EnumDWTInterpolationMethod
  /* 5 */ val IM_BESTQUALITY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTInterpolationMethod.IM_BESTQUALITY with Double = js.native
  
  @js.native
  sealed trait IM_BICUBIC extends EnumDWTInterpolationMethod
  /* 3 */ val IM_BICUBIC: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTInterpolationMethod.IM_BICUBIC with Double = js.native
  
  @js.native
  sealed trait IM_BILINEAR extends EnumDWTInterpolationMethod
  /* 2 */ val IM_BILINEAR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTInterpolationMethod.IM_BILINEAR with Double = js.native
  
  @js.native
  sealed trait IM_NEARESTNEIGHBOUR extends EnumDWTInterpolationMethod
  /* 1 */ val IM_NEARESTNEIGHBOUR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTInterpolationMethod.IM_NEARESTNEIGHBOUR with Double = js.native
}
