package typings.formstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValue[TValue] extends js.Object {
  var newValue: TValue
  var oldValue: TValue
}

object NewValue {
  @scala.inline
  def apply[TValue](newValue: TValue, oldValue: TValue): NewValue[TValue] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValue[TValue]]
  }
}

