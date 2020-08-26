package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsValue extends js.Object {
  var items: js.UndefOr[js.Array[Double]] = js.native
  var value: js.UndefOr[Double] = js.native
}

object ItemsValue {
  @scala.inline
  def apply(): ItemsValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsValue]
  }
  @scala.inline
  implicit class ItemsValueOps[Self <: ItemsValue] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Double*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Double]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

