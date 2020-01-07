package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single symbol representation.
  */
@js.native
trait Schema$GoogleCloudVisionV1p1beta1Symbol extends js.Object {
  /**
    * The bounding box for the symbol. The vertices are in the order of
    * top-left, top-right, bottom-right, bottom-left. When a rotation of the
    * bounding box is detected the rotation is represented as around the
    * top-left corner as defined when the text is read in the &#39;natural&#39;
    * orientation. For example:   * when the text is horizontal it might look
    * like:      0----1      |    |      3----2   * when it&#39;s rotated 180
    * degrees around the top-left corner it becomes:      2----3      |    |
    * 1----0   and the vertice order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[Schema$GoogleCloudVisionV1p1beta1BoundingPoly] = js.native
  /**
    * Confidence of the OCR results for the symbol. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Additional information detected for the symbol.
    */
  var property: js.UndefOr[Schema$GoogleCloudVisionV1p1beta1TextAnnotationTextProperty] = js.native
  /**
    * The actual UTF-8 representation of the symbol.
    */
  var text: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVisionV1p1beta1Symbol {
  @scala.inline
  def apply(
    boundingBox: Schema$GoogleCloudVisionV1p1beta1BoundingPoly = null,
    confidence: Int | Double = null,
    property: Schema$GoogleCloudVisionV1p1beta1TextAnnotationTextProperty = null,
    text: String = null
  ): Schema$GoogleCloudVisionV1p1beta1Symbol = {
    val __obj = js.Dynamic.literal()
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p1beta1Symbol]
  }
}

