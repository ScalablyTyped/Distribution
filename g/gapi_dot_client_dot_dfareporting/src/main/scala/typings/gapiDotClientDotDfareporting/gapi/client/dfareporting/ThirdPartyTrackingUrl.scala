package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyTrackingUrl extends js.Object {
  /** Third-party URL type for in-stream video creatives. */
  var thirdPartyUrlType: js.UndefOr[String] = js.undefined
  /** URL for the specified third-party URL type. */
  var url: js.UndefOr[String] = js.undefined
}

object ThirdPartyTrackingUrl {
  @scala.inline
  def apply(thirdPartyUrlType: String = null, url: String = null): ThirdPartyTrackingUrl = {
    val __obj = js.Dynamic.literal()
    if (thirdPartyUrlType != null) __obj.updateDynamic("thirdPartyUrlType")(thirdPartyUrlType)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ThirdPartyTrackingUrl]
  }
}

