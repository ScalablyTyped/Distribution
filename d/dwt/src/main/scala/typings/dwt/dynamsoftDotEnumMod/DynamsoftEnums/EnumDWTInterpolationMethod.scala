package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTInterpolationMethod extends StObject
/** The method to do interpolation. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_InterpolationMethod")
@js.native
object EnumDWTInterpolationMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTInterpolationMethod & Double] = js.native
  
  @js.native
  sealed trait IM_BESTQUALITY
    extends StObject
       with EnumDWTInterpolationMethod
  /* 5 */ val IM_BESTQUALITY: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTInterpolationMethod.IM_BESTQUALITY & Double = js.native
  
  @js.native
  sealed trait IM_BICUBIC
    extends StObject
       with EnumDWTInterpolationMethod
  /* 3 */ val IM_BICUBIC: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTInterpolationMethod.IM_BICUBIC & Double = js.native
  
  @js.native
  sealed trait IM_BILINEAR
    extends StObject
       with EnumDWTInterpolationMethod
  /* 2 */ val IM_BILINEAR: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTInterpolationMethod.IM_BILINEAR & Double = js.native
  
  @js.native
  sealed trait IM_NEARESTNEIGHBOUR
    extends StObject
       with EnumDWTInterpolationMethod
  /* 1 */ val IM_NEARESTNEIGHBOUR: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTInterpolationMethod.IM_NEARESTNEIGHBOUR & Double = js.native
}
