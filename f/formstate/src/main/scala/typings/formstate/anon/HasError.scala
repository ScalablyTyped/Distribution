package typings.formstate.anon

import typings.formstate.formstateBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasError extends js.Object {
  var hasError: `true`
}

object HasError {
  @scala.inline
  def apply(hasError: `true`): HasError = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasError]
  }
}

