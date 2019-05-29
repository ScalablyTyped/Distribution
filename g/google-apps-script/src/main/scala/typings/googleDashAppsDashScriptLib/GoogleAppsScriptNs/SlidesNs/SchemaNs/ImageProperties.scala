package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProperties extends js.Object {
  var brightness: js.UndefOr[scala.Double] = js.undefined
  var contrast: js.UndefOr[scala.Double] = js.undefined
  var cropProperties: js.UndefOr[CropProperties] = js.undefined
  var link: js.UndefOr[Link] = js.undefined
  var outline: js.UndefOr[Outline] = js.undefined
  var recolor: js.UndefOr[Recolor] = js.undefined
  var shadow: js.UndefOr[Shadow] = js.undefined
  var transparency: js.UndefOr[scala.Double] = js.undefined
}

object ImageProperties {
  @scala.inline
  def apply(
    brightness: scala.Int | scala.Double = null,
    contrast: scala.Int | scala.Double = null,
    cropProperties: CropProperties = null,
    link: Link = null,
    outline: Outline = null,
    recolor: Recolor = null,
    shadow: Shadow = null,
    transparency: scala.Int | scala.Double = null
  ): ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties)
    if (link != null) __obj.updateDynamic("link")(link)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (recolor != null) __obj.updateDynamic("recolor")(recolor)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProperties]
  }
}

