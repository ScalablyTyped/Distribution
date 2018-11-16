package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatafeedFetchSchedule extends js.Object {
  /** The day of the month the feed file should be fetched (1-31). */
  var dayOfMonth: js.UndefOr[scala.Double] = js.undefined
  /**
               * The URL where the feed file can be fetched. Google Merchant Center will support automatic scheduled uploads using the HTTP, HTTPS, FTP, or SFTP
               * protocols, so the value will need to be a valid link using one of those four protocols.
               */
  var fetchUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The hour of the day the feed file should be fetched (0-23). */
  var hour: js.UndefOr[scala.Double] = js.undefined
  /** The minute of the hour the feed file should be fetched (0-59). Read-only. */
  var minuteOfHour: js.UndefOr[scala.Double] = js.undefined
  /** An optional password for fetch_url. */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the scheduled fetch is paused or not. */
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  /** Time zone used for schedule. UTC by default. E.g., "America/Los_Angeles". */
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  /** An optional user name for fetch_url. */
  var username: js.UndefOr[java.lang.String] = js.undefined
  /** The day of the week the feed file should be fetched. */
  var weekday: js.UndefOr[java.lang.String] = js.undefined
}

