package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Administrator extends js.Object {
  /** The admin's email address. */
  var email: js.UndefOr[String] = js.undefined
}

object Administrator {
  @scala.inline
  def apply(email: String = null): Administrator = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Administrator]
  }
}

