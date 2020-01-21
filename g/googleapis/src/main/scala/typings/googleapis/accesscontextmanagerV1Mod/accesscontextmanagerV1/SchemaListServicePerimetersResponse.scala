package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to `ListServicePerimetersRequest`.
  */
@js.native
trait SchemaListServicePerimetersResponse extends js.Object {
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of the Service Perimeter instances.
    */
  var servicePerimeters: js.UndefOr[js.Array[SchemaServicePerimeter]] = js.native
}

object SchemaListServicePerimetersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, servicePerimeters: js.Array[SchemaServicePerimeter] = null): SchemaListServicePerimetersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (servicePerimeters != null) __obj.updateDynamic("servicePerimeters")(servicePerimeters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListServicePerimetersResponse]
  }
}

