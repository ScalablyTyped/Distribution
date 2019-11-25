package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiasettingsSetInventoryVerificationContactResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
}

object LiasettingsSetInventoryVerificationContactResponse {
  @scala.inline
  def apply(kind: String = null): LiasettingsSetInventoryVerificationContactResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiasettingsSetInventoryVerificationContactResponse]
  }
}

