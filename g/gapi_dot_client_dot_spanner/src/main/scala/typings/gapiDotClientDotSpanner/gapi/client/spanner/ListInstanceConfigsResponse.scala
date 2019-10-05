package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstanceConfigsResponse extends js.Object {
  /** The list of requested instance configurations. */
  var instanceConfigs: js.UndefOr[js.Array[InstanceConfig]] = js.undefined
  /**
    * `next_page_token` can be sent in a subsequent
    * ListInstanceConfigs call to
    * fetch more of the matching instance configurations.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListInstanceConfigsResponse {
  @scala.inline
  def apply(instanceConfigs: js.Array[InstanceConfig] = null, nextPageToken: String = null): ListInstanceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    if (instanceConfigs != null) __obj.updateDynamic("instanceConfigs")(instanceConfigs)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListInstanceConfigsResponse]
  }
}

