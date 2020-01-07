package typings.googleapis.buildSrcApisServiceusageV1Mod.serviceusage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListServices` method.
  */
@js.native
trait Schema$ListServicesResponse extends js.Object {
  /**
    * Token that can be passed to `ListServices` to resume a paginated query.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The available services for the requested project.
    */
  var services: js.UndefOr[js.Array[Schema$GoogleApiServiceusageV1Service]] = js.native
}

object Schema$ListServicesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, services: js.Array[Schema$GoogleApiServiceusageV1Service] = null): Schema$ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListServicesResponse]
  }
}

