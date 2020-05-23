package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ListSelect.IItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListSelect. */
trait IListSelect extends js.Object {
  /** ListSelect items */
  var items: js.UndefOr[js.Array[IItem] | Null] = js.undefined
  /** ListSelect subtitle */
  var subtitle: js.UndefOr[String | Null] = js.undefined
  /** ListSelect title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object IListSelect {
  @scala.inline
  def apply(
    items: js.UndefOr[Null | js.Array[IItem]] = js.undefined,
    subtitle: js.UndefOr[Null | String] = js.undefined,
    title: js.UndefOr[Null | String] = js.undefined
  ): IListSelect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitle)) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListSelect]
  }
}

