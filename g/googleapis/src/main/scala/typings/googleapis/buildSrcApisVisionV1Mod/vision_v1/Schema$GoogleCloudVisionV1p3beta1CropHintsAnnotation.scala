package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
@js.native
trait Schema$GoogleCloudVisionV1p3beta1CropHintsAnnotation extends js.Object {
  /**
    * Crop hint results.
    */
  var cropHints: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p3beta1CropHint]] = js.native
}

object Schema$GoogleCloudVisionV1p3beta1CropHintsAnnotation {
  @scala.inline
  def apply(cropHints: js.Array[Schema$GoogleCloudVisionV1p3beta1CropHint] = null): Schema$GoogleCloudVisionV1p3beta1CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    if (cropHints != null) __obj.updateDynamic("cropHints")(cropHints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p3beta1CropHintsAnnotation]
  }
}

