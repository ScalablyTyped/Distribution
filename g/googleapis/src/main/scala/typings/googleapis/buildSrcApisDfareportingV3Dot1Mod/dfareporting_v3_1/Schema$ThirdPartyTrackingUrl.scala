package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Third-party Tracking URL.
  */
@js.native
trait Schema$ThirdPartyTrackingUrl extends js.Object {
  /**
    * Third-party URL type for in-stream video and in-stream audio creatives.
    */
  var thirdPartyUrlType: js.UndefOr[String] = js.native
  /**
    * URL for the specified third-party URL type.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$ThirdPartyTrackingUrl {
  @scala.inline
  def apply(thirdPartyUrlType: String = null, url: String = null): Schema$ThirdPartyTrackingUrl = {
    val __obj = js.Dynamic.literal()
    if (thirdPartyUrlType != null) __obj.updateDynamic("thirdPartyUrlType")(thirdPartyUrlType.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ThirdPartyTrackingUrl]
  }
}

