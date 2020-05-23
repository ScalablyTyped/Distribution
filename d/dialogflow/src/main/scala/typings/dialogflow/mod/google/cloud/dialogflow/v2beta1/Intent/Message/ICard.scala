package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.Card.IButton
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
    buttons: js.UndefOr[Null | js.Array[IButton]] = js.undefined,
    imageUri: js.UndefOr[Null | String] = js.undefined,
    subtitle: js.UndefOr[Null | String] = js.undefined,
    title: js.UndefOr[Null | String] = js.undefined
  ): ICard = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(imageUri)) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitle)) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICard]
  }
}

