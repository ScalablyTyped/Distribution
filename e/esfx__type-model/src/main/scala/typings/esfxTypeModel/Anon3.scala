package typings.esfxTypeModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  def next(): AnonValue
}

object Anon3 {
  @scala.inline
  def apply(next: () => AnonValue): Anon3 = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Anon3]
  }
}

