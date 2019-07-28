package typings.extendedDashListbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxItem extends js.Object {
  /** list of childItems */
  var childItems: js.UndefOr[js.Array[String | ListBoxItem]] = js.undefined
  /** determines if the item should be clickable */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** determines if the item has childItems */
  var groupHeader: js.UndefOr[Boolean] = js.undefined
  /** unique identifier, if not set it will be generated */
  var id: js.UndefOr[String] = js.undefined
  /** index position from the item in the list; only used for manual addItem api calls */
  var index: js.UndefOr[Double] = js.undefined
  /** display text or id of the parent; only used for manual addItem api calls */
  var parentGroupId: js.UndefOr[String] = js.undefined
  /** determines if the item is selected */
  var selected: js.UndefOr[Boolean] = js.undefined
  /** display text */
  var text: js.UndefOr[String] = js.undefined
}

object ListBoxItem {
  @scala.inline
  def apply(
    childItems: js.Array[String | ListBoxItem] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    groupHeader: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    index: Int | Double = null,
    parentGroupId: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    text: String = null
  ): ListBoxItem = {
    val __obj = js.Dynamic.literal()
    if (childItems != null) __obj.updateDynamic("childItems")(childItems)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(groupHeader)) __obj.updateDynamic("groupHeader")(groupHeader)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentGroupId != null) __obj.updateDynamic("parentGroupId")(parentGroupId)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ListBoxItem]
  }
}

