package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OpenUrlAction. */
trait IOpenUrlAction extends js.Object {
  /** OpenUrlAction url */
  var url: js.UndefOr[String | Null] = js.undefined
  /** OpenUrlAction urlTypeHint */
  var urlTypeHint: js.UndefOr[
    UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String) | Null
  ] = js.undefined
}

object IOpenUrlAction {
  @scala.inline
  def apply(
    url: js.UndefOr[Null | String] = js.undefined,
    urlTypeHint: js.UndefOr[
      Null | UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String)
    ] = js.undefined
  ): IOpenUrlAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(url)) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(urlTypeHint)) __obj.updateDynamic("urlTypeHint")(urlTypeHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpenUrlAction]
  }
}

