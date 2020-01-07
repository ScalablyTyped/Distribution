package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An offline file annotation request.
  */
@js.native
trait Schema$AsyncAnnotateFileRequest extends js.Object {
  /**
    * Required. Requested features.
    */
  var features: js.UndefOr[js.Array[Schema$Feature]] = js.native
  /**
    * Additional context that may accompany the image(s) in the file.
    */
  var imageContext: js.UndefOr[Schema$ImageContext] = js.native
  /**
    * Required. Information about the input file.
    */
  var inputConfig: js.UndefOr[Schema$InputConfig] = js.native
  /**
    * Required. The desired output location and metadata (e.g. format).
    */
  var outputConfig: js.UndefOr[Schema$OutputConfig] = js.native
}

object Schema$AsyncAnnotateFileRequest {
  @scala.inline
  def apply(
    features: js.Array[Schema$Feature] = null,
    imageContext: Schema$ImageContext = null,
    inputConfig: Schema$InputConfig = null,
    outputConfig: Schema$OutputConfig = null
  ): Schema$AsyncAnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (imageContext != null) __obj.updateDynamic("imageContext")(imageContext.asInstanceOf[js.Any])
    if (inputConfig != null) __obj.updateDynamic("inputConfig")(inputConfig.asInstanceOf[js.Any])
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AsyncAnnotateFileRequest]
  }
}

