package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transcode Settings
  */
@js.native
trait Schema$SiteTranscodeSetting extends js.Object {
  /**
    * Whitelist of video formats to be served to this site template. Set this
    * list to null or empty to serve all video formats.
    */
  var enabledVideoFormats: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteTranscodeSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$SiteTranscodeSetting {
  @scala.inline
  def apply(enabledVideoFormats: js.Array[Double] = null, kind: String = null): Schema$SiteTranscodeSetting = {
    val __obj = js.Dynamic.literal()
    if (enabledVideoFormats != null) __obj.updateDynamic("enabledVideoFormats")(enabledVideoFormats.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SiteTranscodeSetting]
  }
}

