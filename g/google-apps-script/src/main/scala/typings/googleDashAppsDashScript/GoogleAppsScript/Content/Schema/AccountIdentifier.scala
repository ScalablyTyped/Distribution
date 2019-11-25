package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountIdentifier extends js.Object {
  var aggregatorId: js.UndefOr[String] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
}

object AccountIdentifier {
  @scala.inline
  def apply(aggregatorId: String = null, merchantId: String = null): AccountIdentifier = {
    val __obj = js.Dynamic.literal()
    if (aggregatorId != null) __obj.updateDynamic("aggregatorId")(aggregatorId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountIdentifier]
  }
}

