package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

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
  def apply(accessibilityText: String = null, imageUri: String = null): IImage = {
    val __obj = js.Dynamic.literal()
    if (accessibilityText != null) __obj.updateDynamic("accessibilityText")(accessibilityText)
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri)
    __obj.asInstanceOf[IImage]
  }
}

