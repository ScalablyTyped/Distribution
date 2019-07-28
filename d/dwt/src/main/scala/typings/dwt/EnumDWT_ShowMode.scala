package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_ShowMode extends js.Object

@JSGlobal("EnumDWT_ShowMode")
@js.native
object EnumDWT_ShowMode extends js.Object {
  /** Activates the window and displays it in its current size and position. */
  @js.native
  sealed trait SW_ACTIVE extends EnumDWT_ShowMode
  
  /** Close the latest opened editor window */
  @js.native
  sealed trait SW_CLOSE extends EnumDWT_ShowMode
  
  /** Check whether a window exists */
  @js.native
  sealed trait SW_IFLIVE extends EnumDWT_ShowMode
  
  /** Maximizes the window */
  @js.native
  sealed trait SW_MAX extends EnumDWT_ShowMode
  
  /** Minimize the window */
  @js.native
  sealed trait SW_MIN extends EnumDWT_ShowMode
  
  /* 0 */ val SW_ACTIVE: typings.dwt.EnumDWT_ShowMode.SW_ACTIVE with Double = js.native
  /* 3 */ val SW_CLOSE: typings.dwt.EnumDWT_ShowMode.SW_CLOSE with Double = js.native
  /* 4 */ val SW_IFLIVE: typings.dwt.EnumDWT_ShowMode.SW_IFLIVE with Double = js.native
  /* 1 */ val SW_MAX: typings.dwt.EnumDWT_ShowMode.SW_MAX with Double = js.native
  /* 2 */ val SW_MIN: typings.dwt.EnumDWT_ShowMode.SW_MIN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_ShowMode with Double] = js.native
}

