package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_BorderStyle extends js.Object

/** Border Styles */
@JSGlobal("EnumDWT_BorderStyle")
@js.native
object EnumDWT_BorderStyle extends js.Object {
  /** No border. */
  @js.native
  sealed trait TWBS_NONE extends EnumDWT_BorderStyle
  
  /** 3D border.   */
  @js.native
  sealed trait TWBS_SINGLE3D extends EnumDWT_BorderStyle
  
  /** Flat border. */
  @js.native
  sealed trait TWBS_SINGLEFLAT extends EnumDWT_BorderStyle
  
  /* 0 */ val TWBS_NONE: typings.dwt.EnumDWT_BorderStyle.TWBS_NONE with Double = js.native
  /* 2 */ val TWBS_SINGLE3D: typings.dwt.EnumDWT_BorderStyle.TWBS_SINGLE3D with Double = js.native
  /* 1 */ val TWBS_SINGLEFLAT: typings.dwt.EnumDWT_BorderStyle.TWBS_SINGLEFLAT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_BorderStyle with Double] = js.native
}

