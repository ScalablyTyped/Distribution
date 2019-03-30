package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProperties extends js.Object {
  var brightness: js.UndefOr[stdLib.Number] = js.undefined
  var contrast: js.UndefOr[stdLib.Number] = js.undefined
  var cropProperties: js.UndefOr[CropProperties] = js.undefined
  var link: js.UndefOr[Link] = js.undefined
  var outline: js.UndefOr[Outline] = js.undefined
  var recolor: js.UndefOr[Recolor] = js.undefined
  var shadow: js.UndefOr[Shadow] = js.undefined
  var transparency: js.UndefOr[stdLib.Number] = js.undefined
}

object ImageProperties {
  @scala.inline
  def apply(
    brightness: stdLib.Number = null,
    contrast: stdLib.Number = null,
    cropProperties: CropProperties = null,
    link: Link = null,
    outline: Outline = null,
    recolor: Recolor = null,
    shadow: Shadow = null,
    transparency: stdLib.Number = null
  ): ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (brightness != null) __obj.updateDynamic("brightness")(brightness)
    if (contrast != null) __obj.updateDynamic("contrast")(contrast)
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties)
    if (link != null) __obj.updateDynamic("link")(link)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (recolor != null) __obj.updateDynamic("recolor")(recolor)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency)
    __obj.asInstanceOf[ImageProperties]
  }
}

