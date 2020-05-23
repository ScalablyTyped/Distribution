package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmSuggestedActionOpenUri. */
trait IRbmSuggestedActionOpenUri extends js.Object {
  /** RbmSuggestedActionOpenUri uri */
  var uri: js.UndefOr[String | Null] = js.undefined
}

object IRbmSuggestedActionOpenUri {
  @scala.inline
  def apply(uri: js.UndefOr[Null | String] = js.undefined): IRbmSuggestedActionOpenUri = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(uri)) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmSuggestedActionOpenUri]
  }
}

