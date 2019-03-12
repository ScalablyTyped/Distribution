package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A11yStatusMessageOptions[Item] extends js.Object {
  var highlightedIndex: scala.Double | scala.Null
  var highlightedItem: Item
  var inputValue: java.lang.String
  var isOpen: scala.Boolean
  var previousResultCount: scala.Double
  var resultCount: scala.Double
  var selectedItem: Item
  def itemToString(item: Item): java.lang.String
}

object A11yStatusMessageOptions {
  @scala.inline
  def apply[Item](
    highlightedItem: Item,
    inputValue: java.lang.String,
    isOpen: scala.Boolean,
    itemToString: Item => java.lang.String,
    previousResultCount: scala.Double,
    resultCount: scala.Double,
    selectedItem: Item,
    highlightedIndex: scala.Int | scala.Double = null
  ): A11yStatusMessageOptions[Item] = {
    val __obj = js.Dynamic.literal(highlightedItem = highlightedItem.asInstanceOf[js.Any], inputValue = inputValue, isOpen = isOpen, itemToString = js.Any.fromFunction1(itemToString), previousResultCount = previousResultCount, resultCount = resultCount, selectedItem = selectedItem.asInstanceOf[js.Any])
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11yStatusMessageOptions[Item]]
  }
}

