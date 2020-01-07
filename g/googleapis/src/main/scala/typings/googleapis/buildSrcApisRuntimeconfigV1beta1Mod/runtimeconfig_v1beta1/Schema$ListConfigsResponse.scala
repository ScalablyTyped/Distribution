package typings.googleapis.buildSrcApisRuntimeconfigV1beta1Mod.runtimeconfig_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `ListConfigs()` returns the following response. The order of returned
  * objects is arbitrary; that is, it is not ordered in any particular way.
  */
@js.native
trait Schema$ListConfigsResponse extends js.Object {
  /**
    * A list of the configurations in the project. The order of returned
    * objects is arbitrary; that is, it is not ordered in any particular way.
    */
  var configs: js.UndefOr[js.Array[Schema$RuntimeConfig]] = js.native
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListConfigsResponse {
  @scala.inline
  def apply(configs: js.Array[Schema$RuntimeConfig] = null, nextPageToken: String = null): Schema$ListConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (configs != null) __obj.updateDynamic("configs")(configs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListConfigsResponse]
  }
}

