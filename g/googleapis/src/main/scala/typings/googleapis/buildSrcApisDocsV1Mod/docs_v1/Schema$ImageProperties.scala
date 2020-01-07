package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of an image.
  */
@js.native
trait Schema$ImageProperties extends js.Object {
  /**
    * The clockwise rotation angle of the image, in radians.
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * The brightness effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect.
    */
  var brightness: js.UndefOr[Double] = js.native
  /**
    * A URI to the image with a default lifetime of 30 minutes. This URI is
    * tagged with the account of the requester. Anyone with the URI effectively
    * accesses the image as the original requester. Access to the image may be
    * lost if the document&#39;s sharing settings change.
    */
  var contentUri: js.UndefOr[String] = js.native
  /**
    * The contrast effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect.
    */
  var contrast: js.UndefOr[Double] = js.native
  /**
    * The crop properties of the image.  After cropping, the image will be
    * stretched to fit in its container.
    */
  var cropProperties: js.UndefOr[Schema$CropProperties] = js.native
  /**
    * The source URI is the URI used to insert the image. The source URI can be
    * empty.
    */
  var sourceUri: js.UndefOr[String] = js.native
  /**
    * The transparency effect of the image. The value should be in the interval
    * [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
    */
  var transparency: js.UndefOr[Double] = js.native
}

object Schema$ImageProperties {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    brightness: Int | Double = null,
    contentUri: String = null,
    contrast: Int | Double = null,
    cropProperties: Schema$CropProperties = null,
    sourceUri: String = null,
    transparency: Int | Double = null
  ): Schema$ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (contentUri != null) __obj.updateDynamic("contentUri")(contentUri.asInstanceOf[js.Any])
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties.asInstanceOf[js.Any])
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImageProperties]
  }
}

