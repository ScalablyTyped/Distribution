package typings.esfxTypeModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon13 extends js.Object {
  def next(): AnonDoneBoolean
}

object Anon13 {
  @scala.inline
  def apply(next: () => AnonDoneBoolean): Anon13 = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Anon13]
  }
}

