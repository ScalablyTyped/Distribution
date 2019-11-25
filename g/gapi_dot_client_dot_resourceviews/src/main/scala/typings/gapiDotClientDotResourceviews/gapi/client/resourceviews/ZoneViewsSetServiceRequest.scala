package typings.gapiDotClientDotResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsSetServiceRequest extends js.Object {
  /** The service information to be updated. */
  var endpoints: js.UndefOr[js.Array[ServiceEndpoint]] = js.undefined
  /** Fingerprint of the service information; a hash of the contents. This field is used for optimistic locking when updating the service entries. */
  var fingerprint: js.UndefOr[String] = js.undefined
  /** The name of the resource if user wants to update the service information of the resource. */
  var resourceName: js.UndefOr[String] = js.undefined
}

object ZoneViewsSetServiceRequest {
  @scala.inline
  def apply(
    endpoints: js.Array[ServiceEndpoint] = null,
    fingerprint: String = null,
    resourceName: String = null
  ): ZoneViewsSetServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneViewsSetServiceRequest]
  }
}

