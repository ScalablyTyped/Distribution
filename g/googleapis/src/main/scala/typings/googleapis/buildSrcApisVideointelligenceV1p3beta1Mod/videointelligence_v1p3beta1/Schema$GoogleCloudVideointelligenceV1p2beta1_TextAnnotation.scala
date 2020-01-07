package typings.googleapis.buildSrcApisVideointelligenceV1p3beta1Mod.videointelligence_v1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotations related to one detected OCR text snippet. This will contain the
  * corresponding text, confidence value, and frame level information for each
  * detection.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p2beta1_TextAnnotation extends js.Object {
  /**
    * All video segments where OCR detected text appears.
    */
  var segments: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p2beta1_TextSegment]] = js.native
  /**
    * The detected text.
    */
  var text: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p2beta1_TextAnnotation {
  @scala.inline
  def apply(
    segments: js.Array[Schema$GoogleCloudVideointelligenceV1p2beta1_TextSegment] = null,
    text: String = null
  ): Schema$GoogleCloudVideointelligenceV1p2beta1_TextAnnotation = {
    val __obj = js.Dynamic.literal()
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p2beta1_TextAnnotation]
  }
}

