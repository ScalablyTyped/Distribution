package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdBlockingConfiguration extends js.Object {
  var clickThroughUrl: js.UndefOr[java.lang.String] = js.undefined
  var creativeBundleId: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var overrideClickThroughUrl: js.UndefOr[scala.Boolean] = js.undefined
}

object AdBlockingConfiguration {
  @scala.inline
  def apply(
    clickThroughUrl: java.lang.String = null,
    creativeBundleId: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    overrideClickThroughUrl: js.UndefOr[scala.Boolean] = js.undefined
  ): AdBlockingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl)
    if (creativeBundleId != null) __obj.updateDynamic("creativeBundleId")(creativeBundleId)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(overrideClickThroughUrl)) __obj.updateDynamic("overrideClickThroughUrl")(overrideClickThroughUrl)
    __obj.asInstanceOf[AdBlockingConfiguration]
  }
}

