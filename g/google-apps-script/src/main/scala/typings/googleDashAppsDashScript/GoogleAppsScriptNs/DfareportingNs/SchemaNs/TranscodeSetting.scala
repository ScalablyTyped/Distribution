package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranscodeSetting extends js.Object {
  var enabledVideoFormats: js.UndefOr[js.Array[Double]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object TranscodeSetting {
  @scala.inline
  def apply(enabledVideoFormats: js.Array[Double] = null, kind: String = null): TranscodeSetting = {
    val __obj = js.Dynamic.literal()
    if (enabledVideoFormats != null) __obj.updateDynamic("enabledVideoFormats")(enabledVideoFormats)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[TranscodeSetting]
  }
}

