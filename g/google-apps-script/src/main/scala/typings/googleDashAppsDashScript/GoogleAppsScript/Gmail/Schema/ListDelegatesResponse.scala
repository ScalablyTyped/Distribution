package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDelegatesResponse extends js.Object {
  var delegates: js.UndefOr[js.Array[Delegate]] = js.undefined
}

object ListDelegatesResponse {
  @scala.inline
  def apply(delegates: js.Array[Delegate] = null): ListDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    if (delegates != null) __obj.updateDynamic("delegates")(delegates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDelegatesResponse]
  }
}

