package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CoverInfo extends js.Object {
  var coverInfo: js.UndefOr[Anon_LeftImageOffset] = js.native
  var coverPhoto: js.UndefOr[Anon_Height] = js.native
  var layout: js.UndefOr[String] = js.native
}

object Anon_CoverInfo {
  @scala.inline
  def apply(coverInfo: Anon_LeftImageOffset = null, coverPhoto: Anon_Height = null, layout: String = null): Anon_CoverInfo = {
    val __obj = js.Dynamic.literal()
    if (coverInfo != null) __obj.updateDynamic("coverInfo")(coverInfo.asInstanceOf[js.Any])
    if (coverPhoto != null) __obj.updateDynamic("coverPhoto")(coverPhoto.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CoverInfo]
  }
}

