package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTInterpolationMethod extends js.Object

/** The method to do interpolation. */
@JSGlobal("EnumDWT_InterpolationMethod")
@js.native
object EnumDWTInterpolationMethod extends js.Object {
  @js.native
  sealed trait IM_BESTQUALITY extends EnumDWTInterpolationMethod
  
  @js.native
  sealed trait IM_BICUBIC extends EnumDWTInterpolationMethod
  
  @js.native
  sealed trait IM_BILINEAR extends EnumDWTInterpolationMethod
  
  @js.native
  sealed trait IM_NEARESTNEIGHBOUR extends EnumDWTInterpolationMethod
  
}

