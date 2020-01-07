package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PretargetingConfigList extends js.Object {
  /**
    * A list of pretargeting configs
    */
  var items: js.UndefOr[js.Array[Schema$PretargetingConfig]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$PretargetingConfigList {
  @scala.inline
  def apply(items: js.Array[Schema$PretargetingConfig] = null, kind: String = null): Schema$PretargetingConfigList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PretargetingConfigList]
  }
}

