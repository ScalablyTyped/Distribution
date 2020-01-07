package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The quick replies response message.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1IntentMessageQuickReplies extends js.Object {
  /**
    * Optional. The collection of quick replies.
    */
  var quickReplies: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The title of the collection of quick replies.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1IntentMessageQuickReplies {
  @scala.inline
  def apply(quickReplies: js.Array[String] = null, title: String = null): Schema$GoogleCloudDialogflowV2beta1IntentMessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    if (quickReplies != null) __obj.updateDynamic("quickReplies")(quickReplies.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1IntentMessageQuickReplies]
  }
}

