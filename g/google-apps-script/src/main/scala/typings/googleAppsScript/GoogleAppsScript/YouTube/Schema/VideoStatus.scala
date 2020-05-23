package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoStatus extends js.Object {
  var embeddable: js.UndefOr[Boolean] = js.undefined
  var failureReason: js.UndefOr[String] = js.undefined
  var license: js.UndefOr[String] = js.undefined
  var privacyStatus: js.UndefOr[String] = js.undefined
  var publicStatsViewable: js.UndefOr[Boolean] = js.undefined
  var publishAt: js.UndefOr[String] = js.undefined
  var rejectionReason: js.UndefOr[String] = js.undefined
  var uploadStatus: js.UndefOr[String] = js.undefined
}

object VideoStatus {
  @scala.inline
  def apply(
    embeddable: js.UndefOr[Boolean] = js.undefined,
    failureReason: String = null,
    license: String = null,
    privacyStatus: String = null,
    publicStatsViewable: js.UndefOr[Boolean] = js.undefined,
    publishAt: String = null,
    rejectionReason: String = null,
    uploadStatus: String = null
  ): VideoStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(embeddable)) __obj.updateDynamic("embeddable")(embeddable.get.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(publicStatsViewable)) __obj.updateDynamic("publicStatsViewable")(publicStatsViewable.get.asInstanceOf[js.Any])
    if (publishAt != null) __obj.updateDynamic("publishAt")(publishAt.asInstanceOf[js.Any])
    if (rejectionReason != null) __obj.updateDynamic("rejectionReason")(rejectionReason.asInstanceOf[js.Any])
    if (uploadStatus != null) __obj.updateDynamic("uploadStatus")(uploadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStatus]
  }
}

