package typings
package fpDashTsLib.libSetoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setoid[A] extends js.Object {
  def equals(x: A, y: A): scala.Boolean
}

object Setoid {
  @scala.inline
  def apply[A](equals: js.Function2[A, A, scala.Boolean]): Setoid[A] = {
    val __obj = js.Dynamic.literal(equals = equals)
  
    __obj.asInstanceOf[Setoid[A]]
  }
}

