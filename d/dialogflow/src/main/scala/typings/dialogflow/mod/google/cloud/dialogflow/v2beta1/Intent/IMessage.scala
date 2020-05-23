package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IBasicCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IBrowseCarouselCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ICard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ICarouselSelect
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IImage
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ILinkOutSuggestion
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IListSelect
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IMediaContent
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IQuickReplies
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IRbmCarouselCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IRbmStandaloneCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IRbmText
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ISimpleResponses
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ISuggestions
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITableCard
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITelephonyPlayAudio
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITelephonySynthesizeSpeech
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ITelephonyTransferCall
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IText
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform
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
    Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.Platform * / any */ String) | Null
  ] = js.undefined
  /** Message quickReplies */
  var quickReplies: js.UndefOr[IQuickReplies | Null] = js.undefined
  /** Message rbmCarouselRichCard */
  var rbmCarouselRichCard: js.UndefOr[IRbmCarouselCard | Null] = js.undefined
  /** Message rbmStandaloneRichCard */
  var rbmStandaloneRichCard: js.UndefOr[IRbmStandaloneCard | Null] = js.undefined
  /** Message rbmText */
  var rbmText: js.UndefOr[IRbmText | Null] = js.undefined
  /** Message simpleResponses */
  var simpleResponses: js.UndefOr[ISimpleResponses | Null] = js.undefined
  /** Message suggestions */
  var suggestions: js.UndefOr[ISuggestions | Null] = js.undefined
  /** Message tableCard */
  var tableCard: js.UndefOr[ITableCard | Null] = js.undefined
  /** Message telephonyPlayAudio */
  var telephonyPlayAudio: js.UndefOr[ITelephonyPlayAudio | Null] = js.undefined
  /** Message telephonySynthesizeSpeech */
  var telephonySynthesizeSpeech: js.UndefOr[ITelephonySynthesizeSpeech | Null] = js.undefined
  /** Message telephonyTransferCall */
  var telephonyTransferCall: js.UndefOr[ITelephonyTransferCall | Null] = js.undefined
  /** Message text */
  var text: js.UndefOr[IText | Null] = js.undefined
}

object IMessage {
  @scala.inline
  def apply(
    basicCard: js.UndefOr[Null | IBasicCard] = js.undefined,
    browseCarouselCard: js.UndefOr[Null | IBrowseCarouselCard] = js.undefined,
    card: js.UndefOr[Null | ICard] = js.undefined,
    carouselSelect: js.UndefOr[Null | ICarouselSelect] = js.undefined,
    image: js.UndefOr[Null | IImage] = js.undefined,
    linkOutSuggestion: js.UndefOr[Null | ILinkOutSuggestion] = js.undefined,
    listSelect: js.UndefOr[Null | IListSelect] = js.undefined,
    mediaContent: js.UndefOr[Null | IMediaContent] = js.undefined,
    payload: js.UndefOr[Null | IStruct] = js.undefined,
    platform: js.UndefOr[
      Null | Platform | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.Platform * / any */ String)
    ] = js.undefined,
    quickReplies: js.UndefOr[Null | IQuickReplies] = js.undefined,
    rbmCarouselRichCard: js.UndefOr[Null | IRbmCarouselCard] = js.undefined,
    rbmStandaloneRichCard: js.UndefOr[Null | IRbmStandaloneCard] = js.undefined,
    rbmText: js.UndefOr[Null | IRbmText] = js.undefined,
    simpleResponses: js.UndefOr[Null | ISimpleResponses] = js.undefined,
    suggestions: js.UndefOr[Null | ISuggestions] = js.undefined,
    tableCard: js.UndefOr[Null | ITableCard] = js.undefined,
    telephonyPlayAudio: js.UndefOr[Null | ITelephonyPlayAudio] = js.undefined,
    telephonySynthesizeSpeech: js.UndefOr[Null | ITelephonySynthesizeSpeech] = js.undefined,
    telephonyTransferCall: js.UndefOr[Null | ITelephonyTransferCall] = js.undefined,
    text: js.UndefOr[Null | IText] = js.undefined
  ): IMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basicCard)) __obj.updateDynamic("basicCard")(basicCard.asInstanceOf[js.Any])
    if (!js.isUndefined(browseCarouselCard)) __obj.updateDynamic("browseCarouselCard")(browseCarouselCard.asInstanceOf[js.Any])
    if (!js.isUndefined(card)) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (!js.isUndefined(carouselSelect)) __obj.updateDynamic("carouselSelect")(carouselSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(linkOutSuggestion)) __obj.updateDynamic("linkOutSuggestion")(linkOutSuggestion.asInstanceOf[js.Any])
    if (!js.isUndefined(listSelect)) __obj.updateDynamic("listSelect")(listSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(mediaContent)) __obj.updateDynamic("mediaContent")(mediaContent.asInstanceOf[js.Any])
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(platform)) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(quickReplies)) __obj.updateDynamic("quickReplies")(quickReplies.asInstanceOf[js.Any])
    if (!js.isUndefined(rbmCarouselRichCard)) __obj.updateDynamic("rbmCarouselRichCard")(rbmCarouselRichCard.asInstanceOf[js.Any])
    if (!js.isUndefined(rbmStandaloneRichCard)) __obj.updateDynamic("rbmStandaloneRichCard")(rbmStandaloneRichCard.asInstanceOf[js.Any])
    if (!js.isUndefined(rbmText)) __obj.updateDynamic("rbmText")(rbmText.asInstanceOf[js.Any])
    if (!js.isUndefined(simpleResponses)) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestions)) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(tableCard)) __obj.updateDynamic("tableCard")(tableCard.asInstanceOf[js.Any])
    if (!js.isUndefined(telephonyPlayAudio)) __obj.updateDynamic("telephonyPlayAudio")(telephonyPlayAudio.asInstanceOf[js.Any])
    if (!js.isUndefined(telephonySynthesizeSpeech)) __obj.updateDynamic("telephonySynthesizeSpeech")(telephonySynthesizeSpeech.asInstanceOf[js.Any])
    if (!js.isUndefined(telephonyTransferCall)) __obj.updateDynamic("telephonyTransferCall")(telephonyTransferCall.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
}

