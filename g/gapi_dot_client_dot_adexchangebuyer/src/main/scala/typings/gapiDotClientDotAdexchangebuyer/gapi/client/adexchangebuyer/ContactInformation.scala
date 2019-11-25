package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactInformation extends js.Object {
  /** Email address of the contact. */
  var email: js.UndefOr[String] = js.undefined
  /** The name of the contact. */
  var name: js.UndefOr[String] = js.undefined
}

object ContactInformation {
  @scala.inline
  def apply(email: String = null, name: String = null): ContactInformation = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactInformation]
  }
}

