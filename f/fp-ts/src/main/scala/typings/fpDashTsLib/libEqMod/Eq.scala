package typings
package fpDashTsLib.libEqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eq[A] extends js.Object {
  def equals(x: A, y: A): scala.Boolean
}

object Eq {
  @scala.inline
  def apply[A](equals: (A, A) => scala.Boolean): Eq[A] = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction2(equals))
  
    __obj.asInstanceOf[Eq[A]]
  }
}

