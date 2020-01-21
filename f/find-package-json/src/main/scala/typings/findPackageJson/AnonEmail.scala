package typings.findPackageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var url: String
}

object AnonEmail {
  @scala.inline
  def apply(url: String, email: String = null): AnonEmail = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

