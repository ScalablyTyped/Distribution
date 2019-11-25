package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedStatus extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var datafeedId: js.UndefOr[String] = js.undefined
  var errors: js.UndefOr[js.Array[DatafeedStatusError]] = js.undefined
  var itemsTotal: js.UndefOr[String] = js.undefined
  var itemsValid: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var lastUploadDate: js.UndefOr[String] = js.undefined
  var processingStatus: js.UndefOr[String] = js.undefined
  var warnings: js.UndefOr[js.Array[DatafeedStatusError]] = js.undefined
}

object DatafeedStatus {
  @scala.inline
  def apply(
    country: String = null,
    datafeedId: String = null,
    errors: js.Array[DatafeedStatusError] = null,
    itemsTotal: String = null,
    itemsValid: String = null,
    kind: String = null,
    language: String = null,
    lastUploadDate: String = null,
    processingStatus: String = null,
    warnings: js.Array[DatafeedStatusError] = null
  ): DatafeedStatus = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (datafeedId != null) __obj.updateDynamic("datafeedId")(datafeedId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (itemsTotal != null) __obj.updateDynamic("itemsTotal")(itemsTotal.asInstanceOf[js.Any])
    if (itemsValid != null) __obj.updateDynamic("itemsValid")(itemsValid.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastUploadDate != null) __obj.updateDynamic("lastUploadDate")(lastUploadDate.asInstanceOf[js.Any])
    if (processingStatus != null) __obj.updateDynamic("processingStatus")(processingStatus.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedStatus]
  }
}

