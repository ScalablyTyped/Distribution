package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKeysListResponse extends js.Object {
  /** Dynamic targeting key collection. */
  var dynamicTargetingKeys: js.UndefOr[js.Array[DynamicTargetingKey]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#dynamicTargetingKeysListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object DynamicTargetingKeysListResponse {
  @scala.inline
  def apply(dynamicTargetingKeys: js.Array[DynamicTargetingKey] = null, kind: String = null): DynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    if (dynamicTargetingKeys != null) __obj.updateDynamic("dynamicTargetingKeys")(dynamicTargetingKeys)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DynamicTargetingKeysListResponse]
  }
}

