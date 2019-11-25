package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PretargetingConfigList extends js.Object {
  /** A list of pretargeting configs */
  var items: js.UndefOr[js.Array[PretargetingConfig]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object PretargetingConfigList {
  @scala.inline
  def apply(items: js.Array[PretargetingConfig] = null, kind: String = null): PretargetingConfigList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PretargetingConfigList]
  }
}

