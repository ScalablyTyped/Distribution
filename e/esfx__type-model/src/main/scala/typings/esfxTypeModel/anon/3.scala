package typings.esfxTypeModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  def next(): Value
}

object `3` {
  @scala.inline
  def apply(next: () => Value): `3` = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[`3`]
  }
}

