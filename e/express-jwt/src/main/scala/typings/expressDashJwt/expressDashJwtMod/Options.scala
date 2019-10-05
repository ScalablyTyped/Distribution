package typings.expressDashJwt.expressDashJwtMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.Request
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
    getToken: /* req */ Request => js.Any = null,
    isRevoked: (/* req */ Request, /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[Boolean], Unit]) => Unit = null,
    requestProperty: String = null,
    userProperty: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(credentialsRequired)) __obj.updateDynamic("credentialsRequired")(credentialsRequired)
    if (getToken != null) __obj.updateDynamic("getToken")(js.Any.fromFunction1(getToken))
    if (isRevoked != null) __obj.updateDynamic("isRevoked")(js.Any.fromFunction3(isRevoked))
    if (requestProperty != null) __obj.updateDynamic("requestProperty")(requestProperty)
    if (userProperty != null) __obj.updateDynamic("userProperty")(userProperty)
    __obj.asInstanceOf[Options]
  }
}

