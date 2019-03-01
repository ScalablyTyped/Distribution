package typings
package googleDashAuthDashLibraryLib.buildSrcAuthComputeclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeOptions
  extends googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.RefreshOptions {
  /**
    * The service account email to use, or 'default'. A Compute Engine instance
    * may have multiple service accounts.
    */
  var serviceAccountEmail: js.UndefOr[java.lang.String] = js.undefined
}

object ComputeOptions {
  @scala.inline
  def apply(
    eagerRefreshThresholdMillis: scala.Int | scala.Double = null,
    serviceAccountEmail: java.lang.String = null
  ): ComputeOptions = {
    val __obj = js.Dynamic.literal()
    if (eagerRefreshThresholdMillis != null) __obj.updateDynamic("eagerRefreshThresholdMillis")(eagerRefreshThresholdMillis.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail)
    __obj.asInstanceOf[ComputeOptions]
  }
}

