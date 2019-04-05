package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProperties extends js.Object {
  var angle: js.UndefOr[stdLib.Number] = js.undefined
  var brightness: js.UndefOr[stdLib.Number] = js.undefined
  var contentUri: js.UndefOr[java.lang.String] = js.undefined
  var contrast: js.UndefOr[stdLib.Number] = js.undefined
  var cropProperties: js.UndefOr[CropProperties] = js.undefined
  var sourceUri: js.UndefOr[java.lang.String] = js.undefined
  var transparency: js.UndefOr[stdLib.Number] = js.undefined
}

object ImageProperties {
  @scala.inline
  def apply(
    angle: stdLib.Number = null,
    brightness: stdLib.Number = null,
    contentUri: java.lang.String = null,
    contrast: stdLib.Number = null,
    cropProperties: CropProperties = null,
    sourceUri: java.lang.String = null,
    transparency: stdLib.Number = null
  ): ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle)
    if (brightness != null) __obj.updateDynamic("brightness")(brightness)
    if (contentUri != null) __obj.updateDynamic("contentUri")(contentUri)
    if (contrast != null) __obj.updateDynamic("contrast")(contrast)
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties)
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency)
    __obj.asInstanceOf[ImageProperties]
  }
}

