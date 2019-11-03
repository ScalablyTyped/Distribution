package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionDial
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionOpenUri
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionShareLocation
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
    dial: IRbmSuggestedActionDial = null,
    openUrl: IRbmSuggestedActionOpenUri = null,
    postbackData: String = null,
    shareLocation: IRbmSuggestedActionShareLocation = null,
    text: String = null
  ): IRbmSuggestedAction = {
    val __obj = js.Dynamic.literal()
    if (dial != null) __obj.updateDynamic("dial")(dial)
    if (openUrl != null) __obj.updateDynamic("openUrl")(openUrl)
    if (postbackData != null) __obj.updateDynamic("postbackData")(postbackData)
    if (shareLocation != null) __obj.updateDynamic("shareLocation")(shareLocation)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[IRbmSuggestedAction]
  }
}

