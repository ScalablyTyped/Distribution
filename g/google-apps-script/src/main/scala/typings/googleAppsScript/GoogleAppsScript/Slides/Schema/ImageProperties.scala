package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProperties extends js.Object {
  var brightness: js.UndefOr[Double] = js.undefined
  var contrast: js.UndefOr[Double] = js.undefined
  var cropProperties: js.UndefOr[CropProperties] = js.undefined
  var link: js.UndefOr[Link] = js.undefined
  var outline: js.UndefOr[Outline] = js.undefined
  var recolor: js.UndefOr[Recolor] = js.undefined
  var shadow: js.UndefOr[Shadow] = js.undefined
  var transparency: js.UndefOr[Double] = js.undefined
}

object ImageProperties {
  @scala.inline
  def apply(
    brightness: js.UndefOr[Double] = js.undefined,
    contrast: js.UndefOr[Double] = js.undefined,
    cropProperties: CropProperties = null,
    link: Link = null,
    outline: Outline = null,
    recolor: Recolor = null,
    shadow: Shadow = null,
    transparency: js.UndefOr[Double] = js.undefined
  ): ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(brightness)) __obj.updateDynamic("brightness")(brightness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(contrast)) __obj.updateDynamic("contrast")(contrast.get.asInstanceOf[js.Any])
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (recolor != null) __obj.updateDynamic("recolor")(recolor.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProperties]
  }
}

