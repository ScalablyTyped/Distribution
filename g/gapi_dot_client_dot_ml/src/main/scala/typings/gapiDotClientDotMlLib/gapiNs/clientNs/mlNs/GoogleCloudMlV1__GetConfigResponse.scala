package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__GetConfigResponse extends js.Object {
  /** The service account Cloud ML uses to access resources in the project. */
  var serviceAccount: js.UndefOr[java.lang.String] = js.undefined
  /** The project number for `service_account`. */
  var serviceAccountProject: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleCloudMlV1__GetConfigResponse {
  @scala.inline
  def apply(serviceAccount: java.lang.String = null, serviceAccountProject: java.lang.String = null): GoogleCloudMlV1__GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount)
    if (serviceAccountProject != null) __obj.updateDynamic("serviceAccountProject")(serviceAccountProject)
    __obj.asInstanceOf[GoogleCloudMlV1__GetConfigResponse]
  }
}

