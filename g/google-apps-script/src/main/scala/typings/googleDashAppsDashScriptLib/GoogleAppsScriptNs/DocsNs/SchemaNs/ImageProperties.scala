package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProperties extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var brightness: js.UndefOr[scala.Double] = js.undefined
  var contentUri: js.UndefOr[java.lang.String] = js.undefined
  var contrast: js.UndefOr[scala.Double] = js.undefined
  var cropProperties: js.UndefOr[CropProperties] = js.undefined
  var sourceUri: js.UndefOr[java.lang.String] = js.undefined
  var transparency: js.UndefOr[scala.Double] = js.undefined
}

object ImageProperties {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    brightness: scala.Int | scala.Double = null,
    contentUri: java.lang.String = null,
    contrast: scala.Int | scala.Double = null,
    cropProperties: CropProperties = null,
    sourceUri: java.lang.String = null,
    transparency: scala.Int | scala.Double = null
  ): ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (contentUri != null) __obj.updateDynamic("contentUri")(contentUri)
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties)
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProperties]
  }
}

