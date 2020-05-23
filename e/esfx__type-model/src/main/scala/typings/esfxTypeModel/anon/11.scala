package typings.esfxTypeModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `11` extends js.Object {
  def next(): `10`
}

object `11` {
  @scala.inline
  def apply(next: () => `10`): `11` = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[`11`]
  }
}

