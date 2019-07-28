package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickThroughUrl extends js.Object {
  var computedClickThroughUrl: js.UndefOr[String] = js.undefined
  var customClickThroughUrl: js.UndefOr[String] = js.undefined
  var defaultLandingPage: js.UndefOr[Boolean] = js.undefined
  var landingPageId: js.UndefOr[String] = js.undefined
}

object ClickThroughUrl {
  @scala.inline
  def apply(
    computedClickThroughUrl: String = null,
    customClickThroughUrl: String = null,
    defaultLandingPage: js.UndefOr[Boolean] = js.undefined,
    landingPageId: String = null
  ): ClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    if (computedClickThroughUrl != null) __obj.updateDynamic("computedClickThroughUrl")(computedClickThroughUrl)
    if (customClickThroughUrl != null) __obj.updateDynamic("customClickThroughUrl")(customClickThroughUrl)
    if (!js.isUndefined(defaultLandingPage)) __obj.updateDynamic("defaultLandingPage")(defaultLandingPage)
    if (landingPageId != null) __obj.updateDynamic("landingPageId")(landingPageId)
    __obj.asInstanceOf[ClickThroughUrl]
  }
}

