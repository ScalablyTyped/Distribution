package typings.googleDashAuthDashLibrary.buildSrcAuthComputeclientMod

import typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeOptions extends RefreshOptions {
  /**
    * The scopes that will be requested when acquiring service account
    * credentials. Only applicable to modern App Engine and Cloud Function
    * runtimes as of March 2019.
    */
  var scopes: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The service account email to use, or 'default'. A Compute Engine instance
    * may have multiple service accounts.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
}

object ComputeOptions {
  @scala.inline
  def apply(
    eagerRefreshThresholdMillis: Int | Double = null,
    scopes: String | js.Array[String] = null,
    serviceAccountEmail: String = null
  ): ComputeOptions = {
    val __obj = js.Dynamic.literal()
    if (eagerRefreshThresholdMillis != null) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeOptions]
  }
}

