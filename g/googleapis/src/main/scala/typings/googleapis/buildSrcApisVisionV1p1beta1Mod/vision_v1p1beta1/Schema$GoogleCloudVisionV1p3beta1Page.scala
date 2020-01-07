package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected page from OCR.
  */
@js.native
trait Schema$GoogleCloudVisionV1p3beta1Page extends js.Object {
  /**
    * List of blocks of text, images etc on this page.
    */
  var blocks: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p3beta1Block]] = js.native
  /**
    * Confidence of the OCR results on the page. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Page height. For PDFs the unit is points. For images (including TIFFs)
    * the unit is pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Additional information detected on the page.
    */
  var property: js.UndefOr[Schema$GoogleCloudVisionV1p3beta1TextAnnotationTextProperty] = js.native
  /**
    * Page width. For PDFs the unit is points. For images (including TIFFs) the
    * unit is pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object Schema$GoogleCloudVisionV1p3beta1Page {
  @scala.inline
  def apply(
    blocks: js.Array[Schema$GoogleCloudVisionV1p3beta1Block] = null,
    confidence: Int | Double = null,
    height: Int | Double = null,
    property: Schema$GoogleCloudVisionV1p3beta1TextAnnotationTextProperty = null,
    width: Int | Double = null
  ): Schema$GoogleCloudVisionV1p3beta1Page = {
    val __obj = js.Dynamic.literal()
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p3beta1Page]
  }
}

