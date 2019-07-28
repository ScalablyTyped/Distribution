package typings.expressDashJwt.expressDashJwtMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* property */ StringDictionary[js.Any] {
  var credentialsRequired: js.UndefOr[Boolean] = js.undefined
  var getToken: js.UndefOr[GetTokenCallback] = js.undefined
  var isRevoked: js.UndefOr[IsRevokedCallback] = js.undefined
  var requestProperty: js.UndefOr[String] = js.undefined
  var secret: secretType | SecretCallback | SecretCallbackLong
  var userProperty: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    secret: secretType | SecretCallback | SecretCallbackLong,
    StringDictionary: /* property */ StringDictionary[js.Any] = null,
    credentialsRequired: js.UndefOr[Boolean] = js.undefined,
    getToken: GetTokenCallback = null,
    isRevoked: IsRevokedCallback = null,
    requestProperty: String = null,
    userProperty: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(credentialsRequired)) __obj.updateDynamic("credentialsRequired")(credentialsRequired)
    if (getToken != null) __obj.updateDynamic("getToken")(getToken)
    if (isRevoked != null) __obj.updateDynamic("isRevoked")(isRevoked)
    if (requestProperty != null) __obj.updateDynamic("requestProperty")(requestProperty)
    if (userProperty != null) __obj.updateDynamic("userProperty")(userProperty)
    __obj.asInstanceOf[Options]
  }
}

