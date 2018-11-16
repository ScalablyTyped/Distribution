package typings
package dwtLib

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
  sealed trait SW_ACTIVE
    extends dwtLib.EnumDWT_ShowMode
  
  /** Close the latest opened editor window */
  @js.native
  sealed trait SW_CLOSE
    extends dwtLib.EnumDWT_ShowMode
  
  /** Check whether a window exists */
  @js.native
  sealed trait SW_IFLIVE
    extends dwtLib.EnumDWT_ShowMode
  
  /** Maximizes the window */
  @js.native
  sealed trait SW_MAX
    extends dwtLib.EnumDWT_ShowMode
  
  /** Minimize the window */
  @js.native
  sealed trait SW_MIN
    extends dwtLib.EnumDWT_ShowMode
  
  /* 0 */ val SW_ACTIVE: SW_ACTIVE with scala.Double = js.native
  /* 3 */ val SW_CLOSE: SW_CLOSE with scala.Double = js.native
  /* 4 */ val SW_IFLIVE: SW_IFLIVE with scala.Double = js.native
  /* 1 */ val SW_MAX: SW_MAX with scala.Double = js.native
  /* 2 */ val SW_MIN: SW_MIN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_ShowMode with scala.Double] = js.native
}

