package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corresponds to the `Response` field in the Dialogflow console.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessage extends js.Object {
  /**
    * The basic card response for Actions on Google.
    */
  var basicCard: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageBasicCard] = js.native
  /**
    * The card response.
    */
  var card: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageCard] = js.native
  /**
    * The carousel card response for Actions on Google.
    */
  var carouselSelect: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelect] = js.native
  /**
    * The image response.
    */
  var image: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageImage] = js.native
  /**
    * The link out suggestion chip for Actions on Google.
    */
  var linkOutSuggestion: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] = js.native
  /**
    * The list card response for Actions on Google.
    */
  var listSelect: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageListSelect] = js.native
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
    * The quick replies response.
    */
  var quickReplies: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageQuickReplies] = js.native
  /**
    * The voice and text-only responses for Actions on Google.
    */
  var simpleResponses: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponses] = js.native
  /**
    * The suggestion chips for Actions on Google.
    */
  var suggestions: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageSuggestions] = js.native
  /**
    * The text response.
    */
  var text: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageText] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessage {
  @scala.inline
  def apply(
    basicCard: Schema$GoogleCloudDialogflowV2IntentMessageBasicCard = null,
    card: Schema$GoogleCloudDialogflowV2IntentMessageCard = null,
    carouselSelect: Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelect = null,
    image: Schema$GoogleCloudDialogflowV2IntentMessageImage = null,
    linkOutSuggestion: Schema$GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion = null,
    listSelect: Schema$GoogleCloudDialogflowV2IntentMessageListSelect = null,
    payload: StringDictionary[js.Any] = null,
    platform: String = null,
    quickReplies: Schema$GoogleCloudDialogflowV2IntentMessageQuickReplies = null,
    simpleResponses: Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponses = null,
    suggestions: Schema$GoogleCloudDialogflowV2IntentMessageSuggestions = null,
    text: Schema$GoogleCloudDialogflowV2IntentMessageText = null
  ): Schema$GoogleCloudDialogflowV2IntentMessage = {
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
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessage]
  }
}

