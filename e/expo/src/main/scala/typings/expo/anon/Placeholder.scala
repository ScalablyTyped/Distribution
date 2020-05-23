package typings.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder extends js.Object {
  var placeholder: String
  var submitButtonTitle: String
}

object Placeholder {
  @scala.inline
  def apply(placeholder: String, submitButtonTitle: String): Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], submitButtonTitle = submitButtonTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
}

