package typings.esfxTypeModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon8 extends js.Object {
  def next(): AnonDoneValue
}

object Anon8 {
  @scala.inline
  def apply(next: () => AnonDoneValue): Anon8 = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Anon8]
  }
}

