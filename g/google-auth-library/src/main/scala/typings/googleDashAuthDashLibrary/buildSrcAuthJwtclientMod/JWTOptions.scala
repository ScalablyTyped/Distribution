package typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod

import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTOptions extends RefreshOptions {
  var additionalClaims: js.UndefOr[js.Object] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var keyFile: js.UndefOr[String] = js.undefined
  var keyId: js.UndefOr[String] = js.undefined
  var scopes: js.UndefOr[String | js.Array[String]] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
}

object JWTOptions {
  @scala.inline
  def apply(
    additionalClaims: js.Object = null,
    eagerRefreshThresholdMillis: Int | Double = null,
    email: String = null,
    key: String = null,
    keyFile: String = null,
    keyId: String = null,
    scopes: String | js.Array[String] = null,
    subject: String = null
  ): JWTOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalClaims != null) __obj.updateDynamic("additionalClaims")(additionalClaims.asInstanceOf[js.Any])
    if (eagerRefreshThresholdMillis != null) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTOptions]
  }
}

