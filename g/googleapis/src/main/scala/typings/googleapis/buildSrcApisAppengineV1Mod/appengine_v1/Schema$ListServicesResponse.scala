package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Services.ListServices.
  */
@js.native
trait Schema$ListServicesResponse extends js.Object {
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The services belonging to the requested application.
    */
  var services: js.UndefOr[js.Array[Schema$Service]] = js.native
}

object Schema$ListServicesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, services: js.Array[Schema$Service] = null): Schema$ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListServicesResponse]
  }
}

