package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button

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
  def apply(uri: js.UndefOr[Null | String] = js.undefined): IOpenUriAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(uri)) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpenUriAction]
  }
}

