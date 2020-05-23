package typings.gapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerId extends js.Object {
  /** Obfuscated customer id for the record. */
  var customerId: js.UndefOr[String] = js.undefined
  /** Obfuscated user id for the record. */
  var profileId: js.UndefOr[String] = js.undefined
  /** The type of item, can be a customer or user. */
  var `type`: js.UndefOr[String] = js.undefined
  /** user's email. */
  var userEmail: js.UndefOr[String] = js.undefined
}

object CustomerId {
  @scala.inline
  def apply(
    customerId: String = null,
    profileId: String = null,
    `type`: String = null,
    userEmail: String = null
  ): CustomerId = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerId]
  }
}

