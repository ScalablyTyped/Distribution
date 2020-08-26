package typings.formstate.anon

import typings.formstate.formstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value[TValue] extends js.Object {
  var hasError: `false` = js.native
  var value: TValue = js.native
}

object Value {
  @scala.inline
  def apply[TValue](hasError: `false`, value: TValue): Value[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[TValue]]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value[_], TValue] (val x: Self with Value[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHasError(value: `false`): Self = this.set("hasError", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: TValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

