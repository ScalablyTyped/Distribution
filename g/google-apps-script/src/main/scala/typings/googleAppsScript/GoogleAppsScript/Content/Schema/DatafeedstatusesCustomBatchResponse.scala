package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[DatafeedstatusesCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object DatafeedstatusesCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[DatafeedstatusesCustomBatchResponseEntry] = null, kind: String = null): DatafeedstatusesCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedstatusesCustomBatchResponse]
  }
}

