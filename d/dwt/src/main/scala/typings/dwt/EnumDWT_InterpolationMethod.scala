package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_InterpolationMethod extends js.Object

/** The method to do interpolation. */
@JSGlobal("EnumDWT_InterpolationMethod")
@js.native
object EnumDWT_InterpolationMethod extends js.Object {
  @js.native
  sealed trait IM_BESTQUALITY extends EnumDWT_InterpolationMethod
  
  @js.native
  sealed trait IM_BICUBIC extends EnumDWT_InterpolationMethod
  
  @js.native
  sealed trait IM_BILINEAR extends EnumDWT_InterpolationMethod
  
  @js.native
  sealed trait IM_NEARESTNEIGHBOUR extends EnumDWT_InterpolationMethod
  
  /* 5 */ val IM_BESTQUALITY: typings.dwt.EnumDWT_InterpolationMethod.IM_BESTQUALITY with Double = js.native
  /* 3 */ val IM_BICUBIC: typings.dwt.EnumDWT_InterpolationMethod.IM_BICUBIC with Double = js.native
  /* 2 */ val IM_BILINEAR: typings.dwt.EnumDWT_InterpolationMethod.IM_BILINEAR with Double = js.native
  /* 1 */ val IM_NEARESTNEIGHBOUR: typings.dwt.EnumDWT_InterpolationMethod.IM_NEARESTNEIGHBOUR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_InterpolationMethod with Double] = js.native
}

