package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The protocol for the ListUptimeCheckIps response.
  */
@js.native
trait Schema$ListUptimeCheckIpsResponse extends js.Object {
  /**
    * This field represents the pagination token to retrieve the next page of
    * results. If the value is empty, it means no further results for the
    * request. To retrieve the next page of results, the value of the
    * next_page_token is passed to the subsequent List method call (in the
    * request message&#39;s page_token field). NOTE: this field is not yet
    * implemented
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The returned list of IP addresses (including region and location) that
    * the checkers run from.
    */
  var uptimeCheckIps: js.UndefOr[js.Array[Schema$UptimeCheckIp]] = js.native
}

object Schema$ListUptimeCheckIpsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, uptimeCheckIps: js.Array[Schema$UptimeCheckIp] = null): Schema$ListUptimeCheckIpsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (uptimeCheckIps != null) __obj.updateDynamic("uptimeCheckIps")(uptimeCheckIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListUptimeCheckIpsResponse]
  }
}

