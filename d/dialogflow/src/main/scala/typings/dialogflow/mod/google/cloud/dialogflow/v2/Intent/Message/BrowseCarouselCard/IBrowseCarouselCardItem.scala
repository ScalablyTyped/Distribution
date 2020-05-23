package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.IOpenUrlAction
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BrowseCarouselCardItem. */
trait IBrowseCarouselCardItem extends js.Object {
  /** BrowseCarouselCardItem description */
  var description: js.UndefOr[String | Null] = js.undefined
  /** BrowseCarouselCardItem footer */
  var footer: js.UndefOr[String | Null] = js.undefined
  /** BrowseCarouselCardItem image */
  var image: js.UndefOr[IImage | Null] = js.undefined
  /** BrowseCarouselCardItem openUriAction */
  var openUriAction: js.UndefOr[IOpenUrlAction | Null] = js.undefined
  /** BrowseCarouselCardItem title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object IBrowseCarouselCardItem {
  @scala.inline
  def apply(
    description: js.UndefOr[Null | String] = js.undefined,
    footer: js.UndefOr[Null | String] = js.undefined,
    image: js.UndefOr[Null | IImage] = js.undefined,
    openUriAction: js.UndefOr[Null | IOpenUrlAction] = js.undefined,
    title: js.UndefOr[Null | String] = js.undefined
  ): IBrowseCarouselCardItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(openUriAction)) __obj.updateDynamic("openUriAction")(openUriAction.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowseCarouselCardItem]
  }
}

