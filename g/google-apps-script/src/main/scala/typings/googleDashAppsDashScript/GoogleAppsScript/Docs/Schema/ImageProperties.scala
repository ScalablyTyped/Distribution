package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProperties extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var brightness: js.UndefOr[Double] = js.undefined
  var contentUri: js.UndefOr[String] = js.undefined
  var contrast: js.UndefOr[Double] = js.undefined
  var cropProperties: js.UndefOr[CropProperties] = js.undefined
  var sourceUri: js.UndefOr[String] = js.undefined
  var transparency: js.UndefOr[Double] = js.undefined
}

object ImageProperties {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    brightness: Int | Double = null,
    contentUri: String = null,
    contrast: Int | Double = null,
    cropProperties: CropProperties = null,
    sourceUri: String = null,
    transparency: Int | Double = null
  ): ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (contentUri != null) __obj.updateDynamic("contentUri")(contentUri.asInstanceOf[js.Any])
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties.asInstanceOf[js.Any])
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProperties]
  }
}

