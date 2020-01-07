package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for performing Google Cloud Vision API tasks over a user-provided
  * image, with user-requested features, and with context information.
  */
@js.native
trait Schema$AnnotateImageRequest extends js.Object {
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[Schema$Feature]] = js.native
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[Schema$Image] = js.native
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[Schema$ImageContext] = js.native
}

object Schema$AnnotateImageRequest {
  @scala.inline
  def apply(
    features: js.Array[Schema$Feature] = null,
    image: Schema$Image = null,
    imageContext: Schema$ImageContext = null
  ): Schema$AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageContext != null) __obj.updateDynamic("imageContext")(imageContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnnotateImageRequest]
  }
}

