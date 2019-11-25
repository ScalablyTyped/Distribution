package typings.gapiDotClientDotServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishedService extends js.Object {
  /**
    * The resource name of the service.
    *
    * A valid name would be:
    * - services/serviceuser.googleapis.com
    */
  var name: js.UndefOr[String] = js.undefined
  /** The service's published configuration. */
  var service: js.UndefOr[Service] = js.undefined
}

object PublishedService {
  @scala.inline
  def apply(name: String = null, service: Service = null): PublishedService = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishedService]
  }
}

