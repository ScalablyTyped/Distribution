package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definitions by: John <https://github.com/jhcao23>
  * Interface that represents the different configuration parameters for the GoogleAuth.grantOfflineAccess(options) method.
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2offlineaccessoptions
  */
trait OfflineAccessOptions extends js.Object {
  var app_package_name: js.UndefOr[java.lang.String] = js.undefined
  var prompt: js.UndefOr[
    gapiDotAuth2Lib.gapiDotAuth2LibStrings.select_account | gapiDotAuth2Lib.gapiDotAuth2LibStrings.consent
  ] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object OfflineAccessOptions {
  @scala.inline
  def apply(
    app_package_name: java.lang.String = null,
    prompt: gapiDotAuth2Lib.gapiDotAuth2LibStrings.select_account | gapiDotAuth2Lib.gapiDotAuth2LibStrings.consent = null,
    scope: java.lang.String = null
  ): OfflineAccessOptions = {
    val __obj = js.Dynamic.literal()
    if (app_package_name != null) __obj.updateDynamic("app_package_name")(app_package_name)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[OfflineAccessOptions]
  }
}

