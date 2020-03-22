package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.basicCard
import typings.dialogflow.dialogflowStrings.browseCarouselCard
import typings.dialogflow.dialogflowStrings.card
import typings.dialogflow.dialogflowStrings.carouselSelect
import typings.dialogflow.dialogflowStrings.image
import typings.dialogflow.dialogflowStrings.linkOutSuggestion
import typings.dialogflow.dialogflowStrings.listSelect
import typings.dialogflow.dialogflowStrings.mediaContent
import typings.dialogflow.dialogflowStrings.payload
import typings.dialogflow.dialogflowStrings.quickReplies
import typings.dialogflow.dialogflowStrings.rbmCarouselRichCard
import typings.dialogflow.dialogflowStrings.rbmStandaloneRichCard
import typings.dialogflow.dialogflowStrings.rbmText
import typings.dialogflow.dialogflowStrings.simpleResponses
import typings.dialogflow.dialogflowStrings.suggestions
import typings.dialogflow.dialogflowStrings.tableCard
import typings.dialogflow.dialogflowStrings.telephonyPlayAudio
import typings.dialogflow.dialogflowStrings.telephonySynthesizeSpeech
import typings.dialogflow.dialogflowStrings.telephonyTransferCall
import typings.dialogflow.dialogflowStrings.text
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Message. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message")
@js.native
/**
  * Constructs a new Message.
  * @param [properties] Properties to set
  */
class Message_ () extends IMessage {
  def this(properties: IMessage) = this()
  /** Message message. */
  var message: js.UndefOr[
    text | image | quickReplies | card | payload | simpleResponses | basicCard | suggestions | linkOutSuggestion | listSelect | carouselSelect | telephonyPlayAudio | telephonySynthesizeSpeech | telephonyTransferCall | rbmText | rbmStandaloneRichCard | rbmCarouselRichCard | browseCarouselCard | tableCard | mediaContent
  ] = js.native
  /** Message platform. */
  @JSName("platform")
  var platform_Message_ : Platform | String = js.native
  /**
    * Converts this Message to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

