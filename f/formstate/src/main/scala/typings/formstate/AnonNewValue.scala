package typings.formstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValue[TValue] extends js.Object {
  var newValue: TValue
  var oldValue: TValue
}

object AnonNewValue {
  @scala.inline
  def apply[TValue](newValue: TValue, oldValue: TValue): AnonNewValue[TValue] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewValue[TValue]]
  }
}

