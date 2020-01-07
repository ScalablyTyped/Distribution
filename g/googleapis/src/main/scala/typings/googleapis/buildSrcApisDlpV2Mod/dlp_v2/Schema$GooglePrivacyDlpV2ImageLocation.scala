package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of the finding within an image.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ImageLocation extends js.Object {
  /**
    * Bounding boxes locating the pixels within the image containing the
    * finding.
    */
  var boundingBoxes: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2BoundingBox]] = js.native
}

object Schema$GooglePrivacyDlpV2ImageLocation {
  @scala.inline
  def apply(boundingBoxes: js.Array[Schema$GooglePrivacyDlpV2BoundingBox] = null): Schema$GooglePrivacyDlpV2ImageLocation = {
    val __obj = js.Dynamic.literal()
    if (boundingBoxes != null) __obj.updateDynamic("boundingBoxes")(boundingBoxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ImageLocation]
  }
}

