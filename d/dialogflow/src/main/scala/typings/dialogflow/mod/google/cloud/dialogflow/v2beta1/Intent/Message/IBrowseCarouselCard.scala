package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.IBrowseCarouselCardItem
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BrowseCarouselCard. */
trait IBrowseCarouselCard extends js.Object {
  /** BrowseCarouselCard imageDisplayOptions */
  var imageDisplayOptions: js.UndefOr[ImageDisplayOptions | String | Null] = js.undefined
  /** BrowseCarouselCard items */
  var items: js.UndefOr[js.Array[IBrowseCarouselCardItem] | Null] = js.undefined
}

object IBrowseCarouselCard {
  @scala.inline
  def apply(
    imageDisplayOptions: ImageDisplayOptions | String = null,
    items: js.Array[IBrowseCarouselCardItem] = null
  ): IBrowseCarouselCard = {
    val __obj = js.Dynamic.literal()
    if (imageDisplayOptions != null) __obj.updateDynamic("imageDisplayOptions")(imageDisplayOptions.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowseCarouselCard]
  }
}

