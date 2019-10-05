package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiasettingsRequestInventoryVerificationResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
}

object LiasettingsRequestInventoryVerificationResponse {
  @scala.inline
  def apply(kind: String = null): LiasettingsRequestInventoryVerificationResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[LiasettingsRequestInventoryVerificationResponse]
  }
}

