package typings
package dwtLib

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
  sealed trait IM_BESTQUALITY
    extends dwtLib.EnumDWT_InterpolationMethod
  
  @js.native
  sealed trait IM_BICUBIC
    extends dwtLib.EnumDWT_InterpolationMethod
  
  @js.native
  sealed trait IM_BILINEAR
    extends dwtLib.EnumDWT_InterpolationMethod
  
  @js.native
  sealed trait IM_NEARESTNEIGHBOUR
    extends dwtLib.EnumDWT_InterpolationMethod
  
  /* 5 */ val IM_BESTQUALITY: IM_BESTQUALITY with scala.Double = js.native
  /* 3 */ val IM_BICUBIC: IM_BICUBIC with scala.Double = js.native
  /* 2 */ val IM_BILINEAR: IM_BILINEAR with scala.Double = js.native
  /* 1 */ val IM_NEARESTNEIGHBOUR: IM_NEARESTNEIGHBOUR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_InterpolationMethod with scala.Double] = js.native
}

