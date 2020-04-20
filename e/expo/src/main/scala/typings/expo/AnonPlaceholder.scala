package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlaceholder extends js.Object {
  var placeholder: String
  var submitButtonTitle: String
}

object AnonPlaceholder {
  @scala.inline
  def apply(placeholder: String, submitButtonTitle: String): AnonPlaceholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], submitButtonTitle = submitButtonTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlaceholder]
  }
}

