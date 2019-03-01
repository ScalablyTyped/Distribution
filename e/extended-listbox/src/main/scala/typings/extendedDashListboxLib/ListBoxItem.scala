package typings
package extendedDashListboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxItem extends js.Object {
  /** list of childItems */
  var childItems: js.UndefOr[js.Array[java.lang.String | ListBoxItem]] = js.undefined
  /** determines if the item should be clickable */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** determines if the item has childItems */
  var groupHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** unique identifier, if not set it will be generated */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** index position from the item in the list; only used for manual addItem api calls */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** display text or id of the parent; only used for manual addItem api calls */
  var parentGroupId: js.UndefOr[java.lang.String] = js.undefined
  /** determines if the item is selected */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /** display text */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ListBoxItem {
  @scala.inline
  def apply(
    childItems: js.Array[java.lang.String | ListBoxItem] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    groupHeader: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    parentGroupId: java.lang.String = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null
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

