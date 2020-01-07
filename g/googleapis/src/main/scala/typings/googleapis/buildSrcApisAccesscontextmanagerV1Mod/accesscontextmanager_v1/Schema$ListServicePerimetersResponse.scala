package typings.googleapis.buildSrcApisAccesscontextmanagerV1Mod.accesscontextmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to `ListServicePerimetersRequest`.
  */
@js.native
trait Schema$ListServicePerimetersResponse extends js.Object {
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of the Service Perimeter instances.
    */
  var servicePerimeters: js.UndefOr[js.Array[Schema$ServicePerimeter]] = js.native
}

object Schema$ListServicePerimetersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, servicePerimeters: js.Array[Schema$ServicePerimeter] = null): Schema$ListServicePerimetersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (servicePerimeters != null) __obj.updateDynamic("servicePerimeters")(servicePerimeters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListServicePerimetersResponse]
  }
}

