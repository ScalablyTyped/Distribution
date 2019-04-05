package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickThroughUrlSuffixProperties extends js.Object {
  var clickThroughUrlSuffix: js.UndefOr[java.lang.String] = js.undefined
  var overrideInheritedSuffix: js.UndefOr[scala.Boolean] = js.undefined
}

object ClickThroughUrlSuffixProperties {
  @scala.inline
  def apply(
    clickThroughUrlSuffix: java.lang.String = null,
    overrideInheritedSuffix: js.UndefOr[scala.Boolean] = js.undefined
  ): ClickThroughUrlSuffixProperties = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrlSuffix != null) __obj.updateDynamic("clickThroughUrlSuffix")(clickThroughUrlSuffix)
    if (!js.isUndefined(overrideInheritedSuffix)) __obj.updateDynamic("overrideInheritedSuffix")(overrideInheritedSuffix)
    __obj.asInstanceOf[ClickThroughUrlSuffixProperties]
  }
}

