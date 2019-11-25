package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteTranscodeSetting extends js.Object {
  var enabledVideoFormats: js.UndefOr[js.Array[Double]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object SiteTranscodeSetting {
  @scala.inline
  def apply(enabledVideoFormats: js.Array[Double] = null, kind: String = null): SiteTranscodeSetting = {
    val __obj = js.Dynamic.literal()
    if (enabledVideoFormats != null) __obj.updateDynamic("enabledVideoFormats")(enabledVideoFormats.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteTranscodeSetting]
  }
}

