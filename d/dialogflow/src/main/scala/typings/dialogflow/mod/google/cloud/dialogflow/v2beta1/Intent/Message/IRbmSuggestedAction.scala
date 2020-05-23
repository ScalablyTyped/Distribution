package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionDial
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionOpenUri
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionShareLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmSuggestedAction. */
trait IRbmSuggestedAction extends js.Object {
  /** RbmSuggestedAction dial */
  var dial: js.UndefOr[IRbmSuggestedActionDial | Null] = js.undefined
  /** RbmSuggestedAction openUrl */
  var openUrl: js.UndefOr[IRbmSuggestedActionOpenUri | Null] = js.undefined
  /** RbmSuggestedAction postbackData */
  var postbackData: js.UndefOr[String | Null] = js.undefined
  /** RbmSuggestedAction shareLocation */
  var shareLocation: js.UndefOr[IRbmSuggestedActionShareLocation | Null] = js.undefined
  /** RbmSuggestedAction text */
  var text: js.UndefOr[String | Null] = js.undefined
}

object IRbmSuggestedAction {
  @scala.inline
  def apply(
    dial: js.UndefOr[Null | IRbmSuggestedActionDial] = js.undefined,
    openUrl: js.UndefOr[Null | IRbmSuggestedActionOpenUri] = js.undefined,
    postbackData: js.UndefOr[Null | String] = js.undefined,
    shareLocation: js.UndefOr[Null | IRbmSuggestedActionShareLocation] = js.undefined,
    text: js.UndefOr[Null | String] = js.undefined
  ): IRbmSuggestedAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dial)) __obj.updateDynamic("dial")(dial.asInstanceOf[js.Any])
    if (!js.isUndefined(openUrl)) __obj.updateDynamic("openUrl")(openUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(postbackData)) __obj.updateDynamic("postbackData")(postbackData.asInstanceOf[js.Any])
    if (!js.isUndefined(shareLocation)) __obj.updateDynamic("shareLocation")(shareLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmSuggestedAction]
  }
}

