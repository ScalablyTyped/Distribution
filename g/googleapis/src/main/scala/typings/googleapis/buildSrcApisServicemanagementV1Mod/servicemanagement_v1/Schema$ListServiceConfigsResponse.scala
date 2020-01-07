package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListServiceConfigs method.
  */
@js.native
trait Schema$ListServiceConfigsResponse extends js.Object {
  /**
    * The token of the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of service configuration resources.
    */
  var serviceConfigs: js.UndefOr[js.Array[Schema$Service]] = js.native
}

object Schema$ListServiceConfigsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, serviceConfigs: js.Array[Schema$Service] = null): Schema$ListServiceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (serviceConfigs != null) __obj.updateDynamic("serviceConfigs")(serviceConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListServiceConfigsResponse]
  }
}

