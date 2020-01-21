package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoverInfo extends js.Object {
  var coverInfo: js.UndefOr[AnonLeftImageOffset] = js.native
  var coverPhoto: js.UndefOr[AnonHeight] = js.native
  var layout: js.UndefOr[String] = js.native
}

object AnonCoverInfo {
  @scala.inline
  def apply(coverInfo: AnonLeftImageOffset = null, coverPhoto: AnonHeight = null, layout: String = null): AnonCoverInfo = {
    val __obj = js.Dynamic.literal()
    if (coverInfo != null) __obj.updateDynamic("coverInfo")(coverInfo.asInstanceOf[js.Any])
    if (coverPhoto != null) __obj.updateDynamic("coverPhoto")(coverPhoto.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoverInfo]
  }
}

