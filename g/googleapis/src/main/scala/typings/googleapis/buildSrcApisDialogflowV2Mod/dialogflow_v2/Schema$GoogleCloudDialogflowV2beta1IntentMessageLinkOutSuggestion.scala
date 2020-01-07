package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The suggestion chip message that allows the user to jump out to the app or
  * website associated with this agent.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion extends js.Object {
  /**
    * Required. The name of the app or site this chip is linking to.
    */
  var destinationName: js.UndefOr[String] = js.native
  /**
    * Required. The URI of the app or site to open when the user taps the
    * suggestion chip.
    */
  var uri: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion {
  @scala.inline
  def apply(destinationName: String = null, uri: String = null): Schema$GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion]
  }
}

