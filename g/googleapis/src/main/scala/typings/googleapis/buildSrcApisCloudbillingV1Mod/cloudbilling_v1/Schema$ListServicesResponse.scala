package typings.googleapis.buildSrcApisCloudbillingV1Mod.cloudbilling_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for `ListServices`.
  */
@js.native
trait Schema$ListServicesResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListServices` again with the `page_token` field set to this value.
    * This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of services.
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

