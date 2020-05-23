package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TableCard. */
trait ITableCard extends js.Object {
  /** TableCard buttons */
  var buttons: js.UndefOr[js.Array[IButton] | Null] = js.undefined
  /** TableCard columnProperties */
  var columnProperties: js.UndefOr[js.Array[IColumnProperties] | Null] = js.undefined
  /** TableCard image */
  var image: js.UndefOr[IImage | Null] = js.undefined
  /** TableCard rows */
  var rows: js.UndefOr[js.Array[ITableCardRow] | Null] = js.undefined
  /** TableCard subtitle */
  var subtitle: js.UndefOr[String | Null] = js.undefined
  /** TableCard title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object ITableCard {
  @scala.inline
  def apply(
    buttons: js.UndefOr[Null | js.Array[IButton]] = js.undefined,
    columnProperties: js.UndefOr[Null | js.Array[IColumnProperties]] = js.undefined,
    image: js.UndefOr[Null | IImage] = js.undefined,
    rows: js.UndefOr[Null | js.Array[ITableCardRow]] = js.undefined,
    subtitle: js.UndefOr[Null | String] = js.undefined,
    title: js.UndefOr[Null | String] = js.undefined
  ): ITableCard = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(columnProperties)) __obj.updateDynamic("columnProperties")(columnProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitle)) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableCard]
  }
}

