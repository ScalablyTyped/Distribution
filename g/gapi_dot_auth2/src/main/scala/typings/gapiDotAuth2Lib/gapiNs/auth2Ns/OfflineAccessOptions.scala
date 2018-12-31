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

