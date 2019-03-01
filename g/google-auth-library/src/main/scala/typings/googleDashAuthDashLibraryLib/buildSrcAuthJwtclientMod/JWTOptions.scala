package typings
package googleDashAuthDashLibraryLib.buildSrcAuthJwtclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTOptions
  extends googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions {
  var additionalClaims: js.UndefOr[js.Object] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var keyFile: js.UndefOr[java.lang.String] = js.undefined
  var keyId: js.UndefOr[java.lang.String] = js.undefined
  var scopes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

object JWTOptions {
  @scala.inline
  def apply(
    additionalClaims: js.Object = null,
    eagerRefreshThresholdMillis: scala.Int | scala.Double = null,
    email: java.lang.String = null,
    key: java.lang.String = null,
    keyFile: java.lang.String = null,
    keyId: java.lang.String = null,
    scopes: java.lang.String | js.Array[java.lang.String] = null,
    subject: java.lang.String = null
  ): JWTOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalClaims != null) __obj.updateDynamic("additionalClaims")(additionalClaims)
    if (eagerRefreshThresholdMillis != null) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email)
    if (key != null) __obj.updateDynamic("key")(key)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (keyId != null) __obj.updateDynamic("keyId")(keyId)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[JWTOptions]
  }
}

