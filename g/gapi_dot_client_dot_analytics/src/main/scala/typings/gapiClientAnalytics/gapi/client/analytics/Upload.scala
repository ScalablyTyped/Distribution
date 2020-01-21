package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upload extends js.Object {
  /** Account Id to which this upload belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Custom data source Id to which this data import belongs. */
  var customDataSourceId: js.UndefOr[String] = js.undefined
  /** Data import errors collection. */
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  /** A unique ID for this upload. */
  var id: js.UndefOr[String] = js.undefined
  /** Resource type for Analytics upload. */
  var kind: js.UndefOr[String] = js.undefined
  /** Upload status. Possible values: PENDING, COMPLETED, FAILED, DELETING, DELETED. */
  var status: js.UndefOr[String] = js.undefined
  /** Time this file is uploaded. */
  var uploadTime: js.UndefOr[String] = js.undefined
}

object Upload {
  @scala.inline
  def apply(
    accountId: String = null,
    customDataSourceId: String = null,
    errors: js.Array[String] = null,
    id: String = null,
    kind: String = null,
    status: String = null,
    uploadTime: String = null
  ): Upload = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (customDataSourceId != null) __obj.updateDynamic("customDataSourceId")(customDataSourceId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (uploadTime != null) __obj.updateDynamic("uploadTime")(uploadTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upload]
  }
}

