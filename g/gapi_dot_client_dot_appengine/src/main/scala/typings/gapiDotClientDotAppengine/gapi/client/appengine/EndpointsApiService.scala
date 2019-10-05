package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointsApiService extends js.Object {
  /** Endpoints service configuration id as specified by the Service Management API. For example "2016-09-19r1" */
  var configId: js.UndefOr[String] = js.undefined
  /** Endpoints service name which is the name of the "service" resource in the Service Management API. For example "myapi.endpoints.myproject.cloud.goog" */
  var name: js.UndefOr[String] = js.undefined
}

object EndpointsApiService {
  @scala.inline
  def apply(configId: String = null, name: String = null): EndpointsApiService = {
    val __obj = js.Dynamic.literal()
    if (configId != null) __obj.updateDynamic("configId")(configId)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EndpointsApiService]
  }
}

