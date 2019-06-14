package typings
package estraverseLib.estraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisitorOption extends js.Object

@JSImport("estraverse", "VisitorOption")
@js.native
object VisitorOption extends js.Object {
  @js.native
  sealed trait Break
    extends estraverseLib.estraverseMod.VisitorOption
  
  @js.native
  sealed trait Remove
    extends estraverseLib.estraverseMod.VisitorOption
  
  @js.native
  sealed trait Skip
    extends estraverseLib.estraverseMod.VisitorOption
  
  /* 1 */ val Break: Break with scala.Double = js.native
  /* 2 */ val Remove: Remove with scala.Double = js.native
  /* 0 */ val Skip: Skip with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[estraverseLib.estraverseMod.VisitorOption with scala.Double] = js.native
}

