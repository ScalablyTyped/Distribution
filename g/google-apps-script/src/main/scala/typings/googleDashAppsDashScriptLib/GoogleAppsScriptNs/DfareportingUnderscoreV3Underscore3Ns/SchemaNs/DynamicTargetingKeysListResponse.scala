package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKeysListResponse extends js.Object {
  var dynamicTargetingKeys: js.UndefOr[js.Array[DynamicTargetingKey]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object DynamicTargetingKeysListResponse {
  @scala.inline
  def apply(dynamicTargetingKeys: js.Array[DynamicTargetingKey] = null, kind: java.lang.String = null): DynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    if (dynamicTargetingKeys != null) __obj.updateDynamic("dynamicTargetingKeys")(dynamicTargetingKeys)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DynamicTargetingKeysListResponse]
  }
}

