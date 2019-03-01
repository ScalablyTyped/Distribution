package typings
package gapiDotClientDotAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomerId extends js.Object {
  /** Obfuscated customer id for the record. */
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  /** Obfuscated user id for the record. */
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  /** The type of item, can be a customer or user. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** user's email. */
  var userEmail: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CustomerId {
  @scala.inline
  def apply(
    customerId: java.lang.String = null,
    profileId: java.lang.String = null,
    `type`: java.lang.String = null,
    userEmail: java.lang.String = null
  ): Anon_CustomerId = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail)
    __obj.asInstanceOf[Anon_CustomerId]
  }
}

