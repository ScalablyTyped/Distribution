package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upload extends js.Object {
  /** Account Id to which this upload belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Custom data source Id to which this data import belongs. */
  var customDataSourceId: js.UndefOr[java.lang.String] = js.undefined
  /** Data import errors collection. */
  var errors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A unique ID for this upload. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics upload. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Upload status. Possible values: PENDING, COMPLETED, FAILED, DELETING, DELETED. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Time this file is uploaded. */
  var uploadTime: js.UndefOr[java.lang.String] = js.undefined
}

object Upload {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    customDataSourceId: java.lang.String = null,
    errors: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    status: java.lang.String = null,
    uploadTime: java.lang.String = null
  ): Upload = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (customDataSourceId != null) __obj.updateDynamic("customDataSourceId")(customDataSourceId)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (status != null) __obj.updateDynamic("status")(status)
    if (uploadTime != null) __obj.updateDynamic("uploadTime")(uploadTime)
    __obj.asInstanceOf[Upload]
  }
}

