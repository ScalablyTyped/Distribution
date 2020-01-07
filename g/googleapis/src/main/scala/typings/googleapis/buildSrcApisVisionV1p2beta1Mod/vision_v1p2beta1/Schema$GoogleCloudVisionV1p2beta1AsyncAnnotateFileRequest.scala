package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An offline file annotation request.
  */
@js.native
trait Schema$GoogleCloudVisionV1p2beta1AsyncAnnotateFileRequest extends js.Object {
  /**
    * Required. Requested features.
    */
  var features: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p2beta1Feature]] = js.native
  /**
    * Additional context that may accompany the image(s) in the file.
    */
  var imageContext: js.UndefOr[Schema$GoogleCloudVisionV1p2beta1ImageContext] = js.native
  /**
    * Required. Information about the input file.
    */
  var inputConfig: js.UndefOr[Schema$GoogleCloudVisionV1p2beta1InputConfig] = js.native
  /**
    * Required. The desired output location and metadata (e.g. format).
    */
  var outputConfig: js.UndefOr[Schema$GoogleCloudVisionV1p2beta1OutputConfig] = js.native
}

object Schema$GoogleCloudVisionV1p2beta1AsyncAnnotateFileRequest {
  @scala.inline
  def apply(
    features: js.Array[Schema$GoogleCloudVisionV1p2beta1Feature] = null,
    imageContext: Schema$GoogleCloudVisionV1p2beta1ImageContext = null,
    inputConfig: Schema$GoogleCloudVisionV1p2beta1InputConfig = null,
    outputConfig: Schema$GoogleCloudVisionV1p2beta1OutputConfig = null
  ): Schema$GoogleCloudVisionV1p2beta1AsyncAnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (imageContext != null) __obj.updateDynamic("imageContext")(imageContext.asInstanceOf[js.Any])
    if (inputConfig != null) __obj.updateDynamic("inputConfig")(inputConfig.asInstanceOf[js.Any])
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p2beta1AsyncAnnotateFileRequest]
  }
}

