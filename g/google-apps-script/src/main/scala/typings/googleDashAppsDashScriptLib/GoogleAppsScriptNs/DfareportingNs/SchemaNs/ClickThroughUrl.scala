package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickThroughUrl extends js.Object {
  var computedClickThroughUrl: js.UndefOr[java.lang.String] = js.undefined
  var customClickThroughUrl: js.UndefOr[java.lang.String] = js.undefined
  var defaultLandingPage: js.UndefOr[scala.Boolean] = js.undefined
  var landingPageId: js.UndefOr[java.lang.String] = js.undefined
}

object ClickThroughUrl {
  @scala.inline
  def apply(
    computedClickThroughUrl: java.lang.String = null,
    customClickThroughUrl: java.lang.String = null,
    defaultLandingPage: js.UndefOr[scala.Boolean] = js.undefined,
    landingPageId: java.lang.String = null
  ): ClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    if (computedClickThroughUrl != null) __obj.updateDynamic("computedClickThroughUrl")(computedClickThroughUrl)
    if (customClickThroughUrl != null) __obj.updateDynamic("customClickThroughUrl")(customClickThroughUrl)
    if (!js.isUndefined(defaultLandingPage)) __obj.updateDynamic("defaultLandingPage")(defaultLandingPage)
    if (landingPageId != null) __obj.updateDynamic("landingPageId")(landingPageId)
    __obj.asInstanceOf[ClickThroughUrl]
  }
}

