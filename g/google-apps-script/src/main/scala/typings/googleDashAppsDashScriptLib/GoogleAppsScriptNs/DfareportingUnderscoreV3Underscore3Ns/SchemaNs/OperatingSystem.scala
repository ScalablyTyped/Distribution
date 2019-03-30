package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystem extends js.Object {
  var dartId: js.UndefOr[java.lang.String] = js.undefined
  var desktop: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var mobile: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object OperatingSystem {
  @scala.inline
  def apply(
    dartId: java.lang.String = null,
    desktop: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    mobile: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null
  ): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    if (dartId != null) __obj.updateDynamic("dartId")(dartId)
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OperatingSystem]
  }
}

