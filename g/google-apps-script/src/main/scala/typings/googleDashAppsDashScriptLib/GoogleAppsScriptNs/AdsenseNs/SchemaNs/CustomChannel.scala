package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomChannel extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var targetingInfo: js.UndefOr[CustomChannelTargetingInfo] = js.undefined
}

object CustomChannel {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    targetingInfo: CustomChannelTargetingInfo = null
  ): CustomChannel = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (targetingInfo != null) __obj.updateDynamic("targetingInfo")(targetingInfo)
    __obj.asInstanceOf[CustomChannel]
  }
}

