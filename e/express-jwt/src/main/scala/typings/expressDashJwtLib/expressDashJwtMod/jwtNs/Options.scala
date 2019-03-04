package typings
package expressDashJwtLib.expressDashJwtMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* property */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var credentialsRequired: js.UndefOr[scala.Boolean] = js.undefined
  var getToken: js.UndefOr[GetTokenCallback] = js.undefined
  var isRevoked: js.UndefOr[IsRevokedCallback] = js.undefined
  var requestProperty: js.UndefOr[java.lang.String] = js.undefined
  var secret: secretType | SecretCallback | SecretCallbackLong
  var skip: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var userProperty: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    secret: secretType | SecretCallback | SecretCallbackLong,
    StringDictionary: /* property */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    credentialsRequired: js.UndefOr[scala.Boolean] = js.undefined,
    getToken: GetTokenCallback = null,
    isRevoked: IsRevokedCallback = null,
    requestProperty: java.lang.String = null,
    skip: js.Array[java.lang.String] = null,
    userProperty: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(credentialsRequired)) __obj.updateDynamic("credentialsRequired")(credentialsRequired)
    if (getToken != null) __obj.updateDynamic("getToken")(getToken)
    if (isRevoked != null) __obj.updateDynamic("isRevoked")(isRevoked)
    if (requestProperty != null) __obj.updateDynamic("requestProperty")(requestProperty)
    if (skip != null) __obj.updateDynamic("skip")(skip)
    if (userProperty != null) __obj.updateDynamic("userProperty")(userProperty)
    __obj.asInstanceOf[Options]
  }
}

