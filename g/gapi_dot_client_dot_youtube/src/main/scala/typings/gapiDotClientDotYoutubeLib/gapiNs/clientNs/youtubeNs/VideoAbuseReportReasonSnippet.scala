package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReportReasonSnippet extends js.Object {
  /** The localized label belonging to this abuse report reason. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** The secondary reasons associated with this reason, if any are available. (There might be 0 or more.) */
  var secondaryReasons: js.UndefOr[js.Array[VideoAbuseReportSecondaryReason]] = js.undefined
}

object VideoAbuseReportReasonSnippet {
  @scala.inline
  def apply(label: java.lang.String = null, secondaryReasons: js.Array[VideoAbuseReportSecondaryReason] = null): VideoAbuseReportReasonSnippet = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (secondaryReasons != null) __obj.updateDynamic("secondaryReasons")(secondaryReasons)
    __obj.asInstanceOf[VideoAbuseReportReasonSnippet]
  }
}

