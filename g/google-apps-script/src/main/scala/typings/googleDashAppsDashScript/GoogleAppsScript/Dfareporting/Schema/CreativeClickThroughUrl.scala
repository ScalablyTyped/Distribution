package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeClickThroughUrl extends js.Object {
  var computedClickThroughUrl: js.UndefOr[String] = js.undefined
  var customClickThroughUrl: js.UndefOr[String] = js.undefined
  var landingPageId: js.UndefOr[String] = js.undefined
}

object CreativeClickThroughUrl {
  @scala.inline
  def apply(
    computedClickThroughUrl: String = null,
    customClickThroughUrl: String = null,
    landingPageId: String = null
  ): CreativeClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    if (computedClickThroughUrl != null) __obj.updateDynamic("computedClickThroughUrl")(computedClickThroughUrl.asInstanceOf[js.Any])
    if (customClickThroughUrl != null) __obj.updateDynamic("customClickThroughUrl")(customClickThroughUrl.asInstanceOf[js.Any])
    if (landingPageId != null) __obj.updateDynamic("landingPageId")(landingPageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeClickThroughUrl]
  }
}

