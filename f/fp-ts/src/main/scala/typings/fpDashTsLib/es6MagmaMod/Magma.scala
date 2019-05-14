package typings
package fpDashTsLib.es6MagmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Magma[A] extends js.Object {
  def concat(x: A, y: A): A
}

object Magma {
  @scala.inline
  def apply[A](concat: (A, A) => A): Magma[A] = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction2(concat))
  
    __obj.asInstanceOf[Magma[A]]
  }
}

