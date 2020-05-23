package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Button. */
trait IButton extends js.Object {
  /** Button postback */
  var postback: js.UndefOr[String | Null] = js.undefined
  /** Button text */
  var text: js.UndefOr[String | Null] = js.undefined
}

object IButton {
  @scala.inline
  def apply(postback: js.UndefOr[Null | String] = js.undefined, text: js.UndefOr[Null | String] = js.undefined): IButton = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(postback)) __obj.updateDynamic("postback")(postback.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButton]
  }
}

