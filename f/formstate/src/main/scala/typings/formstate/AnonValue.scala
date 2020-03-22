package typings.formstate

import typings.formstate.formstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[TValue] extends js.Object {
  var hasError: `false`
  var value: TValue
}

object AnonValue {
  @scala.inline
  def apply[TValue](hasError: `false`, value: TValue): AnonValue[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue[TValue]]
  }
}

