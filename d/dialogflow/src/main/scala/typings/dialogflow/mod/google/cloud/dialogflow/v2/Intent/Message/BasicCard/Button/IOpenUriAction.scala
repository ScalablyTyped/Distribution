package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard.Button

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OpenUriAction. */
trait IOpenUriAction extends js.Object {
  /** OpenUriAction uri */
  var uri: js.UndefOr[String | Null] = js.undefined
}

object IOpenUriAction {
  @scala.inline
  def apply(uri: String = null): IOpenUriAction = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpenUriAction]
  }
}

