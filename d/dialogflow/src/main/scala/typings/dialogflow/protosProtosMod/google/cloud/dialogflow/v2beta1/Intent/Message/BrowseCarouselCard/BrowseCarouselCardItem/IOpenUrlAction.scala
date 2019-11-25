package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OpenUrlAction. */
trait IOpenUrlAction extends js.Object {
  /** OpenUrlAction url */
  var url: js.UndefOr[String | Null] = js.undefined
  /** OpenUrlAction urlTypeHint */
  var urlTypeHint: js.UndefOr[UrlTypeHint | Null] = js.undefined
}

object IOpenUrlAction {
  @scala.inline
  def apply(url: String = null, urlTypeHint: UrlTypeHint = null): IOpenUrlAction = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlTypeHint != null) __obj.updateDynamic("urlTypeHint")(urlTypeHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpenUrlAction]
  }
}

