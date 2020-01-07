package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A face-specific landmark (for example, a face feature).
  */
@js.native
trait Schema$GoogleCloudVisionV1p2beta1FaceAnnotationLandmark extends js.Object {
  /**
    * Face landmark position.
    */
  var position: js.UndefOr[Schema$GoogleCloudVisionV1p2beta1Position] = js.native
  /**
    * Face landmark type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVisionV1p2beta1FaceAnnotationLandmark {
  @scala.inline
  def apply(position: Schema$GoogleCloudVisionV1p2beta1Position = null, `type`: String = null): Schema$GoogleCloudVisionV1p2beta1FaceAnnotationLandmark = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p2beta1FaceAnnotationLandmark]
  }
}

