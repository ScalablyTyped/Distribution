package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListSelect. */
trait IListSelect extends js.Object {
  /** ListSelect items */
  var items: js.UndefOr[js.Array[IItem] | Null] = js.undefined
  /** ListSelect title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object IListSelect {
  @scala.inline
  def apply(items: js.Array[IItem] = null, title: String = null): IListSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListSelect]
  }
}

