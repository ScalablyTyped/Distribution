package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BasicCard.IButton
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
    buttons: js.Array[IButton] = null,
    columnProperties: js.Array[IColumnProperties] = null,
    image: IImage = null,
    rows: js.Array[ITableCardRow] = null,
    subtitle: String = null,
    title: String = null
  ): ITableCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (columnProperties != null) __obj.updateDynamic("columnProperties")(columnProperties.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableCard]
  }
}

