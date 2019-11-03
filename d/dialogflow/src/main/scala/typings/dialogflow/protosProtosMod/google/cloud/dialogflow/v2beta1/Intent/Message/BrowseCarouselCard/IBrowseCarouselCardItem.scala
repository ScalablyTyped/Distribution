package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.IOpenUrlAction
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.IImage
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
    description: String = null,
    footer: String = null,
    image: IImage = null,
    openUriAction: IOpenUrlAction = null,
    title: String = null
  ): IBrowseCarouselCardItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (image != null) __obj.updateDynamic("image")(image)
    if (openUriAction != null) __obj.updateDynamic("openUriAction")(openUriAction)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IBrowseCarouselCardItem]
  }
}

