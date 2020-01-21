package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upload extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var customDataSourceId: js.UndefOr[String] = js.undefined
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
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

