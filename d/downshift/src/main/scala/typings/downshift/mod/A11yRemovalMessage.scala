package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A11yRemovalMessage[Item] extends js.Object {
  var activeIndex: Double
  var activeSelectedItem: Item
  var removedSelectedItem: Item
  var resultCount: Double
  def itemToString(item: Item): String
}

object A11yRemovalMessage {
  @scala.inline
  def apply[Item](
    activeIndex: Double,
    activeSelectedItem: Item,
    itemToString: Item => String,
    removedSelectedItem: Item,
    resultCount: Double
  ): A11yRemovalMessage[Item] = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], activeSelectedItem = activeSelectedItem.asInstanceOf[js.Any], itemToString = js.Any.fromFunction1(itemToString), removedSelectedItem = removedSelectedItem.asInstanceOf[js.Any], resultCount = resultCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11yRemovalMessage[Item]]
  }
}

