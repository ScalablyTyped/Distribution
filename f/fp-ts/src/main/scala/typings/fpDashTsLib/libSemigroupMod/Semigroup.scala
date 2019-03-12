package typings
package fpDashTsLib.libSemigroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semigroup[A] extends js.Object {
  def concat(x: A, y: A): A
}

object Semigroup {
  @scala.inline
  def apply[A](concat: (A, A) => A): Semigroup[A] = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction2(concat))
  
    __obj.asInstanceOf[Semigroup[A]]
  }
}

