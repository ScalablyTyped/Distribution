package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListLevelNumberAlignment extends js.Object

@JSGlobal("ListLevelNumberAlignment")
@js.native
object ListLevelNumberAlignment extends js.Object {
  @js.native
  sealed trait Center
    extends devexpressDashWebLib.ListLevelNumberAlignment
  
  @js.native
  sealed trait Left
    extends devexpressDashWebLib.ListLevelNumberAlignment
  
  @js.native
  sealed trait Right
    extends devexpressDashWebLib.ListLevelNumberAlignment
  
  /* 1 */ val Center: Center with scala.Double = js.native
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.ListLevelNumberAlignment with scala.Double] = js.native
}

