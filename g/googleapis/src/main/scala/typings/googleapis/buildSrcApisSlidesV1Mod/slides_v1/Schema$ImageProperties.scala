package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the Image.
  */
@js.native
trait Schema$ImageProperties extends js.Object {
  /**
    * The brightness effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var brightness: js.UndefOr[Double] = js.native
  /**
    * The contrast effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var contrast: js.UndefOr[Double] = js.native
  /**
    * The crop properties of the image. If not set, the image is not cropped.
    * This property is read-only.
    */
  var cropProperties: js.UndefOr[Schema$CropProperties] = js.native
  /**
    * The hyperlink destination of the image. If unset, there is no link.
    */
  var link: js.UndefOr[Schema$Link] = js.native
  /**
    * The outline of the image. If not set, the image has no outline.
    */
  var outline: js.UndefOr[Schema$Outline] = js.native
  /**
    * The recolor effect of the image. If not set, the image is not recolored.
    * This property is read-only.
    */
  var recolor: js.UndefOr[Schema$Recolor] = js.native
  /**
    * The shadow of the image. If not set, the image has no shadow. This
    * property is read-only.
    */
  var shadow: js.UndefOr[Schema$Shadow] = js.native
  /**
    * The transparency effect of the image. The value should be in the interval
    * [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
    * This property is read-only.
    */
  var transparency: js.UndefOr[Double] = js.native
}

object Schema$ImageProperties {
  @scala.inline
  def apply(
    brightness: Int | Double = null,
    contrast: Int | Double = null,
    cropProperties: Schema$CropProperties = null,
    link: Schema$Link = null,
    outline: Schema$Outline = null,
    recolor: Schema$Recolor = null,
    shadow: Schema$Shadow = null,
    transparency: Int | Double = null
  ): Schema$ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (recolor != null) __obj.updateDynamic("recolor")(recolor.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImageProperties]
  }
}

