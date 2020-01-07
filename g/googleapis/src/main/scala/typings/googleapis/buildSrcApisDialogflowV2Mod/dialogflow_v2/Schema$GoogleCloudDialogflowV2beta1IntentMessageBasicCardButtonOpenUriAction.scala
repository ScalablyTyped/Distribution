package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Opens the given URI.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction extends js.Object {
  /**
    * Required. The HTTP or HTTPS scheme URI.
    */
  var uri: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction {
  @scala.inline
  def apply(uri: String = null): Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction]
  }
}

