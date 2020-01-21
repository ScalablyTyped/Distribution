package typings.gapiClientPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoverInfo extends js.Object {
  /** Extra information about the cover photo. */
  var coverInfo: js.UndefOr[AnonLeftImageOffset] = js.undefined
  /** The person's primary cover image. */
  var coverPhoto: js.UndefOr[AnonHeightUrl] = js.undefined
  /**
    * The layout of the cover art. Possible values include, but are not limited to, the following values:
    * - "banner" - One large image banner.
    */
  var layout: js.UndefOr[String] = js.undefined
}

object AnonCoverInfo {
  @scala.inline
  def apply(coverInfo: AnonLeftImageOffset = null, coverPhoto: AnonHeightUrl = null, layout: String = null): AnonCoverInfo = {
    val __obj = js.Dynamic.literal()
    if (coverInfo != null) __obj.updateDynamic("coverInfo")(coverInfo.asInstanceOf[js.Any])
    if (coverPhoto != null) __obj.updateDynamic("coverPhoto")(coverPhoto.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoverInfo]
  }
}

