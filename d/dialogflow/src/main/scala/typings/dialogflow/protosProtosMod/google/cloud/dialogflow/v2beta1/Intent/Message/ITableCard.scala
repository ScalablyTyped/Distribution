package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.IButton
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
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (columnProperties != null) __obj.updateDynamic("columnProperties")(columnProperties)
    if (image != null) __obj.updateDynamic("image")(image)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ITableCard]
  }
}

