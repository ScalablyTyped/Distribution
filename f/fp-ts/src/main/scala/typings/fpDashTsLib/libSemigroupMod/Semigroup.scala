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
  def apply[A](concat: js.Function2[A, A, A]): Semigroup[A] = {
    val __obj = js.Dynamic.literal(concat = concat)
  
    __obj.asInstanceOf[Semigroup[A]]
  }
}

