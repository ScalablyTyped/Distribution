package typings.gapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallerType extends js.Object {
  /** User or OAuth 2LO request. */
  var callerType: js.UndefOr[String] = js.undefined
  /** Email address of the user. */
  var email: js.UndefOr[String] = js.undefined
  /** For OAuth 2LO API requests, consumer_key of the requestor. */
  var key: js.UndefOr[String] = js.undefined
  /** Obfuscated user id of the user. */
  var profileId: js.UndefOr[String] = js.undefined
}

object CallerType {
  @scala.inline
  def apply(callerType: String = null, email: String = null, key: String = null, profileId: String = null): CallerType = {
    val __obj = js.Dynamic.literal()
    if (callerType != null) __obj.updateDynamic("callerType")(callerType.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallerType]
  }
}

