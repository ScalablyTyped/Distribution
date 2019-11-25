package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Card. */
trait ICard extends js.Object {
  /** Card buttons */
  var buttons: js.UndefOr[js.Array[IButton] | Null] = js.undefined
  /** Card imageUri */
  var imageUri: js.UndefOr[String | Null] = js.undefined
  /** Card subtitle */
  var subtitle: js.UndefOr[String | Null] = js.undefined
  /** Card title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object ICard {
  @scala.inline
  def apply(
    buttons: js.Array[IButton] = null,
    imageUri: String = null,
    subtitle: String = null,
    title: String = null
  ): ICard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICard]
  }
}

