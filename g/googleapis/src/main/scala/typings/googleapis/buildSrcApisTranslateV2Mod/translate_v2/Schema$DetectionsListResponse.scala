package typings.googleapis.buildSrcApisTranslateV2Mod.translate_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DetectionsListResponse extends js.Object {
  /**
    * A detections contains detection results of several text
    */
  var detections: js.UndefOr[js.Array[Schema$DetectionsResource]] = js.native
}

object Schema$DetectionsListResponse {
  @scala.inline
  def apply(detections: js.Array[Schema$DetectionsResource] = null): Schema$DetectionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (detections != null) __obj.updateDynamic("detections")(detections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DetectionsListResponse]
  }
}

