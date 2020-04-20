package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IBasicCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IBrowseCarouselCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ICard
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ICarouselSelect
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IImage
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ILinkOutSuggestion
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IListSelect
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IMediaContent
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IQuickReplies
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ISimpleResponses
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ISuggestions
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ITableCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IText
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform
import typings.dialogflow.mod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Message. */
trait IMessage extends js.Object {
  /** Message basicCard */
  var basicCard: js.UndefOr[IBasicCard | Null] = js.undefined
  /** Message browseCarouselCard */
  var browseCarouselCard: js.UndefOr[IBrowseCarouselCard | Null] = js.undefined
  /** Message card */
  var card: js.UndefOr[ICard | Null] = js.undefined
  /** Message carouselSelect */
  var carouselSelect: js.UndefOr[ICarouselSelect | Null] = js.undefined
  /** Message image */
  var image: js.UndefOr[IImage | Null] = js.undefined
  /** Message linkOutSuggestion */
  var linkOutSuggestion: js.UndefOr[ILinkOutSuggestion | Null] = js.undefined
  /** Message listSelect */
  var listSelect: js.UndefOr[IListSelect | Null] = js.undefined
  /** Message mediaContent */
  var mediaContent: js.UndefOr[IMediaContent | Null] = js.undefined
  /** Message payload */
  var payload: js.UndefOr[IStruct | Null] = js.undefined
  /** Message platform */
  var platform: js.UndefOr[
    Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.Platform * / any */ String) | Null
  ] = js.undefined
  /** Message quickReplies */
  var quickReplies: js.UndefOr[IQuickReplies | Null] = js.undefined
  /** Message simpleResponses */
  var simpleResponses: js.UndefOr[ISimpleResponses | Null] = js.undefined
  /** Message suggestions */
  var suggestions: js.UndefOr[ISuggestions | Null] = js.undefined
  /** Message tableCard */
  var tableCard: js.UndefOr[ITableCard | Null] = js.undefined
  /** Message text */
  var text: js.UndefOr[IText | Null] = js.undefined
}

object IMessage {
  @scala.inline
  def apply(
    basicCard: IBasicCard = null,
    browseCarouselCard: IBrowseCarouselCard = null,
    card: ICard = null,
    carouselSelect: ICarouselSelect = null,
    image: IImage = null,
    linkOutSuggestion: ILinkOutSuggestion = null,
    listSelect: IListSelect = null,
    mediaContent: IMediaContent = null,
    payload: IStruct = null,
    platform: Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.Platform * / any */ String) = null,
    quickReplies: IQuickReplies = null,
    simpleResponses: ISimpleResponses = null,
    suggestions: ISuggestions = null,
    tableCard: ITableCard = null,
    text: IText = null
  ): IMessage = {
    val __obj = js.Dynamic.literal()
    if (basicCard != null) __obj.updateDynamic("basicCard")(basicCard.asInstanceOf[js.Any])
    if (browseCarouselCard != null) __obj.updateDynamic("browseCarouselCard")(browseCarouselCard.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (carouselSelect != null) __obj.updateDynamic("carouselSelect")(carouselSelect.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (linkOutSuggestion != null) __obj.updateDynamic("linkOutSuggestion")(linkOutSuggestion.asInstanceOf[js.Any])
    if (listSelect != null) __obj.updateDynamic("listSelect")(listSelect.asInstanceOf[js.Any])
    if (mediaContent != null) __obj.updateDynamic("mediaContent")(mediaContent.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (quickReplies != null) __obj.updateDynamic("quickReplies")(quickReplies.asInstanceOf[js.Any])
    if (simpleResponses != null) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (tableCard != null) __obj.updateDynamic("tableCard")(tableCard.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
}

