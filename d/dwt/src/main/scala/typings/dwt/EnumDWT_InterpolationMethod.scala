package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_InterpolationMethod with Double] = js.native
  /* 5 */ @js.native
  object IM_BESTQUALITY extends TopLevel[IM_BESTQUALITY with Double]
  
  /* 3 */ @js.native
  object IM_BICUBIC extends TopLevel[IM_BICUBIC with Double]
  
  /* 2 */ @js.native
  object IM_BILINEAR extends TopLevel[IM_BILINEAR with Double]
  
  /* 1 */ @js.native
  object IM_NEARESTNEIGHBOUR extends TopLevel[IM_NEARESTNEIGHBOUR with Double]
  
}

