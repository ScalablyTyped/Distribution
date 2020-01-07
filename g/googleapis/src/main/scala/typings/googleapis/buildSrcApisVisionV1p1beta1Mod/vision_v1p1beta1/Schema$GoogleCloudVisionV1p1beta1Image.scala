package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Client image to perform Google Cloud Vision API tasks over.
  */
@js.native
trait Schema$GoogleCloudVisionV1p1beta1Image extends js.Object {
  /**
    * Image content, represented as a stream of bytes. Note: As with all
    * `bytes` fields, protobuffers use a pure binary representation, whereas
    * JSON representations use base64.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage image location, or publicly-accessible image URL. If
    * both `content` and `source` are provided for an image, `content` takes
    * precedence and is used to perform the image annotation request.
    */
  var source: js.UndefOr[Schema$GoogleCloudVisionV1p1beta1ImageSource] = js.native
}

object Schema$GoogleCloudVisionV1p1beta1Image {
  @scala.inline
  def apply(content: String = null, source: Schema$GoogleCloudVisionV1p1beta1ImageSource = null): Schema$GoogleCloudVisionV1p1beta1Image = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p1beta1Image]
  }
}

