package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The image response message.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1IntentMessageImage extends js.Object {
  /**
    * A text description of the image to be used for accessibility, e.g.,
    * screen readers. Required if image_uri is set for CarouselSelect.
    */
  var accessibilityText: js.UndefOr[String] = js.native
  /**
    * Optional. The public URI to an image file.
    */
  var imageUri: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1IntentMessageImage {
  @scala.inline
  def apply(accessibilityText: String = null, imageUri: String = null): Schema$GoogleCloudDialogflowV2beta1IntentMessageImage = {
    val __obj = js.Dynamic.literal()
    if (accessibilityText != null) __obj.updateDynamic("accessibilityText")(accessibilityText.asInstanceOf[js.Any])
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1IntentMessageImage]
  }
}

