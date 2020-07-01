package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverInfo extends js.Object {
  var coverInfo: js.UndefOr[LeftImageOffset] = js.native
  var coverPhoto: js.UndefOr[Height] = js.native
  var layout: js.UndefOr[String] = js.native
}

object CoverInfo {
  @scala.inline
  def apply(coverInfo: LeftImageOffset = null, coverPhoto: Height = null, layout: String = null): CoverInfo = {
    val __obj = js.Dynamic.literal()
    if (coverInfo != null) __obj.updateDynamic("coverInfo")(coverInfo.asInstanceOf[js.Any])
    if (coverPhoto != null) __obj.updateDynamic("coverPhoto")(coverPhoto.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverInfo]
  }
}

