package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IFollowupIntentInfo
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IMessage
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.IParameter
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.ITrainingPhrase
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.WebhookState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Intent. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent")
@js.native
/**
  * Constructs a new Intent.
  * @param [properties] Properties to set
  */
class Intent_ () extends IIntent {
  def this(properties: IIntent) = this()
  /** Intent action. */
  @JSName("action")
  var action_Intent_ : String = js.native
  /** Intent defaultResponsePlatforms. */
  @JSName("defaultResponsePlatforms")
  var defaultResponsePlatforms_Intent_ : js.Array[Platform] = js.native
  /** Intent displayName. */
  @JSName("displayName")
  var displayName_Intent_ : String = js.native
  /** Intent events. */
  @JSName("events")
  var events_Intent_ : js.Array[String] = js.native
  /** Intent followupIntentInfo. */
  @JSName("followupIntentInfo")
  var followupIntentInfo_Intent_ : js.Array[IFollowupIntentInfo] = js.native
  /** Intent inputContextNames. */
  @JSName("inputContextNames")
  var inputContextNames_Intent_ : js.Array[String] = js.native
  /** Intent isFallback. */
  @JSName("isFallback")
  var isFallback_Intent_ : Boolean = js.native
  /** Intent messages. */
  @JSName("messages")
  var messages_Intent_ : js.Array[IMessage] = js.native
  /** Intent mlDisabled. */
  @JSName("mlDisabled")
  var mlDisabled_Intent_ : Boolean = js.native
  /** Intent name. */
  @JSName("name")
  var name_Intent_ : String = js.native
  /** Intent outputContexts. */
  @JSName("outputContexts")
  var outputContexts_Intent_ : js.Array[IContext] = js.native
  /** Intent parameters. */
  @JSName("parameters")
  var parameters_Intent_ : js.Array[IParameter] = js.native
  /** Intent parentFollowupIntentName. */
  @JSName("parentFollowupIntentName")
  var parentFollowupIntentName_Intent_ : String = js.native
  /** Intent priority. */
  @JSName("priority")
  var priority_Intent_ : Double = js.native
  /** Intent resetContexts. */
  @JSName("resetContexts")
  var resetContexts_Intent_ : Boolean = js.native
  /** Intent rootFollowupIntentName. */
  @JSName("rootFollowupIntentName")
  var rootFollowupIntentName_Intent_ : String = js.native
  /** Intent trainingPhrases. */
  @JSName("trainingPhrases")
  var trainingPhrases_Intent_ : js.Array[ITrainingPhrase] = js.native
  /** Intent webhookState. */
  @JSName("webhookState")
  var webhookState_Intent_ : WebhookState | String = js.native
  /**
    * Converts this Intent to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

