package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BasicCard. */
trait IBasicCard extends js.Object {
  /** BasicCard buttons */
  var buttons: js.UndefOr[js.Array[IButton] | Null] = js.undefined
  /** BasicCard formattedText */
  var formattedText: js.UndefOr[String | Null] = js.undefined
  /** BasicCard image */
  var image: js.UndefOr[IImage | Null] = js.undefined
  /** BasicCard subtitle */
  var subtitle: js.UndefOr[String | Null] = js.undefined
  /** BasicCard title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object IBasicCard {
  @scala.inline
  def apply(
    buttons: js.UndefOr[Null | js.Array[IButton]] = js.undefined,
    formattedText: js.UndefOr[Null | String] = js.undefined,
    image: js.UndefOr[Null | IImage] = js.undefined,
    subtitle: js.UndefOr[Null | String] = js.undefined,
    title: js.UndefOr[Null | String] = js.undefined
  ): IBasicCard = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(formattedText)) __obj.updateDynamic("formattedText")(formattedText.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitle)) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasicCard]
  }
}

