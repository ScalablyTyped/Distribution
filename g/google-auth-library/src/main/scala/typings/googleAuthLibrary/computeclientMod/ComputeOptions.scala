package typings.googleAuthLibrary.computeclientMod

import typings.googleAuthLibrary.oauth2clientMod.RefreshOptions
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
    eagerRefreshThresholdMillis: js.UndefOr[Double] = js.undefined,
    forceRefreshOnFailure: js.UndefOr[Boolean] = js.undefined,
    scopes: String | js.Array[String] = null,
    serviceAccountEmail: String = null
  ): ComputeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(eagerRefreshThresholdMillis)) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRefreshOnFailure)) __obj.updateDynamic("forceRefreshOnFailure")(forceRefreshOnFailure.get.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeOptions]
  }
}

