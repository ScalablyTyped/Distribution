package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKeysListResponse extends js.Object {
  var dynamicTargetingKeys: js.UndefOr[js.Array[DynamicTargetingKey]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object DynamicTargetingKeysListResponse {
  @scala.inline
  def apply(dynamicTargetingKeys: js.Array[DynamicTargetingKey] = null, kind: String = null): DynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    if (dynamicTargetingKeys != null) __obj.updateDynamic("dynamicTargetingKeys")(dynamicTargetingKeys.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicTargetingKeysListResponse]
  }
}

