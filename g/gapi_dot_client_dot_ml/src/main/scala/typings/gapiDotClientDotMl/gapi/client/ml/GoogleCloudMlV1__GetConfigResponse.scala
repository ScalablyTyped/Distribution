package typings.gapiDotClientDotMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__GetConfigResponse extends js.Object {
  /** The service account Cloud ML uses to access resources in the project. */
  var serviceAccount: js.UndefOr[String] = js.undefined
  /** The project number for `service_account`. */
  var serviceAccountProject: js.UndefOr[String] = js.undefined
}

object GoogleCloudMlV1__GetConfigResponse {
  @scala.inline
  def apply(serviceAccount: String = null, serviceAccountProject: String = null): GoogleCloudMlV1__GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    if (serviceAccountProject != null) __obj.updateDynamic("serviceAccountProject")(serviceAccountProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1__GetConfigResponse]
  }
}

