package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTShowMode extends js.Object

@JSGlobal("EnumDWT_ShowMode")
@js.native
object EnumDWTShowMode extends js.Object {
  /** Activates the window and displays it in its current size and position. */
  @js.native
  sealed trait SW_ACTIVE extends EnumDWTShowMode
  
  /** Close the latest opened editor window */
  @js.native
  sealed trait SW_CLOSE extends EnumDWTShowMode
  
  /** Check whether a window exists */
  @js.native
  sealed trait SW_IFLIVE extends EnumDWTShowMode
  
  /** Maximizes the window */
  @js.native
  sealed trait SW_MAX extends EnumDWTShowMode
  
  /** Minimize the window */
  @js.native
  sealed trait SW_MIN extends EnumDWTShowMode
  
}

