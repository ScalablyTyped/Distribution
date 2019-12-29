package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

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
    brightness: Int | Double = null,
    contrast: Int | Double = null,
    cropProperties: CropProperties = null,
    link: Link = null,
    outline: Outline = null,
    recolor: Recolor = null,
    shadow: Shadow = null,
    transparency: Int | Double = null
  ): ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (recolor != null) __obj.updateDynamic("recolor")(recolor.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProperties]
  }
}

