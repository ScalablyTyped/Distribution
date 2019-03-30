package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountIdentifier extends js.Object {
  var aggregatorId: js.UndefOr[java.lang.String] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
}

object AccountIdentifier {
  @scala.inline
  def apply(aggregatorId: java.lang.String = null, merchantId: java.lang.String = null): AccountIdentifier = {
    val __obj = js.Dynamic.literal()
    if (aggregatorId != null) __obj.updateDynamic("aggregatorId")(aggregatorId)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    __obj.asInstanceOf[AccountIdentifier]
  }
}

