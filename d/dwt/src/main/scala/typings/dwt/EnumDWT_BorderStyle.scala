package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_BorderStyle.TWBS_NONE
import typings.dwt.EnumDWT_BorderStyle.TWBS_SINGLE3D
import typings.dwt.EnumDWT_BorderStyle.TWBS_SINGLEFLAT
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_BorderStyle with Double] = js.native
  /* 0 */ @js.native
  object TWBS_NONE extends TopLevel[TWBS_NONE with Double]
  
  /* 2 */ @js.native
  object TWBS_SINGLE3D extends TopLevel[TWBS_SINGLE3D with Double]
  
  /* 1 */ @js.native
  object TWBS_SINGLEFLAT extends TopLevel[TWBS_SINGLEFLAT with Double]
  
}

