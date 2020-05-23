package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.Button.IOpenUriAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Button. */
trait IButton extends js.Object {
  /** Button openUriAction */
  var openUriAction: js.UndefOr[IOpenUriAction | Null] = js.undefined
  /** Button title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object IButton {
  @scala.inline
  def apply(
    openUriAction: js.UndefOr[Null | IOpenUriAction] = js.undefined,
    title: js.UndefOr[Null | String] = js.undefined
  ): IButton = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(openUriAction)) __obj.updateDynamic("openUriAction")(openUriAction.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButton]
  }
}

