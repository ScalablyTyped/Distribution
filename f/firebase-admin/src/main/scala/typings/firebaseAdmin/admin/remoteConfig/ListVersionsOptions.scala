package typings.firebaseAdmin.admin.remoteConfig

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVersionsOptions extends js.Object {
  /**
    * Specifies the latest update time to include in the results. Any entries updated on or after
    * this time are omitted.
    */
  var endTime: js.UndefOr[Date | String] = js.undefined
  /** 
    * Specifies the newest version number to include in the results.
    * If specified, must be greater than zero. Defaults to the newest version.
    */
  var endVersionNumber: js.UndefOr[String | Double] = js.undefined
  /**
    * The maximum number of items to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * The `nextPageToken` value returned from a previous list versions request, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * Specifies the earliest update time to include in the results. Any entries updated before this
    * time are omitted.
    */
  var startTime: js.UndefOr[Date | String] = js.undefined
}

object ListVersionsOptions {
  @scala.inline
  def apply(
    endTime: Date | String = null,
    endVersionNumber: String | Double = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    startTime: Date | String = null
  ): ListVersionsOptions = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (endVersionNumber != null) __obj.updateDynamic("endVersionNumber")(endVersionNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVersionsOptions]
  }
}

