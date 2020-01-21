package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[AccountsCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object AccountsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[AccountsCustomBatchResponseEntry] = null, kind: String = null): AccountsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsCustomBatchResponse]
  }
}

