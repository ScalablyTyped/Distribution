package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

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
    angle: js.UndefOr[Double] = js.undefined,
    brightness: js.UndefOr[Double] = js.undefined,
    contentUri: String = null,
    contrast: js.UndefOr[Double] = js.undefined,
    cropProperties: CropProperties = null,
    sourceUri: String = null,
    transparency: js.UndefOr[Double] = js.undefined
  ): ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(brightness)) __obj.updateDynamic("brightness")(brightness.get.asInstanceOf[js.Any])
    if (contentUri != null) __obj.updateDynamic("contentUri")(contentUri.asInstanceOf[js.Any])
    if (!js.isUndefined(contrast)) __obj.updateDynamic("contrast")(contrast.get.asInstanceOf[js.Any])
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties.asInstanceOf[js.Any])
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProperties]
  }
}

