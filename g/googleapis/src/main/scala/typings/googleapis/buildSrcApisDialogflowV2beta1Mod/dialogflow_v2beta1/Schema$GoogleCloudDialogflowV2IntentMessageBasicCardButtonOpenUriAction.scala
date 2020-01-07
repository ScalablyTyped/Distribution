package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Opens the given URI.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction extends js.Object {
  /**
    * Required. The HTTP or HTTPS scheme URI.
    */
  var uri: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction {
  @scala.inline
  def apply(uri: String = null): Schema$GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction]
  }
}

