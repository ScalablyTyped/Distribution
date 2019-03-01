package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The service's published configuration. */
  var service: js.UndefOr[Service] = js.undefined
}

object PublishedService {
  @scala.inline
  def apply(name: java.lang.String = null, service: Service = null): PublishedService = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[PublishedService]
  }
}

