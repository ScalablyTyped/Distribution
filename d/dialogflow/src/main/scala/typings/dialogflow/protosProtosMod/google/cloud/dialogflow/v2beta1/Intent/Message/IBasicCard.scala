package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.IButton
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
    buttons: js.Array[IButton] = null,
    formattedText: String = null,
    image: IImage = null,
    subtitle: String = null,
    title: String = null
  ): IBasicCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (formattedText != null) __obj.updateDynamic("formattedText")(formattedText)
    if (image != null) __obj.updateDynamic("image")(image)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IBasicCard]
  }
}

