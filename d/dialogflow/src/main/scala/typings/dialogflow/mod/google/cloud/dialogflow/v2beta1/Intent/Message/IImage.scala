package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Image. */
trait IImage extends js.Object {
  /** Image accessibilityText */
  var accessibilityText: js.UndefOr[String | Null] = js.undefined
  /** Image imageUri */
  var imageUri: js.UndefOr[String | Null] = js.undefined
}

object IImage {
  @scala.inline
  def apply(
    accessibilityText: js.UndefOr[Null | String] = js.undefined,
    imageUri: js.UndefOr[Null | String] = js.undefined
  ): IImage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibilityText)) __obj.updateDynamic("accessibilityText")(accessibilityText.asInstanceOf[js.Any])
    if (!js.isUndefined(imageUri)) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImage]
  }
}

