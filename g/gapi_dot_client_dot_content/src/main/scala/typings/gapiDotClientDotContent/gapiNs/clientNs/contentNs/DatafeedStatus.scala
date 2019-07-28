package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedStatus extends js.Object {
  /** The country for which the status is reported, represented as a  CLDR territory code. */
  var country: js.UndefOr[String] = js.undefined
  /** The ID of the feed for which the status is reported. */
  var datafeedId: js.UndefOr[String] = js.undefined
  /** The list of errors occurring in the feed. */
  var errors: js.UndefOr[js.Array[DatafeedStatusError]] = js.undefined
  /** The number of items in the feed that were processed. */
  var itemsTotal: js.UndefOr[String] = js.undefined
  /** The number of items in the feed that were valid. */
  var itemsValid: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeedStatus". */
  var kind: js.UndefOr[String] = js.undefined
  /** The two-letter ISO 639-1 language for which the status is reported. */
  var language: js.UndefOr[String] = js.undefined
  /** The last date at which the feed was uploaded. */
  var lastUploadDate: js.UndefOr[String] = js.undefined
  /** The processing status of the feed. */
  var processingStatus: js.UndefOr[String] = js.undefined
  /** The list of errors occurring in the feed. */
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
    if (country != null) __obj.updateDynamic("country")(country)
    if (datafeedId != null) __obj.updateDynamic("datafeedId")(datafeedId)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (itemsTotal != null) __obj.updateDynamic("itemsTotal")(itemsTotal)
    if (itemsValid != null) __obj.updateDynamic("itemsValid")(itemsValid)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (language != null) __obj.updateDynamic("language")(language)
    if (lastUploadDate != null) __obj.updateDynamic("lastUploadDate")(lastUploadDate)
    if (processingStatus != null) __obj.updateDynamic("processingStatus")(processingStatus)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[DatafeedStatus]
  }
}

