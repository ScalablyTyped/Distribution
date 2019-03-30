package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeClickThroughUrl extends js.Object {
  var computedClickThroughUrl: js.UndefOr[java.lang.String] = js.undefined
  var customClickThroughUrl: js.UndefOr[java.lang.String] = js.undefined
  var landingPageId: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeClickThroughUrl {
  @scala.inline
  def apply(
    computedClickThroughUrl: java.lang.String = null,
    customClickThroughUrl: java.lang.String = null,
    landingPageId: java.lang.String = null
  ): CreativeClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    if (computedClickThroughUrl != null) __obj.updateDynamic("computedClickThroughUrl")(computedClickThroughUrl)
    if (customClickThroughUrl != null) __obj.updateDynamic("customClickThroughUrl")(customClickThroughUrl)
    if (landingPageId != null) __obj.updateDynamic("landingPageId")(landingPageId)
    __obj.asInstanceOf[CreativeClickThroughUrl]
  }
}

