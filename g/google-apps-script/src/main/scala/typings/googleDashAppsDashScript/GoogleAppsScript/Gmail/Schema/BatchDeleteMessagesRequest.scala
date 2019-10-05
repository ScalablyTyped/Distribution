package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteMessagesRequest extends js.Object {
  var ids: js.UndefOr[js.Array[String]] = js.undefined
}

object BatchDeleteMessagesRequest {
  @scala.inline
  def apply(ids: js.Array[String] = null): BatchDeleteMessagesRequest = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids)
    __obj.asInstanceOf[BatchDeleteMessagesRequest]
  }
}

