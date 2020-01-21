package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionInstanceGroupManagersListInstanceConfigsResp extends js.Object {
  /**
    * [Output Only] The list of PerInstanceConfig.
    */
  var items: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.native
  /**
    * [Output Only] This token allows you to get the next page of results for
    * list requests. If the number of results is larger than maxResults, use
    * the nextPageToken as a value for the query parameter pageToken in the
    * next list request. Subsequent list requests will have their own
    * nextPageToken to continue paging through the results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * [Output Only] Informational warning message.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaRegionInstanceGroupManagersListInstanceConfigsResp {
  @scala.inline
  def apply(
    items: js.Array[SchemaPerInstanceConfig] = null,
    nextPageToken: String = null,
    warning: AnonCode = null
  ): SchemaRegionInstanceGroupManagersListInstanceConfigsResp = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersListInstanceConfigsResp]
  }
}

