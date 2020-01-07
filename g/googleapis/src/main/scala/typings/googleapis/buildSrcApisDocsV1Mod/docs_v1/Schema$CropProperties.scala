package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The crop properties of an image.  The crop rectangle is represented using
  * fractional offsets from the original content&#39;s four edges.  - If the
  * offset is in the interval (0, 1), the corresponding edge of crop rectangle
  * is positioned inside of the image&#39;s original bounding rectangle. - If
  * the offset is negative or greater than 1, the corresponding edge of crop
  * rectangle is positioned outside of the image&#39;s original bounding
  * rectangle. - If all offsets and rotation angle are 0, the image is not
  * cropped.
  */
@js.native
trait Schema$CropProperties extends js.Object {
  /**
    * The clockwise rotation angle of the crop rectangle around its center, in
    * radians. Rotation is applied after the offsets.
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * The offset specifies how far inwards the bottom edge of the crop
    * rectangle is from the bottom edge of the original content as a fraction
    * of the original content&#39;s height.
    */
  var offsetBottom: js.UndefOr[Double] = js.native
  /**
    * The offset specifies how far inwards the left edge of the crop rectangle
    * is from the left edge of the original content as a fraction of the
    * original content&#39;s width.
    */
  var offsetLeft: js.UndefOr[Double] = js.native
  /**
    * The offset specifies how far inwards the right edge of the crop rectangle
    * is from the right edge of the original content as a fraction of the
    * original content&#39;s width.
    */
  var offsetRight: js.UndefOr[Double] = js.native
  /**
    * The offset specifies how far inwards the top edge of the crop rectangle
    * is from the top edge of the original content as a fraction of the
    * original content&#39;s height.
    */
  var offsetTop: js.UndefOr[Double] = js.native
}

object Schema$CropProperties {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    offsetBottom: Int | Double = null,
    offsetLeft: Int | Double = null,
    offsetRight: Int | Double = null,
    offsetTop: Int | Double = null
  ): Schema$CropProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetRight != null) __obj.updateDynamic("offsetRight")(offsetRight.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CropProperties]
  }
}

