package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction

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
  def apply(uri: String = null): IRbmSuggestedActionOpenUri = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmSuggestedActionOpenUri]
  }
}

