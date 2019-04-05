package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Upload extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var customDataSourceId: js.UndefOr[java.lang.String] = js.undefined
  var errors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
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

