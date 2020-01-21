package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Services.ListServices.
  */
@js.native
trait SchemaListServicesResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The services belonging to the requested application.
    */
  var services: js.UndefOr[js.Array[SchemaService]] = js.native
}

object SchemaListServicesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, services: js.Array[SchemaService] = null): SchemaListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListServicesResponse]
  }
}

