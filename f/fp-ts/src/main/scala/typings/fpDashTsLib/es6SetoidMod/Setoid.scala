package typings
package fpDashTsLib.es6SetoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setoid[A] extends js.Object {
  def equals(x: A, y: A): scala.Boolean
}

object Setoid {
  @scala.inline
  def apply[A](equals: (A, A) => scala.Boolean): Setoid[A] = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction2(equals))
  
    __obj.asInstanceOf[Setoid[A]]
  }
}

