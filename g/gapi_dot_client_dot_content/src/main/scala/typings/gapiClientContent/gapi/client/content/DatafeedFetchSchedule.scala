package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedFetchSchedule extends js.Object {
  /** The day of the month the feed file should be fetched (1-31). */
  var dayOfMonth: js.UndefOr[Double] = js.undefined
  /**
    * The URL where the feed file can be fetched. Google Merchant Center will support automatic scheduled uploads using the HTTP, HTTPS, FTP, or SFTP
    * protocols, so the value will need to be a valid link using one of those four protocols.
    */
  var fetchUrl: js.UndefOr[String] = js.undefined
  /** The hour of the day the feed file should be fetched (0-23). */
  var hour: js.UndefOr[Double] = js.undefined
  /** The minute of the hour the feed file should be fetched (0-59). Read-only. */
  var minuteOfHour: js.UndefOr[Double] = js.undefined
  /** An optional password for fetch_url. */
  var password: js.UndefOr[String] = js.undefined
  /** Whether the scheduled fetch is paused or not. */
  var paused: js.UndefOr[Boolean] = js.undefined
  /** Time zone used for schedule. UTC by default. E.g., "America/Los_Angeles". */
  var timeZone: js.UndefOr[String] = js.undefined
  /** An optional user name for fetch_url. */
  var username: js.UndefOr[String] = js.undefined
  /** The day of the week the feed file should be fetched. */
  var weekday: js.UndefOr[String] = js.undefined
}

object DatafeedFetchSchedule {
  @scala.inline
  def apply(
    dayOfMonth: js.UndefOr[Double] = js.undefined,
    fetchUrl: String = null,
    hour: js.UndefOr[Double] = js.undefined,
    minuteOfHour: js.UndefOr[Double] = js.undefined,
    password: String = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    timeZone: String = null,
    username: String = null,
    weekday: String = null
  ): DatafeedFetchSchedule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dayOfMonth)) __obj.updateDynamic("dayOfMonth")(dayOfMonth.get.asInstanceOf[js.Any])
    if (fetchUrl != null) __obj.updateDynamic("fetchUrl")(fetchUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteOfHour)) __obj.updateDynamic("minuteOfHour")(minuteOfHour.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.get.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedFetchSchedule]
  }
}

