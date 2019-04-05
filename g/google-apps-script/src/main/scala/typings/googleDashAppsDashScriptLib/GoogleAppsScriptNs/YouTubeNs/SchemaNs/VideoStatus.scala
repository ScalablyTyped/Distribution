package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoStatus extends js.Object {
  var embeddable: js.UndefOr[scala.Boolean] = js.undefined
  var failureReason: js.UndefOr[java.lang.String] = js.undefined
  var license: js.UndefOr[java.lang.String] = js.undefined
  var privacyStatus: js.UndefOr[java.lang.String] = js.undefined
  var publicStatsViewable: js.UndefOr[scala.Boolean] = js.undefined
  var publishAt: js.UndefOr[java.lang.String] = js.undefined
  var rejectionReason: js.UndefOr[java.lang.String] = js.undefined
  var uploadStatus: js.UndefOr[java.lang.String] = js.undefined
}

object VideoStatus {
  @scala.inline
  def apply(
    embeddable: js.UndefOr[scala.Boolean] = js.undefined,
    failureReason: java.lang.String = null,
    license: java.lang.String = null,
    privacyStatus: java.lang.String = null,
    publicStatsViewable: js.UndefOr[scala.Boolean] = js.undefined,
    publishAt: java.lang.String = null,
    rejectionReason: java.lang.String = null,
    uploadStatus: java.lang.String = null
  ): VideoStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(embeddable)) __obj.updateDynamic("embeddable")(embeddable)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (license != null) __obj.updateDynamic("license")(license)
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus)
    if (!js.isUndefined(publicStatsViewable)) __obj.updateDynamic("publicStatsViewable")(publicStatsViewable)
    if (publishAt != null) __obj.updateDynamic("publishAt")(publishAt)
    if (rejectionReason != null) __obj.updateDynamic("rejectionReason")(rejectionReason)
    if (uploadStatus != null) __obj.updateDynamic("uploadStatus")(uploadStatus)
    __obj.asInstanceOf[VideoStatus]
  }
}

