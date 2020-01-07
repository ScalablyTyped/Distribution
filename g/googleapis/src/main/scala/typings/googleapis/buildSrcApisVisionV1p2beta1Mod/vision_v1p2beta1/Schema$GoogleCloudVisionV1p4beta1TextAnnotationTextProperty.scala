package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information detected on the structural component.
  */
@js.native
trait Schema$GoogleCloudVisionV1p4beta1TextAnnotationTextProperty extends js.Object {
  /**
    * Detected start or end of a text segment.
    */
  var detectedBreak: js.UndefOr[Schema$GoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak] = js.native
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage]] = js.native
}

object Schema$GoogleCloudVisionV1p4beta1TextAnnotationTextProperty {
  @scala.inline
  def apply(
    detectedBreak: Schema$GoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak = null,
    detectedLanguages: js.Array[Schema$GoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage] = null
  ): Schema$GoogleCloudVisionV1p4beta1TextAnnotationTextProperty = {
    val __obj = js.Dynamic.literal()
    if (detectedBreak != null) __obj.updateDynamic("detectedBreak")(detectedBreak.asInstanceOf[js.Any])
    if (detectedLanguages != null) __obj.updateDynamic("detectedLanguages")(detectedLanguages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p4beta1TextAnnotationTextProperty]
  }
}

