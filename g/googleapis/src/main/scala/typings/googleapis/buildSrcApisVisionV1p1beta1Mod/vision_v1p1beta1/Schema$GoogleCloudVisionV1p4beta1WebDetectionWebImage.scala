package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for online images.
  */
@js.native
trait Schema$GoogleCloudVisionV1p4beta1WebDetectionWebImage extends js.Object {
  /**
    * (Deprecated) Overall relevancy score for the image.
    */
  var score: js.UndefOr[Double] = js.native
  /**
    * The result image URL.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVisionV1p4beta1WebDetectionWebImage {
  @scala.inline
  def apply(score: Int | Double = null, url: String = null): Schema$GoogleCloudVisionV1p4beta1WebDetectionWebImage = {
    val __obj = js.Dynamic.literal()
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p4beta1WebDetectionWebImage]
  }
}

