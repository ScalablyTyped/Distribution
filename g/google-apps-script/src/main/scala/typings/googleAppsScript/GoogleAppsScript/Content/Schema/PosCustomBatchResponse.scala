package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[PosCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object PosCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[PosCustomBatchResponseEntry] = null, kind: String = null): PosCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosCustomBatchResponse]
  }
}

