package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic Targeting Key List Response
  */
@js.native
trait Schema$DynamicTargetingKeysListResponse extends js.Object {
  /**
    * Dynamic targeting key collection.
    */
  var dynamicTargetingKeys: js.UndefOr[js.Array[Schema$DynamicTargetingKey]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#dynamicTargetingKeysListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$DynamicTargetingKeysListResponse {
  @scala.inline
  def apply(dynamicTargetingKeys: js.Array[Schema$DynamicTargetingKey] = null, kind: String = null): Schema$DynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    if (dynamicTargetingKeys != null) __obj.updateDynamic("dynamicTargetingKeys")(dynamicTargetingKeys.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DynamicTargetingKeysListResponse]
  }
}

