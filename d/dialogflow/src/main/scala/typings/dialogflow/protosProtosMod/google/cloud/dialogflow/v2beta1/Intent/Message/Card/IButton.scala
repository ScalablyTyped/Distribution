package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Card

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
  def apply(postback: String = null, text: String = null): IButton = {
    val __obj = js.Dynamic.literal()
    if (postback != null) __obj.updateDynamic("postback")(postback.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButton]
  }
}

