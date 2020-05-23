package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTBorderStyle extends js.Object

/** Border Styles */
@JSGlobal("EnumDWT_BorderStyle")
@js.native
object EnumDWTBorderStyle extends js.Object {
  /** No border. */
  @js.native
  sealed trait TWBS_NONE extends EnumDWTBorderStyle
  
  /** 3D border.   */
  @js.native
  sealed trait TWBS_SINGLE3D extends EnumDWTBorderStyle
  
  /** Flat border. */
  @js.native
  sealed trait TWBS_SINGLEFLAT extends EnumDWTBorderStyle
  
}

