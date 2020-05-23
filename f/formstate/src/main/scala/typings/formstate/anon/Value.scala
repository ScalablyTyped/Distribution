package typings.formstate.anon

import typings.formstate.formstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[TValue] extends js.Object {
  var hasError: `false`
  var value: TValue
}

object Value {
  @scala.inline
  def apply[TValue](hasError: `false`, value: TValue): Value[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[TValue]]
  }
}

