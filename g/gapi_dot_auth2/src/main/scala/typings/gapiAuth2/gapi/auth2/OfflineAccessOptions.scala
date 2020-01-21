package typings.gapiAuth2.gapi.auth2

import typings.gapiAuth2.gapiAuth2Strings.consent
import typings.gapiAuth2.gapiAuth2Strings.select_account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definitions by: John <https://github.com/jhcao23>
  * Interface that represents the different configuration parameters for the GoogleAuth.grantOfflineAccess(options) method.
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2offlineaccessoptions
  */
trait OfflineAccessOptions extends js.Object {
  var app_package_name: js.UndefOr[String] = js.undefined
  var prompt: js.UndefOr[select_account | consent] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object OfflineAccessOptions {
  @scala.inline
  def apply(app_package_name: String = null, prompt: select_account | consent = null, scope: String = null): OfflineAccessOptions = {
    val __obj = js.Dynamic.literal()
    if (app_package_name != null) __obj.updateDynamic("app_package_name")(app_package_name.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAccessOptions]
  }
}

