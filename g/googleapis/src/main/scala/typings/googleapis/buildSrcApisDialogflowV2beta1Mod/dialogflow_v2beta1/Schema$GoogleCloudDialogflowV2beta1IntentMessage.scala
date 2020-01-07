package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corresponds to the `Response` field in the Dialogflow console.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1IntentMessage extends js.Object {
  /**
    * Displays a basic card for Actions on Google.
    */
  var basicCard: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCard] = js.native
  /**
    * Displays a card.
    */
  var card: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageCard] = js.native
  /**
    * Displays a carousel card for Actions on Google.
    */
  var carouselSelect: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect] = js.native
  /**
    * Displays an image.
    */
  var image: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageImage] = js.native
  /**
    * Displays a link out suggestion chip for Actions on Google.
    */
  var linkOutSuggestion: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion] = js.native
  /**
    * Displays a list card for Actions on Google.
    */
  var listSelect: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageListSelect] = js.native
  /**
    * Returns a response containing a custom, platform-specific payload. See
    * the Intent.Message.Platform type for a description of the structure that
    * may be required for your platform.
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Optional. The platform that this message is intended for.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Displays quick replies.
    */
  var quickReplies: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageQuickReplies] = js.native
  /**
    * Returns a voice or text-only response for Actions on Google.
    */
  var simpleResponses: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses] = js.native
  /**
    * Displays suggestion chips for Actions on Google.
    */
  var suggestions: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageSuggestions] = js.native
  /**
    * Plays audio from a file in Telephony Gateway.
    */
  var telephonyPlayAudio: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio] = js.native
  /**
    * Synthesizes speech in Telephony Gateway.
    */
  var telephonySynthesizeSpeech: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech] = js.native
  /**
    * Transfers the call in Telephony Gateway.
    */
  var telephonyTransferCall: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall] = js.native
  /**
    * Returns a text response.
    */
  var text: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageText] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1IntentMessage {
  @scala.inline
  def apply(
    basicCard: Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCard = null,
    card: Schema$GoogleCloudDialogflowV2beta1IntentMessageCard = null,
    carouselSelect: Schema$GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect = null,
    image: Schema$GoogleCloudDialogflowV2beta1IntentMessageImage = null,
    linkOutSuggestion: Schema$GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion = null,
    listSelect: Schema$GoogleCloudDialogflowV2beta1IntentMessageListSelect = null,
    payload: StringDictionary[js.Any] = null,
    platform: String = null,
    quickReplies: Schema$GoogleCloudDialogflowV2beta1IntentMessageQuickReplies = null,
    simpleResponses: Schema$GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses = null,
    suggestions: Schema$GoogleCloudDialogflowV2beta1IntentMessageSuggestions = null,
    telephonyPlayAudio: Schema$GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio = null,
    telephonySynthesizeSpeech: Schema$GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech = null,
    telephonyTransferCall: Schema$GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall = null,
    text: Schema$GoogleCloudDialogflowV2beta1IntentMessageText = null
  ): Schema$GoogleCloudDialogflowV2beta1IntentMessage = {
    val __obj = js.Dynamic.literal()
    if (basicCard != null) __obj.updateDynamic("basicCard")(basicCard.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (carouselSelect != null) __obj.updateDynamic("carouselSelect")(carouselSelect.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (linkOutSuggestion != null) __obj.updateDynamic("linkOutSuggestion")(linkOutSuggestion.asInstanceOf[js.Any])
    if (listSelect != null) __obj.updateDynamic("listSelect")(listSelect.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (quickReplies != null) __obj.updateDynamic("quickReplies")(quickReplies.asInstanceOf[js.Any])
    if (simpleResponses != null) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (telephonyPlayAudio != null) __obj.updateDynamic("telephonyPlayAudio")(telephonyPlayAudio.asInstanceOf[js.Any])
    if (telephonySynthesizeSpeech != null) __obj.updateDynamic("telephonySynthesizeSpeech")(telephonySynthesizeSpeech.asInstanceOf[js.Any])
    if (telephonyTransferCall != null) __obj.updateDynamic("telephonyTransferCall")(telephonyTransferCall.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1IntentMessage]
  }
}

