package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for performing Google Cloud Vision API tasks over a user-provided
  * image, with user-requested features, and with context information.
  */
@js.native
trait Schema$GoogleCloudVisionV1p1beta1AnnotateImageRequest extends js.Object {
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p1beta1Feature]] = js.native
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[Schema$GoogleCloudVisionV1p1beta1Image] = js.native
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[Schema$GoogleCloudVisionV1p1beta1ImageContext] = js.native
}

object Schema$GoogleCloudVisionV1p1beta1AnnotateImageRequest {
  @scala.inline
  def apply(
    features: js.Array[Schema$GoogleCloudVisionV1p1beta1Feature] = null,
    image: Schema$GoogleCloudVisionV1p1beta1Image = null,
    imageContext: Schema$GoogleCloudVisionV1p1beta1ImageContext = null
  ): Schema$GoogleCloudVisionV1p1beta1AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageContext != null) __obj.updateDynamic("imageContext")(imageContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p1beta1AnnotateImageRequest]
  }
}

