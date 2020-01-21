package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyTrackingUrl extends js.Object {
  var thirdPartyUrlType: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ThirdPartyTrackingUrl {
  @scala.inline
  def apply(thirdPartyUrlType: String = null, url: String = null): ThirdPartyTrackingUrl = {
    val __obj = js.Dynamic.literal()
    if (thirdPartyUrlType != null) __obj.updateDynamic("thirdPartyUrlType")(thirdPartyUrlType.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyTrackingUrl]
  }
}

