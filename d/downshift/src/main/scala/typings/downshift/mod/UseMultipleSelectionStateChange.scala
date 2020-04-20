package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<downshift.downshift.UseMultipleSelectionState<Item>> */
trait UseMultipleSelectionStateChange[Item] extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var selectedItems: js.UndefOr[js.Array[Item]] = js.undefined
  var `type`: UseMultipleSelectionStateChangeTypes
}

object UseMultipleSelectionStateChange {
  @scala.inline
  def apply[Item](
    `type`: UseMultipleSelectionStateChangeTypes,
    activeIndex: Int | Double = null,
    selectedItems: js.Array[Item] = null
  ): UseMultipleSelectionStateChange[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionStateChange[Item]]
  }
}

