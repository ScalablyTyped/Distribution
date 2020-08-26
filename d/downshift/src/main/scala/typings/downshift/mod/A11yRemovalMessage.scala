package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A11yRemovalMessage[Item] extends js.Object {
  var activeIndex: Double = js.native
  var activeSelectedItem: Item = js.native
  var removedSelectedItem: Item = js.native
  var resultCount: Double = js.native
  def itemToString(item: Item): String = js.native
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
  @scala.inline
  implicit class A11yRemovalMessageOps[Self <: A11yRemovalMessage[_], Item] (val x: Self with A11yRemovalMessage[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveSelectedItem(value: Item): Self = this.set("activeSelectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemToString(value: Item => String): Self = this.set("itemToString", js.Any.fromFunction1(value))
    @scala.inline
    def setRemovedSelectedItem(value: Item): Self = this.set("removedSelectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultCount(value: Double): Self = this.set("resultCount", value.asInstanceOf[js.Any])
  }
  
}

