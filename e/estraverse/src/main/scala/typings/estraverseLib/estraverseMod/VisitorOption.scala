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
  
  val Break: Break with java.lang.String = js.native
  val Remove: Remove with java.lang.String = js.native
  val Skip: Skip with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[estraverseLib.estraverseMod.VisitorOption with java.lang.String] = js.native
}

