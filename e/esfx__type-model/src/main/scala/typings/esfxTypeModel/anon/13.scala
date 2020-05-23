package typings.esfxTypeModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `13` extends js.Object {
  def next(): DoneBoolean
}

object `13` {
  @scala.inline
  def apply(next: () => DoneBoolean): `13` = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[`13`]
  }
}

