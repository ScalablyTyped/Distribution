package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for ListInstanceConfigs.
  */
@js.native
trait Schema$ListInstanceConfigsResponse extends js.Object {
  /**
    * The list of requested instance configurations.
    */
  var instanceConfigs: js.UndefOr[js.Array[Schema$InstanceConfig]] = js.native
  /**
    * `next_page_token` can be sent in a subsequent ListInstanceConfigs call to
    * fetch more of the matching instance configurations.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListInstanceConfigsResponse {
  @scala.inline
  def apply(instanceConfigs: js.Array[Schema$InstanceConfig] = null, nextPageToken: String = null): Schema$ListInstanceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (instanceConfigs != null) __obj.updateDynamic("instanceConfigs")(instanceConfigs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListInstanceConfigsResponse]
  }
}

